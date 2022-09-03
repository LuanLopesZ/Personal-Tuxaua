package view;

import java.util.HashSet;
import java.util.List;

import javax.swing.JTable;

import org.apache.derby.jdbc.AutoloadedDriver;
import org.controlsfx.control.textfield.AutoCompletionBinding;
import org.controlsfx.control.textfield.TextFields;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;
import model.Aluno;
import model.DAO.AlunoDAO;
import javax.swing.table.DefaultTableModel;

public class TelaBuscaAluno extends Application {

	private AutoCompletionBinding<String> autoCompletionBinding;
	model.Aluno aluno;
	private static TableView<Aluno> tabela;
	private static JTable tabela1;

	private VBox hb;
	private AnchorPane paneBusca;

	private Button confirmaButton;
	private Button buttonsair;
	private TextField buscaNome;
	private Label labelbuscar;

	private TableColumn fotoColumn;
	private TableColumn matriculaColumn;
	private TableColumn nomeColum;
	private TableColumn dataNascColum;
	private TableColumn sexoColum;
	private TableColumn dataCadastColum;
	private TableColumn emailCol;
	private TableColumn celularColum;
	private TableColumn fixolColum;
	private TableColumn telefoneColum;
	private TableColumn academiaColum;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		// Desabilitar a opção de maximizar
		primaryStage.resizableProperty().setValue(Boolean.FALSE);

		hb = new VBox();
		hb.setLayoutX(20);
		hb.setLayoutY(30);
		hb.setMaxHeight(490);

		paneBusca = new AnchorPane(hb);

		// Configuraï¿½ï¿½o Stage
		Scene scene = new Scene(new Group(paneBusca));
		primaryStage.setTitle("Personal Tuxaua");
		primaryStage.setWidth(1050);
		primaryStage.setHeight(370);
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.show();

		confirmaButton = new Button("Confirmar");
		confirmaButton = new Button("Confirmar");
		confirmaButton.setPrefSize(70, 15);
		confirmaButton.setLayoutX(950);
		confirmaButton.setLayoutY(340);

		confirmaButton.setOnAction(e -> {

		});

		buttonsair = new Button("Sair");
		buttonsair.setPrefSize(70, 15);
		buttonsair.setLayoutX(875);
		buttonsair.setLayoutY(340);

		buttonsair.setOnAction(e -> {
			primaryStage.close();
		});
		tabela1 = new JTable();
		tabela1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "matricula", "nome", "sexo", "email" }) {

			boolean[] canEdit = new boolean[] { false, false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});

		fotoColumn = new TableColumn("Foto");
		fotoColumn.setMinWidth(80);
		fotoColumn.setCellValueFactory(new PropertyValueFactory<Aluno, String>("image"));

		matriculaColumn = new TableColumn("Matricula");
		matriculaColumn.setMinWidth(20);
		matriculaColumn.setCellValueFactory(new PropertyValueFactory<Aluno, String>("matricula"));

		nomeColum = new TableColumn("Nome");
		nomeColum.setMinWidth(140);
		nomeColum.setCellValueFactory(new PropertyValueFactory<Aluno, String>("nome"));

		dataNascColum = new TableColumn("Data de Nascimento");
		dataNascColum.setMinWidth(120);
		dataNascColum.setCellValueFactory(new PropertyValueFactory<Aluno, String>("nascimento"));

		sexoColum = new TableColumn("Sexo");
		sexoColum.setMinWidth(80);
		sexoColum.setCellValueFactory(new PropertyValueFactory<Aluno, String>("sexo"));

		dataCadastColum = new TableColumn("Data de Cadastro");
		dataCadastColum.setMinWidth(120);
		dataCadastColum.setCellValueFactory(new PropertyValueFactory<Aluno, String>("dataCadastro"));

		academiaColum = new TableColumn("Academia");
		academiaColum.setMinWidth(80);
		academiaColum.setCellValueFactory(new PropertyValueFactory<Aluno, String>("academia"));

		telefoneColum = new TableColumn("Telefone");
		telefoneColum.setMinWidth(100);
		telefoneColum.setCellValueFactory(new PropertyValueFactory<Aluno, String>("telefone"));

		fixolColum = new TableColumn("Fixo");
		fixolColum.setMinWidth(100);
		fixolColum.setCellValueFactory(new PropertyValueFactory<Aluno, String>("fixo"));

		celularColum = new TableColumn("Celular");
		celularColum.setMinWidth(100);
		celularColum.setCellValueFactory(new PropertyValueFactory<Aluno, String>("celular"));

		emailCol = new TableColumn("Email");
		emailCol.setMinWidth(100);
		emailCol.setCellValueFactory(new PropertyValueFactory<Aluno, String>("email"));

		// tabela.setItems(aluno.popularizarTable());

		tabela = new TableView<Aluno>();
		tabela.setPrefSize(1000, 290);
		tabela.setLayoutX(50);
		tabela.setLayoutY(50);
		hb.getChildren().add(tabela);

		telefoneColum.getColumns().addAll(fixolColum, celularColum);
		tabela.getColumns().addAll(fotoColumn, matriculaColumn, nomeColum, dataNascColum, sexoColum, dataCadastColum,
				academiaColum, telefoneColum, emailCol);

		labelbuscar = new Label("Buscar Aluno");
		labelbuscar.setFont(new Font("Arial", 13));
		labelbuscar.setPrefSize(100, 30);
		labelbuscar.setLayoutX(18);
		labelbuscar.setLayoutY(325);

		buscaNome = new TextField();
		buscaNome.setPrefSize(500, 30);
		buscaNome.setLayoutX(100);
		buscaNome.setLayoutY(325);
		buscaNome.setPromptText("Buscar Por Nome");

		buscaNome.setOnKeyReleased(e -> {

			String nome = buscaNome.getText();

		});

		paneBusca.getChildren().addAll(buttonsair, confirmaButton, buscaNome, labelbuscar);
		paneBusca.setMaxSize(1700, 300);
		paneBusca.maxWidth(50);
		paneBusca.maxWidth(50);
		primaryStage.setScene(scene);

	}

}