package view;

import java.awt.ScrollPane;
import java.util.Observable;
import java.util.Set;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.Main;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model.Aluno;
import model.Agenda;
import model.DAO.AgendaDAO;
import model.DAO.AlunoDAO;

public class TelaAgenda extends Application {

	private static ListView<String> listView;
	private static TableView<Aluno> table;
	private static Button buttonNovo;
	private static Button buttonSalvar;
	private static TableColumn<Agenda, byte[]> tableColuna1;
	private static TableColumn<Agenda, String> tableColuna2;
	private static TableColumn<Agenda, String> tableColuna3;
	private static TableColumn<Agenda, String> tableColuna4;
	private static TableColumn<Agenda, String> tableColuna5;
	private static Label labelreferencia;
	private static Label labeldescricao;
	private static TextField textFielddescricao;
	private static Label labelvalor;
	private static TextField textFieldvalor;

	private ChoiceBox<String> choiceBox0;
	private ChoiceBox<String> choiceBox1;
	private ChoiceBox<String> choiceBox2;
	private ChoiceBox<String> choiceBox3;
	private ChoiceBox<String> choiceBox4;
	private ChoiceBox<String> choiceBox5;
	private ChoiceBox<String> choiceBox6;
	private ChoiceBox<String> choiceBox7;
	private ChoiceBox<String> choiceBox8;
	private ChoiceBox<String> choiceBox9;
	private ChoiceBox<String> choiceBox10;
	private ChoiceBox<String> choiceBox11;
	private ChoiceBox<String> choiceBox12;
	private ChoiceBox<String> choiceBox13;
	
	public static void main(String[] args) {
		launch(args);
	}

	//private String nome;
	//private String descricao;
	//private String valor;
	//private String diasaulas;
	//private String tiposaulas;

	private static AgendaDAO agendadao;
	private static Agenda agenda = new Agenda();
	private static Aluno aluno;
	

