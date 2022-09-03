package model;

import model.DAO.UsuarioDAO;

public class Usuario {

	// vari�veis de inst�ncia
	private String login;
	private String senha;
	

	// vari�veis get
	public String getLogin() {
		return login;
	}

	// vari�veis set
	public void setLogin(String login) {
		this.login = login;
	}

	// vari�veis get
	public String getSenha() {
		return senha;
	}

	// vari�veis set
	public void setSenha(String senha) {
		this.senha = senha;
	}


	// Construtor simples
	public Usuario() {
		super();
	}

	// Construtor Composto
	public Usuario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	
	}
	
	public boolean validarLogin (String login, String senha){
		
		Usuario usuario = UsuarioDAO.buscarPorLoginSenha(login, senha);
		if (usuario != null){
			return true;
		}
		return false;
	}
   
}
