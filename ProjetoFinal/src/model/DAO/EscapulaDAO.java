package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Escapula;

public class EscapulaDAO {
	
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

	
	public static Escapula insertEscapula(int idAntropometriaGeral,boolean alinhadaEs, boolean esqAbduzida, boolean dirAbduzida,
			boolean esqAduzida, boolean dirAduzida, boolean rodadaAImEsq, boolean rodadaAInfDir, boolean rodadaASupEsq,
			boolean rodadaSupDir, boolean esqAlada, boolean dirAlada) {
		createConnection();

		Escapula escapula = null;
		try {

			PreparedStatement user = conn.prepareStatement(
					"insert into escapula(idAntropometriaGeral,alinhada,esqAbduzida,dirAbduzida,esqAduzida,dirAduzida,rodadaAImEsq,rodadaAInfDir,rodadaASupEsq,rodadaSupDir,esqAlada,dirAlada)values(?,?,?,?,?,?,?,?,?,?,?,?)");

			user.setInt(1,idAntropometriaGeral);
			user.setBoolean(2, alinhadaEs);
			user.setBoolean(3, esqAbduzida);
			user.setBoolean(4, dirAbduzida);
			user.setBoolean(5, esqAduzida);
			user.setBoolean(6, dirAduzida);
			user.setBoolean(7, rodadaAImEsq);
			user.setBoolean(8, rodadaAInfDir);
			user.setBoolean(9, rodadaASupEsq);
			user.setBoolean(10, rodadaSupDir);
			user.setBoolean(11, esqAlada);
			user.setBoolean(12, dirAlada);

			user.executeUpdate();

		

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}
		// shutdown(); Desliga conex�o com o banco
		escapula = new Escapula(idAntropometriaGeral,alinhadaEs, esqAbduzida, dirAbduzida, esqAduzida, dirAduzida, rodadaAImEsq,
				rodadaAInfDir, rodadaASupEsq, rodadaSupDir, esqAlada, dirAlada);
		return escapula;

	}
}
