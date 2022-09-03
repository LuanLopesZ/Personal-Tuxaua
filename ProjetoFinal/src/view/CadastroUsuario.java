package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model.DAO.UsuarioDAO;

public class CadastroUsuario extends Application {

	private Label labeltextLogin;
	private Label labeltextsenha;
	private Label labeltexttitulo;

	// cria��o da variavel Login e senha
	private TextField textFieldlogin;
	private PasswordField passwordFieldsenha;

	// bot�es de a��o logar e cancelar
	private Button buttonAtualizar;
	private Button buttonCancelar;

	UsuarioDAO usuariodao;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		AnchorPane layout = new AnchorPane();

		// t�tulo de exebi��o na tela
		primaryStage.setTitle("Personal Tuaxaua");

		// resolu��o de tela
		Scene scene = new Scene(layout, 480, 300);

		// Exibi��o do Label login e senha
		labeltextLogin = new Label("Login");
		labeltextLogin.setFont(new Font(16));
		// textLogin.setStyle("-fx-text-fill: E8E8E8");

		labeltextsenha = new Label("Senha");
		labeltextsenha.setFont(new Font(16));
		// textsenha.setStyle("-fx-text-fill: E8E8E8");

		labeltexttitulo = new Label("Sistema Personal Tuxaua");
		labeltexttitulo.setFont(new Font(30));
		// texttitulo.setStyle("-fx-text-fill: F8F8F8");

		// Exibi��o do TextFiled login
		textFieldlogin = new TextField();
		textFieldlogin.setPromptText("Digite seu login...");

		// Exibi��o do TextFiled senha
		passwordFieldsenha = new PasswordField();
		passwordFieldsenha.setPromptText("Digite sua senha...");

		// Bot�o logar no sistema
		buttonAtualizar = new Button("Atualizar");
		buttonAtualizar.setPrefSize(70, 10);

		// logar.setStyle("-fx-text-fill: #006400");

		// Bot�o sair do sistema e define a posi��o do bot�o cancelar na tela
		buttonCancelar = new Button("Sair");
		buttonCancelar.setPrefSize(70, 10);
		buttonCancelar.setLayoutX(245);
		buttonCancelar.setLayoutY(230);
		// cancelar.setStyle("-fx-text-fill: #006400");

		// Define a posi��o do textfield login na tela
		labeltextLogin.setLayoutX(165);
		labeltextLogin.setLayoutY(97);

		// Define a posi��o do textlogin login na tela
		buttonAtualizar.setLayoutX(165);
		buttonAtualizar.setLayoutY(230);

		// Define a posi��o do textsenha na tela
		labeltextsenha.setLayoutX(165);
		labeltextsenha.setLayoutY(180);

		// Define a posi��o do textfield senha na tela
		passwordFieldsenha.setLayoutX(165);
		passwordFieldsenha.setLayoutY(200);

		// Define a posi��o do textfiled login na tela
		textFieldlogin.setLayoutX(165);
		textFieldlogin.setLayoutY(120);

		// Define a posi��o do titulo na tela
		labeltexttitulo.setLayoutX(90);
		labeltexttitulo.setLayoutY(40);

		// m�todo que executa a saida do sistema
		buttonAtualizar.setOnAction(Event -> {
			String login = textFieldlogin.getText();
			String senha = passwordFieldsenha.getText();

			usuariodao.atualizar(login, senha);
		});

		// m�todo que executa a saida do sistema
		buttonCancelar.setOnAction(Event -> {
			primaryStage.close();

		});

		layout.getChildren().addAll(labeltexttitulo, labeltextLogin, labeltextsenha, textFieldlogin, passwordFieldsenha,
				buttonAtualizar, buttonCancelar);

		// cor de fundo de janela
		// layout.setStyle("-fx-background-color: #006400");
		primaryStage.setScene(scene);
		scene.getStylesheets().add("view/application.css");
		primaryStage.setResizable(false);
		// primaryStage.initStyle(StageStyle.UNDECORATED);

		primaryStage.show();// Exibir a Tela

	}// fim do metodo start

}// fim da classe
