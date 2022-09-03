package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.DAO.AgendaDAO;

public class Agenda {

	private String nome;
	//private String valor;
	//private int qts;
	private String valor1;
	private String descricao;
	private String diasaulas;
	private String tiposaulas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//public String getValor() {
		//return valor;
	//}

	//public void setValor(String valor) {
	//	this.valor = valor;
	//}

	//public int getQts() {
	//	return qts;
	//}

	//public void setQts(int qts) {
		//this.qts = qts;
	//}

	public String getValor1() {
		return valor1;
	}

	public void setValor1(String valor1) {
		this.valor1 = valor1;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDiasaulas() {
		return diasaulas;
	}

	public void setDiasaulas(String diasaulas) {
		this.diasaulas = diasaulas;
	}

	public String getTiposaulas() {
		return tiposaulas;
	}

	public void setTiposaulas(String tiposaulas) {
		this.tiposaulas = tiposaulas;
	}


	public Agenda() {
		this.nome = "";
		this.valor1 = "";
		this.descricao = "";
		this.diasaulas = "";
		this.tiposaulas = "";
	}

	public Agenda(String nome, String valor1, String descricao, String diasaulas, String tiposaulas) {
		super();
		this.nome = nome;
		this.valor1 = valor1;
		this.descricao = descricao;
		this.diasaulas = diasaulas;
		this.tiposaulas = tiposaulas;
	}

	public ObservableList<Agenda> atualizarTabela() {
		
		ObservableList<Agenda> Produto = FXCollections.observableArrayList();
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		Produto.add(new Agenda("willian Fonseca", "Aula Geral", "R$50,00","Seg/Quart/Sext","09 horas"));
		
		
		
		
		
		//return FXCollections.observableArrayList(AgendaDAO.select(nome, descricao, valor, diasaulas, tiposaulas));
	return Produto;
	}

}
