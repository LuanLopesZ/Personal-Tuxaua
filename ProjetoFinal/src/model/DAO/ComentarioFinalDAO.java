package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import model.ComentarioFinal;

public class ComentarioFinalDAO {
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

	public static ComentarioFinal insertComentFi(int idAntropometriaGeral,String observacaoA, String objetivoA,
			String periodicidadeA, String atividPretAcadF) {
		createConnection();

		ComentarioFinal comentarioFinal = null;
		try {

			PreparedStatement user = conn.prepareStatement(
					"insert into comentarioFinal(idAntropometriaGeral,observacoes,objetivos,periodicidade, atividadesPretendidasNaAcademia)values(?,?,?,?,?)");

			user.setInt(1,idAntropometriaGeral);
			user.setString(2, observacaoA);
			user.setString(3, objetivoA);
			user.setString(4, periodicidadeA);
			user.setString(5, atividPretAcadF);

			user.executeUpdate();

			

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		// shutdown(); Desliga conex�o com o banco
		comentarioFinal = new ComentarioFinal(idAntropometriaGeral,observacaoA, objetivoA, periodicidadeA, atividPretAcadF);
		return comentarioFinal;

	}
}
