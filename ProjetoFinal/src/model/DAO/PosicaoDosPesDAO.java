package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.PosicaoPes;

public class PosicaoDosPesDAO {

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
	
	public static PosicaoPes insertPosicaoPes(int idAntropometriaGeral,boolean esqPronado, boolean dirSupinado, boolean alinhado,
			boolean esqSupinado, boolean dirPronado) {
		createConnection();

		PosicaoPes posicaopes = null;
		try {

			PreparedStatement user = conn.prepareStatement(
					"insert into posicaoDosPes(idAntropometriaGeral,esqPronado, dirSupinado, alinhado, esqSupinado ,dirPronado)values(?,?,?,?,?,?)");

			user.setInt(1,idAntropometriaGeral);
			user.setBoolean(2, esqPronado);
			user.setBoolean(3, dirSupinado);
			user.setBoolean(4, alinhado);
			user.setBoolean(5, esqSupinado);
			user.setBoolean(6, dirPronado);

			user.executeUpdate();

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}
		// shutdown(); Desliga conex�o com o banco
		posicaopes = new PosicaoPes(idAntropometriaGeral,esqPronado, dirSupinado, alinhado, esqSupinado, dirPronado);
		return posicaopes;

	}

}
