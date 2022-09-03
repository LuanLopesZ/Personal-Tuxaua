package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Coluna;

public class ColunaDAO {
	
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
	public static Coluna insertColuna(int idAntropometriaGeral,boolean alinhadaCO, boolean escolioseLombarDir, boolean escolioseLombarEsq,
			boolean escolioseToracicaDir, boolean escolioseToracicaEsq, boolean escolioseDorsoLombarDir,
			boolean escolioseDorsoLombarEsq, boolean escolioseEmS) {
		createConnection();

		Coluna coluna = null;
		try {

			PreparedStatement user = conn.prepareStatement(
					"insert into coluna(idAntropometriaGeral,alinhada,escolioseLombarDir, escolioseLombarEsq,escolioseToracicaDir, escolioseToracicaEsq,escolioseDorsoLombarDir,escolioseDorsoLombarEsq,escolioseEmS)values(?,?,?,?,?,?,?,?,?)");

			user.setInt(1,idAntropometriaGeral);
			user.setBoolean(2, alinhadaCO);
			user.setBoolean(3, escolioseLombarDir);
			user.setBoolean(4, escolioseLombarEsq);
			user.setBoolean(5, escolioseToracicaDir);
			user.setBoolean(6, escolioseToracicaEsq);
			user.setBoolean(7, escolioseDorsoLombarDir);
			user.setBoolean(8, escolioseDorsoLombarEsq);
			user.setBoolean(9, escolioseEmS);

			user.executeUpdate();

			

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}
		// shutdown(); Desliga conex�o com o banco
		coluna = new Coluna(idAntropometriaGeral,alinhadaCO, escolioseLombarDir, escolioseLombarEsq, escolioseToracicaDir,
				escolioseToracicaEsq, escolioseDorsoLombarDir, escolioseDorsoLombarEsq, escolioseEmS);
		return coluna;

	}
}
