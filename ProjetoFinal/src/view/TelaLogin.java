package view;

import javax.swing.JOptionPane;

//Importação de classes
import controller.Main;
import javafx.scene.text.Font;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
//import javafx.stage.StageStyle;
import model.Usuario;
import model.DAO.UsuarioDAO;

public class TelaLogin extends Application {

	boolean logado = false;
	TelaInicial telainical;

	// criação da variavel textLogin e textsenha
	private Label labeltextLogin;
	private Label labeltextsenha;
	private Label labeltexttitulo;

	// criação da variavel Login e senha
	private TextField textFieldlogin;
	private PasswordField passwordFieldsenha;

	// botões de ação logar e cancelar
	private Button buttonlogar;
	private Button buttonCancelar;

	// Criando objeto usuario
	private static Usuario usuario;
	UsuarioDAO usuariodao;
	Main main;

	// criando progressBar
	ProgressBar progressBar = new ProgressBar();;

	public static void main(String[] args) {
		launch(args);
	}

	// sobrescrevendo o método
	@Override
	public void start(Stage primaryStage) throws Exception {

		// Layout AchorPane
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
		buttonlogar = new Button("Entrar");
		buttonlogar.setPrefSize(50, 10);
		buttonlogar.setDisable(true);
		// logar.setStyle("-fx-text-fill: #006400");

		// Botão sair do sistema e define a posição do botão cancelar na tela
		buttonCancelar = new Button("Sair");
		buttonCancelar.setPrefSize(50, 10);
		buttonCancelar.setLayoutX(235);
		buttonCancelar.setLayoutY(230);
		// cancelar.setStyle("-fx-text-fill: #006400");

		// Define a posição do textfield login na tela
		labeltextLogin.setLayoutX(165);
		labeltextLogin.setLayoutY(97);

		// Define a posição do textlogin login na tela
		buttonlogar.setLayoutX(185);
		buttonlogar.setLayoutY(230);

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
		labeltexttitulo.setLayoutX(160);
		labeltexttitulo.setLayoutY(40);

		buttonlogar.setOnAction(e -> {
			setUserAgentStylesheet(STYLESHEET_CASPIAN);

		});

		progressBar.setDisable(true);
		progressBar.setPrefSize(490, 15);
		progressBar.setLayoutX(0);
		progressBar.setLayoutY(292);

		final Slider slider = new Slider();
		slider.setMin(0);
		slider.setMax(100);

		// método de ação do botão entrar
		buttonlogar.setOnAction(Event -> {

			String login = textFieldlogin.getText();
			String senha = passwordFieldsenha.getText();

			if (login.equals("senai") && senha.equals("1234")) {
				JOptionPane.showMessageDialog(null, "Login efetuado com sucesso.");

				telainical = new TelaInicial();

				try {

					Stage testeStage = new Stage();
					telainical.start(testeStage);
					testeStage.centerOnScreen();
					primaryStage.close();

				} catch (Exception e1) {

					e1.printStackTrace();
				}
			} else {
				JOptionPane.showMessageDialog(null, "Login ou senha inválida");

			}

		});

		// método que executa a saida do sistema
		buttonCancelar.setOnAction(Event -> {
			primaryStage.close();

		});

		// metodo que habilita o progressbar quando textfield login e senha
		// estão preenchido
		passwordFieldsenha.setOnKeyTyped(Event -> {

			if (!textFieldlogin.getText().isEmpty() && !passwordFieldsenha.getText().isEmpty()) {
				buttonlogar.setDisable(false);
				progressBar.setDisable(false);
			} else {
				buttonlogar.setDisable(true);
			}

		});

		layout.getChildren().addAll(labeltexttitulo, labeltextLogin, labeltextsenha, textFieldlogin, passwordFieldsenha,
				buttonlogar, buttonCancelar, progressBar);

		// cor de fundo de janela
		// layout.setStyle("-fx-background-color: #006400");
		primaryStage.setScene(scene);
		scene.getStylesheets().add("view/application.css");
		primaryStage.setResizable(false);
		// primaryStage.initStyle(StageStyle.UNDECORATED);

		primaryStage.show();// Exibir a Tela

	}// fim do metodo start

}// fim da classe
