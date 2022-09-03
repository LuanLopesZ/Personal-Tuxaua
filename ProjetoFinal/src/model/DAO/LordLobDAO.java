package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.LordLob;

public class LordLobDAO {
	
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
	
	public static LordLob insertLordoseLombar(int idAntropometriaGeral,boolean fisiologicaLL, boolean aumentadaLL, boolean retificadaLL) {
		createConnection();

		LordLob lordLob = null;
		try {

			PreparedStatement user = conn
					.prepareStatement("insert into lordoseLombar(idAntropometriaGeral,fisiologica, aumentada,retificada)values(?,?,?,?)");
            
			user.setInt(1,idAntropometriaGeral);
			user.setBoolean(2, fisiologicaLL);
			user.setBoolean(3, aumentadaLL);
			user.setBoolean(4, retificadaLL);

			user.executeUpdate();

			

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}
		lordLob = new LordLob(idAntropometriaGeral,fisiologicaLL, aumentadaLL, retificadaLL);
		return lordLob;

	}

}
