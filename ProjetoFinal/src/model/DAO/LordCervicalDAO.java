package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.LordCervical;

public class LordCervicalDAO {
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

	public static LordCervical insertlordoseCervical(int idAntropometriaGeral,boolean fisiologica, boolean aumentada, boolean retificada) {
		createConnection();

		LordCervical lordCervical = null;
		try {

			PreparedStatement user = conn
					.prepareStatement("insert into lordoseCervical(idAntropometriaGeral,fisiologica, aumentada,retificada )values(?,?,?,?)");
			
			user.setInt(1,idAntropometriaGeral);
			user.setBoolean(2, fisiologica);
			user.setBoolean(3, aumentada);
			user.setBoolean(4, retificada);

			user.executeUpdate();

			

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}
		lordCervical = new LordCervical(idAntropometriaGeral,fisiologica, aumentada, retificada);
		return lordCervical;

	}
}