	@Override
	public void start(Stage primaryStage) {

		VBox vbox = new VBox();
		AnchorPane root = new AnchorPane(vbox);

		primaryStage.setTitle("Agendamento");

		// ScrollBar table1HorizontalScrollBar = findScrollBar( table,
		// Orientation.HORIZONTAL);
		// ScrollBar table1VerticalScrollBar = findScrollBar( table,
		// Orientation.VERTICAL);

		// this doesn't work:
		// table1HorizontalScrollBar.setVisible(false);
		// table1VerticalScrollBar.setVisible(false);

		tableColuna1 = new TableColumn<>("Nome");
		// tableColuna1.setStyle("-fx-background-color: #000000");
		tableColuna1.setMinWidth(200);
		tableColuna1.setCellValueFactory(new PropertyValueFactory<>("nome"));

		tableColuna2 = new TableColumn<>("Descrição");
		tableColuna2.setMinWidth(200);
		tableColuna2.setCellValueFactory(new PropertyValueFactory<>("descricao"));

		tableColuna3 = new TableColumn<>("Valor");
		tableColuna3.setMinWidth(100);
		tableColuna3.setCellValueFactory(new PropertyValueFactory<>("valor1"));

		tableColuna4 = new TableColumn<>("DiasAulas");
		tableColuna4.setMinWidth(100);
		tableColuna4.setCellValueFactory(new PropertyValueFactory<>("diasaulas"));

		tableColuna5 = new TableColumn<>("TiposAulas");
		tableColuna5.setMinWidth(138);
		tableColuna5.setCellValueFactory(new PropertyValueFactory<>("tiposaulas"));

		//aluno = new Aluno();
		table = new TableView<Aluno>();
		//table.setItems(aluno.popularizarTable());
		table.setPrefSize(740, 280);

		//table.getColumns().addAll(tableColuna1, tableColuna2, tableColuna3, tableColuna4, tableColuna5);

		vbox.getChildren().addAll(table);

		labelreferencia = new Label("Pressione Ctrl e clique sobre o dia da semana para marcar ou desmarcar");
		labelreferencia.setFont(new Font(16));
		labelreferencia.setPrefSize(530, 30);
		labelreferencia.setLayoutX(5);
		labelreferencia.setLayoutY(523);

		labeldescricao = new Label("Descrição");
		labeldescricao.setFont(new Font(16));
		labeldescricao.setPrefSize(100, 35);
		labeldescricao.setLayoutX(5);
		labeldescricao.setLayoutY(280);

		textFielddescricao = new TextField();
		textFielddescricao.setPromptText("Descrição:");
		textFielddescricao.setPrefSize(300, 20);
		textFielddescricao.setLayoutX(5);
		textFielddescricao.setLayoutY(308);

		labelvalor = new Label("Valor");
		labelvalor.setFont(new Font(16));
		labelvalor.setPrefSize(80, 35);
		labelvalor.setLayoutX(320);
		labelvalor.setLayoutY(280);

		textFieldvalor = new TextField();
		textFieldvalor.setPromptText("Valor:");
		textFieldvalor.setPrefSize(100, 20);
		textFieldvalor.setLayoutX(320);
		textFieldvalor.setLayoutY(308);

		buttonNovo = new Button("Novo");
		buttonNovo.setPrefSize(60, 10);
		buttonNovo.setLayoutX(580);
		buttonNovo.setLayoutY(525);

		buttonSalvar = new Button("Salvar");
		buttonSalvar.setPrefSize(60, 10);
		buttonSalvar.setLayoutX(645);
		buttonSalvar.setLayoutY(525);

		buttonSalvar.setOnAction(e -> {
			String message = "";
			ObservableList<String> movies;
			movies = listView.getSelectionModel().getSelectedItems();

			String message2 = "";
			ObservableList<Agenda> show;
			//show = table.getSelectionModel().getSelectedItems();

			for (String m : movies) {
				message += m + "\n";
			}
			System.out.println(message);

		//	for (Tabela s : show) {
			//	message += s + "\n";
			//}
		//	System.out.println(message2);

			String nome = tableColuna1.getText();
			String descricao = textFielddescricao.getText();
			String valor = textFieldvalor.getText();
			String diasaulas = tableColuna4.getText();
			String tiposaulas = tableColuna4.getText();

			agenda = agendadao.insert(nome, descricao, valor, diasaulas, tiposaulas);
			
			
			Main.fazerAgendamento(agenda);
			
			

		});

		choiceBox0 = new ChoiceBox<>();
		choiceBox0.setDisable(true);
		choiceBox0.setLayoutX(580);
		choiceBox0.setLayoutY(310);
		choiceBox0.getItems().add("06:00");
		choiceBox0.getItems().add("06:30");
		choiceBox0.getItems().add("07:00");
		choiceBox0.getItems().add("07:30");
		choiceBox0.getItems().add("08:00");
		choiceBox0.getItems().add("08:30");
		choiceBox0.getItems().add("09:00");
		choiceBox0.setValue("06:00");

		choiceBox1 = new ChoiceBox<>();
		choiceBox1.setDisable(true);
		choiceBox1.setLayoutX(580);
		choiceBox1.setLayoutY(340);
		choiceBox1.getItems().add("06:00");
		choiceBox1.getItems().add("06:30");
		choiceBox1.getItems().add("07:00");
		choiceBox1.getItems().add("07:30");
		choiceBox1.getItems().add("08:00");
		choiceBox1.getItems().add("08:30");
		choiceBox1.getItems().add("09:00");
		choiceBox1.setValue("06:00");

		choiceBox2 = new ChoiceBox<>();
		choiceBox2.setDisable(true);
		choiceBox2.setLayoutX(650);
		choiceBox2.setLayoutY(310);
		choiceBox2.getItems().add("06:00");
		choiceBox2.getItems().add("06:30");
		choiceBox2.getItems().add("07:00");
		choiceBox2.getItems().add("07:30");
		choiceBox2.getItems().add("08:00");
		choiceBox2.getItems().add("08:30");
		choiceBox2.getItems().add("09:00");
		choiceBox2.setValue("06:00");

		choiceBox3 = new ChoiceBox<>();
		choiceBox3.setDisable(true);
		choiceBox3.setLayoutX(650);
		choiceBox3.setLayoutY(340);
		choiceBox3.getItems().add("06:00");
		choiceBox3.getItems().add("06:30");
		choiceBox3.getItems().add("07:00");
		choiceBox3.getItems().add("07:30");
		choiceBox3.getItems().add("08:00");
		choiceBox3.getItems().add("08:30");
		choiceBox3.getItems().add("09:00");
		choiceBox3.setValue("06:00");

		choiceBox4 = new ChoiceBox<>();
		choiceBox4.setDisable(true);
		choiceBox4.setLayoutX(580);
		choiceBox4.setLayoutY(370);
		choiceBox4.getItems().add("06:00");
		choiceBox4.getItems().add("06:30");
		choiceBox4.getItems().add("07:00");
		choiceBox4.getItems().add("07:30");
		choiceBox4.getItems().add("08:00");
		choiceBox4.getItems().add("08:30");
		choiceBox4.getItems().add("09:00");
		choiceBox4.setValue("06:00");

		choiceBox5 = new ChoiceBox<>();
		choiceBox5.setDisable(true);
		choiceBox5.setLayoutX(650);
		choiceBox5.setLayoutY(370);
		choiceBox5.getItems().add("06:00");
		choiceBox5.getItems().add("06:30");
		choiceBox5.getItems().add("07:00");
		choiceBox5.getItems().add("07:30");
		choiceBox5.getItems().add("08:00");
		choiceBox5.getItems().add("08:30");
		choiceBox5.getItems().add("09:00");
		choiceBox5.setValue("06:00");

		choiceBox6 = new ChoiceBox<>();
		choiceBox6.setDisable(true);
		choiceBox6.setLayoutX(580);
		choiceBox6.setLayoutY(400);
		choiceBox6.getItems().add("06:00");
		choiceBox6.getItems().add("06:30");
		choiceBox6.getItems().add("07:00");
		choiceBox6.getItems().add("07:30");
		choiceBox6.getItems().add("08:00");
		choiceBox6.getItems().add("08:30");
		choiceBox6.getItems().add("09:00");
		choiceBox6.setValue("06:00");

		choiceBox7 = new ChoiceBox<>();
		choiceBox7.setDisable(true);
		choiceBox7.setLayoutX(650);
		choiceBox7.setLayoutY(400);
		choiceBox7.getItems().add("06:00");
		choiceBox7.getItems().add("06:30");
		choiceBox7.getItems().add("07:00");
		choiceBox7.getItems().add("07:30");
		choiceBox7.getItems().add("08:00");
		choiceBox7.getItems().add("08:30");
		choiceBox7.getItems().add("09:00");
		choiceBox7.setValue("06:00");

		choiceBox8 = new ChoiceBox<>();
		choiceBox8.setDisable(true);
		choiceBox8.setLayoutX(580);
		choiceBox8.setLayoutY(430);
		choiceBox8.getItems().add("06:00");
		choiceBox8.getItems().add("06:30");
		choiceBox8.getItems().add("07:00");
		choiceBox8.getItems().add("07:30");
		choiceBox8.getItems().add("08:00");
		choiceBox8.getItems().add("08:30");
		choiceBox8.getItems().add("09:00");
		choiceBox8.setValue("06:00");

		choiceBox9 = new ChoiceBox<>();
		choiceBox9.setDisable(true);
		choiceBox9.setLayoutX(650);
		choiceBox9.setLayoutY(430);
		choiceBox9.getItems().add("06:00");
		choiceBox9.getItems().add("06:30");
		choiceBox9.getItems().add("07:00");
		choiceBox9.getItems().add("07:30");
		choiceBox9.getItems().add("08:00");
		choiceBox9.getItems().add("08:30");
		choiceBox9.getItems().add("09:00");
		choiceBox9.setValue("06:00");

		choiceBox10 = new ChoiceBox<>();
		choiceBox10.setDisable(true);
		choiceBox10.setLayoutX(580);
		choiceBox10.setLayoutY(460);
		choiceBox10.getItems().add("06:00");
		choiceBox10.getItems().add("06:30");
		choiceBox10.getItems().add("07:00");
		choiceBox10.getItems().add("07:30");
		choiceBox10.getItems().add("08:00");
		choiceBox10.getItems().add("08:30");
		choiceBox10.getItems().add("09:00");
		choiceBox10.setValue("06:00");

		choiceBox11 = new ChoiceBox<>();
		choiceBox11.setDisable(true);
		choiceBox11.setLayoutX(650);
		choiceBox11.setLayoutY(460);
		choiceBox11.getItems().add("06:00");
		choiceBox11.getItems().add("06:30");
		choiceBox11.getItems().add("07:00");
		choiceBox11.getItems().add("07:30");
		choiceBox11.getItems().add("08:00");
		choiceBox11.getItems().add("08:30");
		choiceBox11.getItems().add("09:00");
		choiceBox11.setValue("06:00");

		choiceBox12 = new ChoiceBox<>();
		choiceBox12.setDisable(true);
		choiceBox12.setLayoutX(580);
		choiceBox12.setLayoutY(490);
		choiceBox12.getItems().add("06:00");
		choiceBox12.getItems().add("06:30");
		choiceBox12.getItems().add("07:00");
		choiceBox12.getItems().add("07:30");
		choiceBox12.getItems().add("08:00");
		choiceBox12.getItems().add("08:30");
		choiceBox12.getItems().add("09:00");
		choiceBox12.setValue("06:00");

		choiceBox13 = new ChoiceBox<>();
		choiceBox13.setDisable(true);
		choiceBox13.setLayoutX(650);
		choiceBox13.setLayoutY(490);
		// choiceBox13.setPrefSize(60,5);
		choiceBox13.getItems().add("06:00");
		choiceBox13.getItems().add("06:30");
		choiceBox13.getItems().add("07:00");
		choiceBox13.getItems().add("07:30");
		choiceBox13.getItems().add("08:00");
		choiceBox13.getItems().add("08:30");
		choiceBox13.getItems().add("09:00");
		choiceBox13.setValue("06:00");

		listView = new ListView<>();
		// listView.setPrefSize(200, 200);
		// root.setLeftAnchor(listView, 10.0);
		listView.setLayoutX(440);
		listView.setLayoutY(310);
		listView.setMaxSize(130, 200);
		listView.getItems().addAll("Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado");
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	
		
		table.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
	    	

			if (table != null) {
				ObservableList<Aluno> agenda = table.getSelectionModel().getSelectedItems();
		        //table.getSelectionModel().clearSelection();
		        System.out.println(agenda);
		    }
		});
	
		
		
		listView.getSelectionModel().selectedItemProperty().addListener(Event -> {
			
			listView.setOnMouseReleased(e -> {

				String message = "";
				ObservableList<String> movies;
				movies = listView.getSelectionModel().getSelectedItems();

				for (String m : movies) {
					message += m;
				}

				if (message.equals("Domingo")) {
					choiceBox0.setDisable(false);
					choiceBox2.setDisable(false);

				} else {
					choiceBox0.setDisable(true);
					choiceBox2.setDisable(true);

				}

				if (message.equals("Segunda")) {
					choiceBox1.setDisable(false);
					choiceBox3.setDisable(false);

				} else {
					choiceBox1.setDisable(true);
					choiceBox3.setDisable(true);
				}

				if (message.equals("Terça")) {
					choiceBox4.setDisable(false);
					choiceBox5.setDisable(false);

				} else {
					choiceBox4.setDisable(true);
					choiceBox5.setDisable(true);
				}

				if (message.equals("Quarta")) {
					choiceBox6.setDisable(false);
					choiceBox7.setDisable(false);

				} else {
					choiceBox6.setDisable(true);
					choiceBox7.setDisable(true);
				}

				if (message.equals("Quinta")) {
					choiceBox8.setDisable(false);
					choiceBox9.setDisable(false);

				} else {
					choiceBox8.setDisable(true);
					choiceBox9.setDisable(true);
				}

				if (message.equals("Sexta")) {
					choiceBox10.setDisable(false);
					choiceBox11.setDisable(false);

				} else {
					choiceBox10.setDisable(true);
					choiceBox11.setDisable(true);
				}

				if (message.equals("Sabado")) {
					choiceBox12.setDisable(false);
					choiceBox13.setDisable(false);

				} else {
					choiceBox12.setDisable(true);
					choiceBox13.setDisable(true);
				}

			});

		});

		root.getChildren().addAll(listView, choiceBox0, choiceBox1, choiceBox2, choiceBox3, choiceBox4, choiceBox5,
				choiceBox6, choiceBox7, choiceBox8, choiceBox9, choiceBox10, choiceBox11, choiceBox12, choiceBox13,
				labeldescricao, textFielddescricao, labelvalor, textFieldvalor, labelreferencia, buttonNovo,
				buttonSalvar);

		// root.setStyle("-fx-background-color: #006400");

		Scene scene = new Scene(root, 730, 550);
		scene.getStylesheets().add("view/application.css");
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setResizable(false);

	}

	/*
	 * 
	 * public void buttonClicked() { ObservableList<String> movies; String
	 * message = ""; movies = listView.getSelectionModel().getSelectedItems();
	 * 
	 * for (String m : movies) { message += m + "\n"; }
	 * System.out.println("Numero 1" + message); //
	 * JOptionPane.showMessageDialog(null, message);
	 * 
	 * }
	 * 
	 */
}