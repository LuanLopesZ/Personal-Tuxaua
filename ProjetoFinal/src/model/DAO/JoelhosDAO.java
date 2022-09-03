package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Joelhos;

public class JoelhosDAO {

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

	public static Joelhos insertJoelhos(int idAntropometriaGeral,boolean alinhados, boolean esqVaraJ, boolean dirVaraJ, boolean esqValgoJ,
			boolean dirValgoJ) {
		createConnection();

		Joelhos joelhos = null;
		try {

			PreparedStatement user = conn.prepareStatement(
					"insert into joelhosVA(idAntropometriaGeral,alinhados,esqVara, dirVara,esqValgo, dirValgo)values(?,?,?,?,?,?)");
            
			user.setInt(1,idAntropometriaGeral);
			user.setBoolean(2, alinhados);
			user.setBoolean(3, esqVaraJ);
			user.setBoolean(4, dirVaraJ);
			user.setBoolean(5, esqValgoJ);
			user.setBoolean(6, dirValgoJ);

			user.executeUpdate();


		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}
		// shutdown(); Desliga conex�o com o banco
		joelhos = new Joelhos(idAntropometriaGeral,alinhados, esqVaraJ, dirVaraJ, esqValgoJ, dirValgoJ);
		return joelhos;

	}

}
