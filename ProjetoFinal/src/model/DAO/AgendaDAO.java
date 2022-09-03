package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Agenda;

public class AgendaDAO {

	private static String dbURL = "jdbc:derby://localhost:1527/personalTuxaua;create=true;user=personal;password=1234";
	private static String tableName = "aluno";
	// jdbc Connection
	private static Connection conn = null;
	private static Statement stmt = null;

	public static void createConnection() {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
			// Get a connection
			conn = DriverManager.getConnection(dbURL);
		} catch (Exception except) {
			except.printStackTrace();
		}
	}

	public static Agenda insert(String nome,String descricao, String valor, String diasaulas, String tiposaulas) {
		createConnection();

		Agenda tabela = null;
		try {

			PreparedStatement user = conn.prepareStatement(
					"insert into aluno(nome,descricao,valor,diasaulas,tiposaulas)values(?,?,?,?,?)");
			user.setString(1, nome);
			user.setString(2, descricao);
			user.setString(3, valor);
			user.setString(4, diasaulas);
			user.setString(5, tiposaulas);
			user.executeUpdate();

			JOptionPane.showMessageDialog(null, "Seu cadastro foi concluido com sucesso");

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		// shutdown(); Desliga conex�o com o banco
		tabela = new Agenda(nome, descricao, valor, diasaulas, tiposaulas);
		return tabela;

	}
	
	public static List<Agenda> select(String nome,String descricao, String valor, String diasaulas, String tiposaulas) {
		createConnection();
		List<Agenda> tab = new LinkedList<Agenda>();
		//Aluno[] alu = null;
		try {
			
			String sql = "select * from aluno where nome like ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			//stmt = conn.createStatement();
			stmt.setString(1, nome+"%%");
			
			
			ResultSet results = stmt.executeQuery();
			
			//alu = new Aluno[10];
			
			//int i = 0;
			
			while (results.next()) {
				//Tabela tabela = new Tabela();
				//tabela.setNome(results.getString("Nome"));
				//tabela.setDescricao(results.getString(2));
				//tabela.setValor1(results.getString(3));
				//tabela.setDiasaulas(results.getString(4));
				//tabela.setTiposaulas(results.getString(5));
			
				//tab.add(tabela);
			}
			results.close();
			stmt.close();
		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
			System.out.println(sqlExcept.getMessage());
		}

		return tab;
	}

	public static void shutdown() {
		try {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				DriverManager.getConnection(dbURL + ";shutdown=true");
				conn.close();
			}
		} catch (SQLException sqlExcept) {

		}

	}

}
