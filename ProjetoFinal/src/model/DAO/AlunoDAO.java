package model.DAO;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import model.Aluno;

import java.sql.ResultSetMetaData;

public class AlunoDAO {
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

	public static Aluno insert(String dataCadastro, String academia, String nome, String sexo, String nascimento,
			String telefone, String celular, String email, byte[] image, String comentarios) {
		createConnection();

		Aluno aluno = null;
		try {

			PreparedStatement user = conn.prepareStatement(
					"insert into aluno(dataCadastro,nome,academia,sexo,nascimento,telefone,celular,email,comentario,imagem)values(?,?,?,?,?,?,?,?,?,?)");
			user.setString(1, dataCadastro);
			user.setString(2, nome);
			user.setString(3, academia);
			user.setString(4, sexo);
			user.setString(5, nascimento);
			user.setString(6, telefone);
			user.setString(7, celular);
			user.setString(8, email);
			user.setString(9, comentarios);
			user.setBytes(10, image);
			user.executeUpdate();

			JOptionPane.showMessageDialog(null, "Seu cadastro foi concluido com sucesso");

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		// shutdown(); Desliga conex�o com o banco
		aluno = new Aluno(dataCadastro, academia, nome, sexo, nascimento, telefone, celular, email, image, comentarios);
		return aluno;

	}

	public static Aluno delete(int matricula) {
		createConnection();

		Aluno alu = null;
		try {
			stmt = conn.createStatement();
			stmt.execute("delete from " + tableName + " where matricula = " + matricula);

			stmt.close();

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		return alu;

	}

	public static Aluno atualizar(int matricula, String dataCadastro, String nome, String academia, String sexo,
			String nascimento, String telefone, String celular, String email, String comentarios, byte[] image) {
		createConnection();
		Aluno alu = null;
		try {
			// matricula, dataCadastro,nome, academia, sexo, nascimento, telefone, celular,
			// email,comentarios, res
			PreparedStatement user = conn.prepareStatement(
					"update aluno set dataCadastro = ?,nome = ?, academia = ?,  sexo = ?, nascimento = ?, telefone = ?, celular = ?, email = ?,comentario = ?, imagem = ? where matricula = ? ");
			user.setString(1, dataCadastro);
			user.setString(2, nome);
			user.setString(3, academia);
			user.setString(4, sexo);
			user.setString(5, nascimento);
			user.setString(6, telefone);
			user.setString(7, celular);
			user.setString(8, email);
			user.setString(9, comentarios);
			user.setBytes(10, image);
			user.setInt(11, matricula);

			user.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return alu;

	}

	public static List<Aluno> buscarAluno() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		createConnection();

		Aluno alu = null;
		try {
			stmt = conn.createStatement();
			ResultSet results = stmt.executeQuery("Select matricula, nome from aluno");
			ResultSetMetaData rsmd = results.getMetaData();
			int numberCols = rsmd.getColumnCount();
			for (int i = 1; i <= numberCols; i++) {
				// print Column Names
				System.out.print(rsmd.getColumnLabel(i) + "\t\t");
			}

			System.out.println("\n-------------------------------------------------");

			while (results.next()) {
				Aluno a = new Aluno();
				a.setMatricula(results.getInt("Matricula"));
				a.setNome(results.getString("Nome"));
				alunos.add(a);

			}
			results.close();
			stmt.close();
		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		return alunos;
	}

	public static Aluno select(int matricula) {
		createConnection();

		Aluno alu = null;
		try {
			stmt = conn.createStatement();
			ResultSet results = stmt.executeQuery("select * from " + tableName + " where matricula = " + matricula);
			ResultSetMetaData rsmd = results.getMetaData();
			int numberCols = rsmd.getColumnCount();
			for (int i = 1; i <= numberCols; i++) {
				// print Column Names
				System.out.print(rsmd.getColumnLabel(i) + "\t\t");
			}

			System.out.println("\n-------------------------------------------------");

			while (results.next()) {
				matricula = results.getInt(1);
				String dataCadastro = results.getString(2);
				String nome = results.getString(3);
				String academia = results.getString(4);
				String sexo = results.getString(5);
				String nascimento = results.getString(6);
				String telefone = results.getString(7);
				String celular = results.getString(8);
				String email = results.getString(9);
				String comentarios = results.getString(10);
				byte[] image = results.getBytes(11);

				System.out.println(matricula + "\t\t" + dataCadastro + "\t\t" + academia + "\t\t" + nome + "\t\t" + sexo
						+ "\t\t" + nascimento + "\t\t" + telefone + "\t\t" + celular + "\t\t" + email + "\t\t" + image
						+ "\t\t" + comentarios);
				alu = new Aluno(matricula, dataCadastro, academia, nome, sexo, nascimento, telefone, celular, email,
						image, comentarios);

			}
			results.close();
			stmt.close();
		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		return alu;
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
