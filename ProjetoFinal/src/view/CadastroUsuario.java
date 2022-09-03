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

	// criação da variavel Login e senha
	private TextField textFieldlogin;
	private PasswordField passwordFieldsenha;

	// botões de ação logar e cancelar
	private Button buttonAtualizar;
	private Button buttonCancelar;

	UsuarioDAO usuariodao;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		AnchorPane layout = new AnchorPane();

		// título de exebição na tela
		primaryStage.setTitle("Personal Tuaxaua");

		// resolução de tela
		Scene scene = new Scene(layout, 480, 300);

		// Exibição do Label login e senha
		labeltextLogin = new Label("Login");
		labeltextLogin.setFont(new Font(16));
		// textLogin.setStyle("-fx-text-fill: E8E8E8");

		labeltextsenha = new Label("Senha");
		labeltextsenha.setFont(new Font(16));
		// textsenha.setStyle("-fx-text-fill: E8E8E8");

		labeltexttitulo = new Label("Sistema Personal Tuxaua");
		labeltexttitulo.setFont(new Font(30));
		// texttitulo.setStyle("-fx-text-fill: F8F8F8");

		// Exibição do TextFiled login
		textFieldlogin = new TextField();
		textFieldlogin.setPromptText("Digite seu login...");

		// Exibição do TextFiled senha
		passwordFieldsenha = new PasswordField();
		passwordFieldsenha.setPromptText("Digite sua senha...");

		// Botão logar no sistema
		buttonAtualizar = new Button("Atualizar");
		buttonAtualizar.setPrefSize(70, 10);

		// logar.setStyle("-fx-text-fill: #006400");

		// Botão sair do sistema e define a posição do botão cancelar na tela
		buttonCancelar = new Button("Sair");
		buttonCancelar.setPrefSize(70, 10);
		buttonCancelar.setLayoutX(245);
		buttonCancelar.setLayoutY(230);
		// cancelar.setStyle("-fx-text-fill: #006400");

		// Define a posição do textfield login na tela
		labeltextLogin.setLayoutX(165);
		labeltextLogin.setLayoutY(97);

		// Define a posição do textlogin login na tela
		buttonAtualizar.setLayoutX(165);
		buttonAtualizar.setLayoutY(230);

		// Define a posição do textsenha na tela
		labeltextsenha.setLayoutX(165);
		labeltextsenha.setLayoutY(180);

		// Define a posição do textfield senha na tela
		passwordFieldsenha.setLayoutX(165);
		passwordFieldsenha.setLayoutY(200);

		// Define a posição do textfiled login na tela
		textFieldlogin.setLayoutX(165);
		textFieldlogin.setLayoutY(120);

		// Define a posição do titulo na tela
		labeltexttitulo.setLayoutX(90);
		labeltexttitulo.setLayoutY(40);

		// método que executa a saida do sistema
		buttonAtualizar.setOnAction(Event -> {
			String login = textFieldlogin.getText();
			String senha = passwordFieldsenha.getText();

			usuariodao.atualizar(login, senha);
		});

		// método que executa a saida do sistema
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
