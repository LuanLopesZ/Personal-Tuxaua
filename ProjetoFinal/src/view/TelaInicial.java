package view;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

public class TelaInicial extends Application {

	private MenuItem menuitem1;
	private MenuItem menuitem2;

	private Menu cadastrar;

	private MenuBar menubar;

	private Image image1;

	private Image image4;

	private Button buttonAgenda;

	private Button buttonFacebook;

	// private TelaInicial telainicial;
	static Stage primaryStage;
	static TelaAluno telaaluno;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Personal Tuxaua");
		BorderPane root = new BorderPane();
		HBox user = new HBox();
		user.setPadding(new javafx.geometry.Insets(10, 30, 10, 30));
		user.setSpacing(15);
		user.setStyle("-fx-background-color:#DCDCDC");

		// File Menu
		cadastrar = new Menu("Cadastrar");
		cadastrar.setStyle("-fx-font-size: 15");

		// Menu Itens
		menuitem1 = new MenuItem("Aluno");
		menuitem2 = new MenuItem("Avaliação");

		// cadastrar.getItems().add(new MenuItem("Avaliação"));
		cadastrar.getItems().add(menuitem1);
		cadastrar.getItems().add(menuitem2);

		menuitem1.setOnAction(Event -> {
			TelaAluno telaAluno = new TelaAluno();
			try {
				Stage testeStage = new Stage();
				telaAluno.start(testeStage);
				testeStage.centerOnScreen();

			} catch (Exception e) {
				e.printStackTrace();
			}

		});

		menuitem2.setOnAction(Event -> {

			TelaAvaliacao telaAvaliacao = new TelaAvaliacao();
			try {
				Stage testeStage = new Stage();
				telaAvaliacao.start(testeStage);
				testeStage.centerOnScreen();
			} catch (Exception e) {
				e.printStackTrace();
			}

		});

		// Main menu Bar
		menubar = new MenuBar();
		menubar.getMenus().addAll(cadastrar);
		// menubar.getMenus().add(fecharJanela);

		image1 = new Image(getClass().getResourceAsStream("schedule.png"));
		image4 = new Image(getClass().getResourceAsStream("facebook.png"));
		buttonAgenda = new Button("Agenda", new ImageView(image1));
		buttonFacebook = new Button("P. Oficial", new ImageView(image4));

		buttonAgenda.setOnAction(Event -> {

			TelaAgenda agenda = new TelaAgenda();
			try {
				Stage testeStage = new Stage();
				agenda.start(testeStage);
				testeStage.centerOnScreen();

			} catch (Exception e) {
				e.printStackTrace();
			}

		});

		buttonFacebook.setOnAction(Event -> {

			Desktop internet = Desktop.getDesktop();
			try {
				internet.browse(new URI(
						"https://www.facebook.com/Personal-Tuxaua-304913606597161/?view_public_for=304913606597161"));
			} catch (IOException e) {
				e.printStackTrace();
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}

		});

		user.getChildren().addAll(buttonAgenda, buttonFacebook);

		menubar.setStyle("-fx-background-color:#DCDCDC");

		root.setTop(menubar);

		// ==========================================//

		// primaryStage.initModality(Modality.WINDOW_MODAL);

		// primaryStage.initModality(Modality.APPLICATION_MODAL);

		// ==========================================//

		Scene scene = new Scene(root, 1220, 680);
		scene.getStylesheets().add("view/application.css");
		// root.setStyle("-fx-background-color: #006400");

		// inserindo objeto user na parte inferior de do painel root
		root.setBottom(user);

		scene.getStylesheets();
		primaryStage.setScene(scene);

		// Maximizar a janela quando for executada
		primaryStage.setMaximized(false);
		// Desabilitar a opção de maximizar
		primaryStage.resizableProperty().setValue(Boolean.FALSE);

		// TelaAluno.primaryStage.initOwner(primaryStage);
		// primaryStage.initModality(Modality.WINDOW_MODAL);
		// primaryStage.showAndWait();
		primaryStage.show();// exibir janela

	}

}
