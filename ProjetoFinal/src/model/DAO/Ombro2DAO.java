package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Ombro2;

public class Ombro2DAO {
	
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

	
	public static Ombro2 insertOmbroVA(int idAntropometriaGeral,boolean alinhadoOm, boolean esqDeprimidoOm, boolean dirDeprimidoOm) {
		createConnection();

		Ombro2 ombro2 = null;
		try {

			PreparedStatement user = conn
					.prepareStatement("insert into ombroVA(idAntropometriaGeral,alinhado,esqDeprimido,dirDeprimido)values(?,?,?,?)");

			user.setInt(1,idAntropometriaGeral);
			user.setBoolean(2, alinhadoOm);
			user.setBoolean(3, esqDeprimidoOm);
			user.setBoolean(4, dirDeprimidoOm);

			user.executeUpdate();


		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}
		// shutdown(); Desliga conex�o com o banco
		ombro2 = new Ombro2(idAntropometriaGeral,alinhadoOm, esqDeprimidoOm, dirDeprimidoOm);
		return ombro2;

	}
}
