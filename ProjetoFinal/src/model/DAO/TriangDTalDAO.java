package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.TriangDTal;

public class TriangDTalDAO {
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


	public static TriangDTal insertTriangDTal(int idAntropometriaGeral,boolean simetricos, boolean agudosADir, boolean agudosAEsq) {
		createConnection();

		TriangDTal triangDTal = null;
		try {

			PreparedStatement user = conn
					.prepareStatement("insert into trianguloDeTalis(idAntropometriaGeral,simetricos, agudosADir,agudosAEsq )values(?,?,?,?)");

			user.setInt(1,idAntropometriaGeral);
			user.setBoolean(2, simetricos);
			user.setBoolean(3, agudosADir);
			user.setBoolean(4, agudosAEsq);

			user.executeUpdate();

			

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}
		triangDTal = new TriangDTal(idAntropometriaGeral,simetricos, agudosADir, agudosADir);
		return triangDTal;

	}

	
}
