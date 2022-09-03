package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import model.antropometriaDobrasCutaneas;

public class AntropometriaDobrasCutaneasDAO {
	
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


	public static antropometriaDobrasCutaneas insertDobrascir(int idAntropometriaGeral,double suprailiacaF,double abdominalF,double coxaAnteriorF,double tricF, double subCapF, double bicipitalF,double axilarMediaF, double pernaF, double peitoralF
			) {
		createConnection();

		antropometriaDobrasCutaneas antropometriaDobrasCutaneas = null;
		try {

			PreparedStatement user = conn.prepareStatement(
					"insert into antropometriaDobrasCutaneas(idAntropometriaGeral,suprailiaca, abdominal, coxaAnterior,tricipital, subescapular, bicipital, axilarMedia, perna , peitoral)values(?,?,?,?,?,?,?,?,?,?)");
			
			user.setInt(1,idAntropometriaGeral);
			user.setDouble(2, suprailiacaF);
			user.setDouble(3, abdominalF);
			user.setDouble(4, coxaAnteriorF);
			user.setDouble(5, tricF);
			user.setDouble(6, subCapF);
			user.setDouble(7, bicipitalF);
			user.setDouble(8, axilarMediaF);
			user.setDouble(9, pernaF);
			user.setDouble(10, peitoralF);

			user.executeUpdate();


		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		// shutdown(); Desliga conex�o com o banco
		antropometriaDobrasCutaneas= new antropometriaDobrasCutaneas(idAntropometriaGeral,suprailiacaF, abdominalF, coxaAnteriorF, tricF, subCapF, bicipitalF, axilarMediaF,
				pernaF, peitoralF);
		return antropometriaDobrasCutaneas;

	}	
}
