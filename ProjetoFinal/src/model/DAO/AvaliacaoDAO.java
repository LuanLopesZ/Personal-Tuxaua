package model.DAO;

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
import model.Abdomen2;
import model.Aluno;
import model.AntropometriaGeral;
import model.CifoseTorac;
import model.Coluna;
import model.Escapula;
import model.EspIlicAntPost;
import model.EspIlicaAntPost;
import model.Femur;
import model.Joelhos;
import model.Joelhos2;
import model.LordCervical;
import model.LordLob;
import model.Ombro2;
import model.Ombrovl;
import model.Pescoco;
import model.PosicaoPes;
import model.Tibia;
import model.TriangDTal;

public class AvaliacaoDAO {
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

	public static List<Aluno> select(String nome) {
		createConnection();
		List<Aluno> alu = new LinkedList<Aluno>();
		// Aluno[] alu = null;
		try {

			String sql = "select * from aluno where nome like ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			// stmt = conn.createStatement();
			stmt.setString(1, nome + "%%");

			ResultSet results = stmt.executeQuery();

			// alu = new Aluno[10];

			// int i = 0;

			while (results.next()) {

				// alu[i++] = new Aluno(results.getString("nome"));
				alu.add(new Aluno(results.getString("nome")));

			}
			results.close();
			stmt.close();
		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		return alu;
	}

 	

}
