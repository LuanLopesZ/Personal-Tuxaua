package model;

import model.DAO.UsuarioDAO;

public class Usuario {

	// variáveis de instância
	private String login;
	private String senha;
	

	// variáveis get
	public String getLogin() {
		return login;
	}

	// variáveis set
	public void setLogin(String login) {
		this.login = login;
	}

	// variáveis get
	public String getSenha() {
		return senha;
	}

	// variáveis set
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
