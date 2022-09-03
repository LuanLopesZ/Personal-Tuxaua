package model.DAO;

import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.AntropometriaGeral;

public class AntropometriaGeralDAO {

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

	public static AntropometriaGeral insertGeral(String dataAvaliacao, String valiadAvaliacao, double massaCorpoTotal,
			double freqCardRep, double preArtSistRepo, double presArtDiaRep ,double estatura) {
		createConnection();

		AntropometriaGeral antropometriaGeral = null;
		try {

			String sql = "insert into antropometriaGeral(dataDaAvaliacao,validadeDaAvaliacao, massaCorporalTotal, frequenciaCardiacaEmRepouso,pressaoArterialSistolicaEmRepouso, pressaoArterialDiastolicaEmRepouso,estatura)values(?,?,?,?,?,?,?)";
			PreparedStatement user = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			user.setString(1, dataAvaliacao);
			user.setString(2, valiadAvaliacao);
			user.setDouble(3, massaCorpoTotal);
			user.setDouble(4, freqCardRep);
			user.setDouble(5, preArtSistRepo);
			user.setDouble(6, presArtDiaRep);
			user.setDouble(7, estatura);

			int id = -1;
			if (user.executeUpdate() > 0) {
				ResultSet rs = user.getGeneratedKeys();
				if (rs.next()) {
					id = rs.getInt(1);
				}
				rs.close();
			}
			
			antropometriaGeral = new AntropometriaGeral(id, dataAvaliacao, valiadAvaliacao, massaCorpoTotal,
					freqCardRep, preArtSistRepo, presArtDiaRep, estatura);
		
			
		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		// shutdown(); Desliga conex�o com o banco

		return antropometriaGeral;

	}
}
