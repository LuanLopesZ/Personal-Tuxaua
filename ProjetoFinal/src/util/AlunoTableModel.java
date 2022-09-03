package util;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Aluno;

public class AlunoTableModel extends AbstractTableModel {
	private final List<Aluno> alunos;

	public AlunoTableModel(List<Aluno> alu) {
		this.alunos = alu;
	}

	public int getColumnCount() { // tabela com 4 colunas
		// TODO Auto-generated method stub
		return 2;
	}

	public int getRowCount() {// quantidade de linhas da tabela
		// TODO Auto-generated method stub
		return alunos.size();// size vai trazer a quantidade de linhas
	}

	public Object getValueAt(int linha, int coluna) {
		// TODO Auto-generated method stub
		Aluno a = alunos.get(linha);

		switch (coluna) {
		case 0:
			return a.getMatricula();
		case 1:
			return a.getNome();
		default:
			break;
		}

		return null;
	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
		case 0:
			return "Matricula";
		case 1:
			return "Nome";
		default:
			return "";
		}
	}

}
