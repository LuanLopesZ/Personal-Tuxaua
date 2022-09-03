package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import javafx.stage.Stage;
import model.Aluno;
import model.DAO.AlunoDAO;
import util.AlunoTableModel;

import java.awt.Container;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TelaTabela extends javax.swing.JFrame {

	public TelaTabela(List<Aluno> alu) {

		super("Lista de Mensagens:");

		JTable tabela = new JTable();
		AlunoTableModel tableModel = new AlunoTableModel(alu);
		tabela.setModel(tableModel);

		JScrollPane scroll = new JScrollPane();
		scroll.getViewport().add(tabela);
		scroll.setSize(100, 200);

		Container c = getContentPane();
		c.add(scroll);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);
		setAlwaysOnTop(true);
	}

	public static void main(String[] args) {
		List<Aluno> alunos = AlunoDAO.buscarAluno();
		new TelaTabela(alunos);

	}

}
