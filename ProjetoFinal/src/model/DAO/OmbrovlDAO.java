package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Ombrovl;

public class OmbrovlDAO {

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
	
	public static Ombrovl insertOmbrovl(int idAntropometriaGeral,boolean alinhadoOmvl, boolean protusos, boolean retraidos) {
		createConnection();

		Ombrovl ombrovl = null;
		try {

			PreparedStatement user = conn
					.prepareStatement("insert into ombroVL(idAntropometriaGeral,alinhado, protusos, retraidos)values(?,?,?,?)");

			user.setInt(1,idAntropometriaGeral);
			user.setBoolean(2, alinhadoOmvl);
			user.setBoolean(3, protusos);
			user.setBoolean(4, retraidos);

			user.executeUpdate();

			

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}
		ombrovl = new Ombrovl(idAntropometriaGeral,alinhadoOmvl, protusos, retraidos);
		return ombrovl;

	}

}
