package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Femur;

public class FemurDAO {
	
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

	public static Femur insertFemur(int idAntropometriaGeral,boolean torcaoInterna, boolean torcaoExterna) {
		createConnection();

		Femur femur = null;
		try {

			PreparedStatement user = conn.prepareStatement("insert into femur(idAntropometriaGeral,torcaoInterna,torcaoExterna)values(?,?,?)");
           
			user.setInt(1,idAntropometriaGeral);
			user.setBoolean(2, torcaoInterna);
			user.setBoolean(3, torcaoExterna);

			user.executeUpdate();


		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}
		// shutdown(); Desliga conex�o com o banco
		femur = new Femur(idAntropometriaGeral,torcaoInterna, torcaoExterna);
		return femur;

	}

}
