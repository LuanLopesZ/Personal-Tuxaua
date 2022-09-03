package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.AntropometriaCircunferenciasMusculares;
import model.AntropometriaGeral;


public class AntropometriaCircunferenciasMuscularesDAO {
	private static String dbURL = "jdbc:derby://localhost:1527/personalTuxaua;create=true;user=personal;password=1234";
	// jdbc Connection
	private static Connection conn = null;
	private static Statement stmt = null;
	ObservableList<String> CheckBoxList = FXCollections.observableArrayList();

	public static void createConnection() {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
			// Get a connection
			conn = DriverManager.getConnection(dbURL);
		} catch (Exception except) {
			except.printStackTrace();
		}
	}
	
	public static AntropometriaCircunferenciasMusculares insertCincun(int idAntropometriaGeral,double ombro, double torax, double busto, double bracoDir, double antBracDir,
			double bracoEsq, double antBracEsq, double cintura, double abdomen, double quadril, double coxaDir,
			double coxaEsq, double pernaEsq, double pernaDir) {
		createConnection();

		AntropometriaCircunferenciasMusculares antropometriaCircunferenciasMusculares = null;
		try {

			PreparedStatement user = conn.prepareStatement(
					"insert into antropometriaCircunferenciasMusculares(idAntropometriaGeral,ombro, torax,busto,bracoDireito,quadril, coxaDireita,coxaEsquerda, pernaEsquerda,pernaDireita,abdomen, cintura,antebracoEsquerdo,antebracoDireito,bracoEsquerdo)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			user.setInt(1,idAntropometriaGeral);
			user.setDouble(2, ombro);
			user.setDouble(3, torax);
			user.setDouble(4, busto);
			user.setDouble(5, bracoDir);
			user.setDouble(6, quadril);
			user.setDouble(7, coxaDir);
			user.setDouble(8, coxaEsq);
			user.setDouble(9, pernaEsq);
			user.setDouble(10, pernaDir);
			user.setDouble(11, abdomen);
			user.setDouble(12, cintura);
			user.setDouble(13, antBracEsq);
			user.setDouble(14, antBracDir);
			user.setDouble(15, bracoEsq);

			user.executeUpdate();


		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		// shutdown(); Desliga conex�o com o banco
		antropometriaCircunferenciasMusculares = new AntropometriaCircunferenciasMusculares(idAntropometriaGeral,ombro, torax, busto, bracoDir, quadril, coxaDir, coxaEsq, pernaEsq, pernaDir, abdomen,
				cintura, antBracEsq, antBracDir, bracoEsq);
		return antropometriaCircunferenciasMusculares;

	}
}
