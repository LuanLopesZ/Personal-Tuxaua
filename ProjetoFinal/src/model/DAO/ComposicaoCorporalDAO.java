package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.ComposicaoCorporal;

public class ComposicaoCorporalDAO {

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

	public static ComposicaoCorporal insertCompCor(int idAntropometriaGeral,double massCorpTotal2F, double percentGorduraF, double masCopIdF,
			double masCorpGordaF, double masCopMagraF, double exGordCorpF) {
		createConnection();

		ComposicaoCorporal composicaoCorporal = null;
		try {

			PreparedStatement user = conn.prepareStatement(
					"insert into composicaoCorporal(idAntropometriaGeral,massaCorporalTotal,percentualDeGordura,massaCorporalIdeal,massaCorporalGorda,massaCorporalMagra,excessoDeGorduraCorporal)values(?,?,?,?,?,?,?)");
      
			user.setInt(1,idAntropometriaGeral);
			user.setDouble(2, massCorpTotal2F);
			user.setDouble(3, percentGorduraF);
			user.setDouble(4, masCopIdF);
			user.setDouble(5, masCorpGordaF);
			user.setDouble(6, masCopMagraF);
			user.setDouble(7, exGordCorpF);

			user.executeUpdate();

			

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		// shutdown(); Desliga conex�o com o banco
	composicaoCorporal = new ComposicaoCorporal(idAntropometriaGeral,massCorpTotal2F, percentGorduraF, masCopIdF, masCorpGordaF, masCopMagraF,
				exGordCorpF);
		return composicaoCorporal;

	}
}
