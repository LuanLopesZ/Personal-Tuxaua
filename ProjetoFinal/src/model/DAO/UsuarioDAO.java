package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import model.Aluno;
import model.Usuario;
import util.Conexao;
import util.Configurador;

public class UsuarioDAO {

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

	public static Usuario buscarPorLoginSenha(String login, String senha) {
		createConnection();
		Usuario usurio = null;
		try {

			String sql = "select * from usuario where login = ? and senha = ?";

			PreparedStatement comando = conn.prepareStatement(sql);

			comando.setString(1, login);
			comando.setString(2, senha);
			ResultSet rs = comando.executeQuery();
			if (rs.next()) {
				usurio = new Usuario(rs.getString(1), rs.getString(2));

				System.out.println(login + ", senha " + senha);
			}
			rs.close();
			stmt.close();
		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		return usurio;
	}

	public static Usuario atualizar(String login, String senha) {
		createConnection();
		Usuario usu = null;

		try {
			// Criação do update
			PreparedStatement user = conn.prepareStatement("update login set login = ?, senha = ? where login = ?");

			user.setString(1, login);
			user.setString(2, senha);

			user.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return usu;
	}

}
