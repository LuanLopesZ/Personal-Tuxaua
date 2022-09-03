package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import model.DAO.AlunoDAO;
import view.TelaAluno;

public class Aluno {

	// variaveis de instancia
	private int matricula;
	private String dataCadastro;
	private String academia;
	private String nome;
	private String sexo;
	private String nascimento;
	private String telefone;
	private String celular;
	private String email;
	private byte[] image;
	private String comentarios;

	// metodo getmaticula
	public int getMatricula() {
		return matricula;
	}

	// metodo setmaticula
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	// metodo getdatacadastro
	public String getDataCadastro() {
		return dataCadastro;
	}

	// metodo setdatacadastro
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	// metodo getnome
	public String getNome() {
		return nome;
	}

	// metodo setnome
	public void setNome(String nome) {
		this.nome = nome;
	}

	// metodo getsexo
	public String getSexo() {
		return sexo;
	}

	// metodo setsexo
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	// metodo getnascimento
	public String getNascimento() {
		return nascimento;
	}

	// metodo setnascimento
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	// metodo gettelefone
	public String getTelefone() {
		return telefone;
	}

	// metodo settelefone
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	// metodo getcelular
	public String getCelular() {
		return celular;
	}

	// metodo setcelular
	public void setCelular(String celular) {
		this.celular = celular;
	}

	// metodo getemail
	public String getEmail() {
		return email;
	}

	// metodo setemail
	public void setEmail(String email) {
		this.email = email;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getAcademia() {
		return academia;
	}

	public void setAcademia(String academia) {
		this.academia = academia;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	// construtor simples
	public Aluno(String nome) {
		super();
		this.nome = nome;
	}

	public Aluno() {
		
	}
	
	// construtor composto
	public Aluno(int matricula, String dataCadastro, String academia, String nome, String sexo, String nascimento,
			String telefone, String celular, String email, byte[] image, String comentarios) {
		super();
		this.matricula = matricula;
		this.dataCadastro = dataCadastro;
		this.academia = academia;
		this.nome = nome;
		this.sexo = sexo;
		this.nascimento = nascimento;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.image = image;
		this.comentarios = comentarios;
	}

	public Aluno(String dataCadastro, String academia, String nome, String sexo, String nascimento, String telefone,
			String celular, String email, byte[] image, String comentarios) {
		super();
		this.dataCadastro = dataCadastro;
		this.academia = academia;
		this.nome = nome;
		this.sexo = sexo;
		this.nascimento = nascimento;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.image = image;
		this.comentarios = comentarios;
	}

	public Aluno(int matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}
	
	
	//public ObservableList<Aluno> popularizarTable(){
		//return  FXCollections.observableArrayList(AlunoDAO.buscarAluno(nome));
		

	
}