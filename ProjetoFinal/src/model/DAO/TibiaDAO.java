package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Tibia;

public class TibiaDAO {

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

	public static Tibia insertTibia(int idAntropometriaGeral,boolean alinhada, boolean esqVara, boolean dirVara, boolean esqValgo,
			boolean dirValgo) {
		createConnection();

		Tibia tibia = null;
		try {

			PreparedStatement user = conn.prepareStatement(
					"insert into tibia(idAntropometriaGeral,alinhada,esqVara, dirVara,esqValgo, dirValgo)values(?,?,?,?,?,?)");

			user.setInt(1,idAntropometriaGeral);
			user.setBoolean(2, alinhada);
			user.setBoolean(3, esqVara);
			user.setBoolean(4, dirVara);
			user.setBoolean(5, esqValgo);
			user.setBoolean(6, dirValgo);

			user.executeUpdate();

			

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}
		// shutdown(); Desliga conex�o com o banco
		tibia = new Tibia(idAntropometriaGeral,alinhada, esqVara, dirVara, esqValgo, dirValgo);
		return tibia;

	}

}
