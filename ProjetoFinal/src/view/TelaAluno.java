package view;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import org.controlsfx.control.textfield.TextFields;

import controller.Main;

//import org.controlsfx.control.textfield.TextFields;

import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;
import model.Aluno;
import model.DAO.AlunoDAO;

public class TelaAluno extends Application {

	// String path;

	private javafx.scene.control.TextArea areaCometario;

	// =================================//

	private ComboBox<String> cSexo;

	// =================================//

	private File file;

	// =================================//

	private ImageView imageview;

	// =================================//

	private TextField textFieldMatricula;
	private TextField textFieldtDataCadastro;
	private TextField textFieldAcademia;
	private TextField textFieldNome;
	private TextField textFieldNascimento;
	private TextField textFieldTelefone;
	private TextField textFieldCelular;
	private TextField textFieldEmail;

	// =================================//
	private Label labeltitulo;
	private Label labelsexo;
	private Label labelNascimento;
	private Label labelTelefone;
	private Label labelCelular;
	private Label labelEmail;
	private Label labelareaCometario;
	private Label labellMatricula;
	private Label labelAcademia;
	private Label labelDataCadastro;
	private Label labelNome;
	private Label labeltext;

	// =================================//

	private Button buttonfile;
	private javafx.scene.control.Button tabela;
	private javafx.scene.control.Button buttonSair;
	private javafx.scene.control.Button buttonselecionar;
	private Button buttonsalvar;
	private javafx.scene.control.Button buttonExcluir;
	private javafx.scene.control.Button buttonatualizar;

	// =================================//
	private TelaTabela telaTabela;
	model.Aluno aluno;
	AlunoDAO alunodao;
	Main main = new Main();
	// TelaAluno telaAluno = new TelaAluno();
	static TelaInicial telainicial;
	static Stage primaryStage;

	private BufferedImage bImage;

	public static void main(String[] args) {
		launch(args);

	}// fim do metodo main

	@Override
	public void start(Stage primaryStage) throws FileNotFoundException, Exception {

		AnchorPane layout = new AnchorPane();
		Scene scene = new Scene(layout, 735, 570);

		labeltitulo = new Label("Cadastro de Aluno");
		labeltitulo.setFont(new Font(200));
		labeltitulo.setPrefSize(180, 30);
		labeltitulo.setLayoutX(300);
		labeltitulo.setLayoutY(20);

		tabela = new javafx.scene.control.Button("Tabela");
		tabela.setPrefSize(80, 15);
		tabela.setLayoutX(645);
		tabela.setLayoutY(8);
		int tamanh = 13;
		Font fo = new Font(tamanh);
		tabela.setFont(fo);
		tabela.setOnAction(e -> {

			List<Aluno> alu = alunodao.buscarAluno();
			telaTabela = new TelaTabela(alu);
			telaTabela.setVisible(true);

		});

		primaryStage.setTitle("Personal Tuxaua");
		buttonfile = new Button(" buscar foto de aluno");
		buttonfile.setPrefSize(160, 22);
		buttonfile.setLayoutX(7);
		buttonfile.setLayoutY(228);
		buttonfile.setOnAction(buttonfileAction);

		// ,label.setStyle("-fx-background-image: url(\"/images/Flex.jpg\");");

		imageview = new ImageView();
		imageview.setFitWidth(150);
		imageview.setFitHeight(160);
		imageview.setPreserveRatio(true);

		FlowPane imageViewPanel = new FlowPane();
		imageViewPanel.setStyle("-fx-background-color:#FFFFFF");
		imageViewPanel.setLayoutX(12);
		imageViewPanel.setLayoutY(63);
		imageViewPanel.setPrefSize(150, 150);
		imageViewPanel.setAlignment(Pos.BOTTOM_LEFT);
		imageViewPanel.getChildren().addAll(imageview);

		// Executa a classe
		primaryStage.show();
		primaryStage.setResizable(false);

		// Label de matricula do aluno
		labellMatricula = new Label("Matrícula:");
		labellMatricula.setFont(new Font(15));
		labellMatricula.setPrefSize(70, 30);
		labellMatricula.setLayoutX(200);
		labellMatricula.setLayoutY(97);

		// Entrada da matricula do aluno
		textFieldMatricula = new TextField();
		textFieldMatricula.setPromptText("Matrícula do Aluno...");
		textFieldMatricula.setPrefSize(130, 29);
		textFieldMatricula.setLayoutX(200);
		textFieldMatricula.setLayoutY(123);

		// Label da data de cadastro
		labelDataCadastro = new Label("Data do Cadastro:");
		labelDataCadastro.setFont(new Font(15));
		labelDataCadastro.setPrefSize(120, 30);
		labelDataCadastro.setLayoutX(380);
		labelDataCadastro.setLayoutY(97);

		// Entrada de data de cadastro
		textFieldtDataCadastro = new TextField();
		textFieldtDataCadastro.setPromptText("Data de cadastro...");
		textFieldtDataCadastro.setPrefSize(120, 29);
		textFieldtDataCadastro.setLayoutX(380);
		textFieldtDataCadastro.setLayoutY(123);

		// Label da Academia
		labelAcademia = new Label("Academia:");
		labelAcademia.setFont(new Font(15));
		labelAcademia.setPrefSize(160, 20);
		labelAcademia.setLayoutX(200);
		labelAcademia.setLayoutY(154);

		// Entrada da Academia
		textFieldAcademia = new TextField();
		textFieldAcademia.setPromptText(" Digite Academia do aluno...");
		textFieldAcademia.setPrefSize(320, 29);
		textFieldAcademia.setLayoutX(200);
		textFieldAcademia.setLayoutY(174);

		// label do nome do aluno
		labelNome = new Label("Nome:");
		labelNome.setFont(new Font(15));
		labelNome.setPrefSize(130, 20);
		labelNome.setLayoutX(200);
		labelNome.setLayoutY(205);

		// Entrada do nome do cliente
		textFieldNome = new TextField();
		textFieldNome.setPromptText(" Digite Nome do Aluno...");
		textFieldNome.setPrefSize(320, 29);
		textFieldNome.setLayoutX(200);
		textFieldNome.setLayoutY(225);

		// label de data de nascimento
		labelNascimento = new Label("Data de Nascimento:");
		labelNascimento.setFont(new Font(14));
		labelNascimento.setPrefSize(130, 20);
		labelNascimento.setLayoutX(550);
		labelNascimento.setLayoutY(205);

		// Entrada da data de nascimento
		textFieldNascimento = new TextField();
		textFieldNascimento.setPromptText("Data de Nascimento...");
		textFieldNascimento.setPrefSize(130, 29);
		textFieldNascimento.setLayoutX(550);
		textFieldNascimento.setLayoutY(225);

		// label de email
		labelEmail = new Label("Email:");
		labelEmail.setFont(new Font(15));
		labelEmail.setPrefSize(80, 20);
		labelEmail.setLayoutX(8);
		labelEmail.setLayoutY(256);

		// Entrada do email do aluno
		textFieldEmail = new TextField();
		textFieldEmail.setPromptText(" Digite Email do Aluno...");
		textFieldEmail.setPrefSize(250, 29);
		textFieldEmail.setLayoutX(7);
		textFieldEmail.setLayoutY(276);

		// label do telefone do aluno
		labelTelefone = new Label("Telefone:");
		labelTelefone.setFont(new Font(15));
		labelTelefone.setPrefSize(88, 20);
		labelTelefone.setLayoutX(270);
		labelTelefone.setLayoutY(256);

		// Entrada do telefone do Aluno
		textFieldTelefone = new TextField();
		textFieldTelefone.setPromptText("Telefone do Aluno...");
		textFieldTelefone.setPrefSize(130, 29);
		textFieldTelefone.setLayoutX(270);
		textFieldTelefone.setLayoutY(276);

		// label do celular do aluno
		labelCelular = new Label("Celular:");
		labelCelular.setFont(new Font(15));
		labelCelular.setPrefSize(88, 20);
		labelCelular.setLayoutX(410);
		labelCelular.setLayoutY(256);

		// Entrada do nó celular do aluno
		textFieldCelular = new TextField();
		textFieldCelular.setPromptText("Celular do Aluno...");
		textFieldCelular.setPrefSize(130, 29);
		textFieldCelular.setLayoutX(410);
		textFieldCelular.setLayoutY(276);

		// label do sexo do aluno
		labelsexo = new Label("Sexo:");
		labelsexo.setFont(new Font(15));
		labelsexo.setPrefSize(50, 20);
		labelsexo.setLayoutX(550);
		labelsexo.setLayoutY(257);

		// Seleciona se a pessoa é do masculino ou feminina
		cSexo = new ComboBox<>();
		cSexo.setPromptText(" Escolher Sexo...");
		cSexo.getItems().add("Masculino");
		cSexo.getItems().add("Feminino");
		cSexo.setPrefSize(130, 27);
		cSexo.setLayoutX(550);
		cSexo.setLayoutY(277);

		// label de Area de comentário
		labelareaCometario = new Label("Area de Comentario:");
		labelareaCometario.setFont(new Font(15));
		labelareaCometario.setPrefSize(140, 20);
		labelareaCometario.setLayoutX(7);
		labelareaCometario.setLayoutY(308);

		// Area para inserir um comentário sobre o aluno
		areaCometario = new TextArea();
		areaCometario.setPrefSize(720, 185);
		areaCometario.setLayoutX(5);
		areaCometario.setLayoutY(329);

		// Area de comentário sobre o aluno
		ScrollPane scrollpane = new ScrollPane(areaCometario);

		// Botão Novo
		buttonselecionar = new javafx.scene.control.Button("buscar");
		buttonselecionar.setPrefSize(90, 27);
		buttonselecionar.setLayoutX(108);
		buttonselecionar.setLayoutY(525);
		int tamanho = 13;
		Font f = new Font(tamanho);
		buttonselecionar.setFont(f);

		buttonselecionar.setOnAction(Event -> {

			int matricula = Integer.parseInt(textFieldMatricula.getText());
			model.Aluno alu = alunodao.select(matricula);

			textFieldtDataCadastro.setText(alu.getDataCadastro());
			textFieldAcademia.setText(alu.getDataCadastro());
			textFieldNome.setText(alu.getNome());

			// cSexo.setPromptText(alu.getSexo());

			cSexo.setValue(alu.getSexo());

			textFieldNascimento.setText(alu.getNascimento());
			textFieldTelefone.setText(alu.getTelefone());
			textFieldCelular.setText(alu.getCelular());
			textFieldEmail.setText(alu.getEmail());

			ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(alu.getImage());

			BufferedImage bufferedImage = null;
			try {
				bufferedImage = ImageIO.read(byteArrayInputStream);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			Image imagem = SwingFXUtils.toFXImage(bufferedImage, null);

			imageview.setImage(imagem);
			areaCometario.setText(alu.getComentarios());

		});

		// Botão Atualizar
		buttonatualizar = new javafx.scene.control.Button("Atualizar");
		buttonatualizar.setPrefSize(90, 27);
		buttonatualizar.setLayoutX(308);
		buttonatualizar.setLayoutY(525);
		int tamanho1 = 13;
		Font f1 = new Font(tamanho1);
		buttonatualizar.setFont(f1);

		buttonatualizar.setOnAction(Event -> {

			int matricula = Integer.parseInt(textFieldMatricula.getText());
			String dataCadastro = textFieldtDataCadastro.getText();
			String nome = textFieldNome.getText();
			String academia = textFieldAcademia.getText();
			String sexo = cSexo.getValue();
			String nascimento = textFieldNascimento.getText().trim();
			String telefone = textFieldTelefone.getText();
			String celular = textFieldCelular.getText();
			String email = textFieldEmail.getText();
			BufferedImage bImage = SwingFXUtils.fromFXImage(imageview.getImage(), null);
			ByteArrayOutputStream s = new ByteArrayOutputStream();
			try {
				ImageIO.write(bImage, "png", s);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			byte[] res = s.toByteArray();
			try {
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String comentarios = areaCometario.getText();

			alunodao.atualizar(matricula, dataCadastro, nome, academia, sexo, nascimento, telefone, celular, email,
					comentarios, res);
		});

		// Botão de excluir
		setButtonExcluir(new javafx.scene.control.Button("Excluir"));
		getButtonExcluir().setPrefSize(90, 27);
		getButtonExcluir().setLayoutX(408);
		getButtonExcluir().setLayoutY(525);
		int tamanho2 = 13;
		Font f2 = new Font(tamanho2);
		getButtonExcluir().setFont(f2);

		getButtonExcluir().setOnAction(Event -> {

			int matricula = Integer.parseInt(textFieldMatricula.getText());

			AlunoDAO.delete(matricula);

			JOptionPane.showMessageDialog(null, "Cadastro excluido com sucesso");

		});

		// Botão de cancelar
		buttonSair = new javafx.scene.control.Button("Sair");
		buttonSair.setPrefSize(90, 27);
		buttonSair.setLayoutX(508);
		buttonSair.setLayoutY(525);
		int tamanho3 = 13;
		Font f3 = new Font(tamanho3);
		buttonSair.setFont(f3);

		buttonSair.setOnAction(Event -> {
			primaryStage.close();
		});

		// Botão de Salvar
		buttonsalvar = new javafx.scene.control.Button("Salvar");
		buttonsalvar.setPrefSize(90, 27);
		buttonsalvar.setLayoutX(208);
		buttonsalvar.setLayoutY(525);
		int tamanho4 = 13;
		Font f4 = new Font(tamanho4);
		buttonsalvar.setFont(f4);

		buttonsalvar.setOnAction(Event -> {

			// main.informacao(telaAluno);

			String dataCadastro = textFieldtDataCadastro.getText();
			String academia = textFieldAcademia.getText();
			String nome = textFieldNome.getText();
			String sexo = cSexo.getValue();
			String nascimento = textFieldNascimento.getText().trim();
			String telefone = textFieldTelefone.getText();
			String celular = textFieldCelular.getText();
			String email = textFieldEmail.getText();
			bImage = SwingFXUtils.fromFXImage(imageview.getImage(), null);
			ByteArrayOutputStream s = new ByteArrayOutputStream();
			
	
			try {
				ImageIO.write(bImage, "png", s);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			byte[] res = s.toByteArray();
			try {
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			String comentarios = areaCometario.getText();

			alunodao.insert(dataCadastro, academia, nome, sexo, nascimento, telefone, celular, email, res, comentarios);

		});

		scene.getStylesheets().add("view/application.css");

		// inserindo os componentes dentro do layout
		layout.getChildren().addAll(tabela, labeltitulo, imageViewPanel, buttonfile, buttonatualizar,
				getButtonExcluir(), buttonSair, buttonsalvar, buttonselecionar, labellMatricula, textFieldMatricula,
				labelDataCadastro, textFieldtDataCadastro, labelNome, textFieldNome, labelNascimento,
				textFieldNascimento, labelEmail, textFieldEmail, labelTelefone, textFieldTelefone, labelCelular,
				textFieldCelular, cSexo, labelsexo, labelareaCometario, areaCometario, textFieldAcademia,
				labelAcademia);
		// desabilitar a opção de maximizar
		primaryStage.resizableProperty().setValue(Boolean.FALSE);

		// Ligado à janela principal
		// primaryStage.initOwner(TelaInicial.primaryStage);

		// primaryStage.initOwner(primaryStage.getScene().getWindow());
		// primaryStage.initOwner(TelaInicial.primaryStage);

		// Centraliza a janela na tela
		primaryStage.centerOnScreen();

		// primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.setScene(scene);

		// Executa a classe
		primaryStage.show();
		primaryStage.setResizable(false);

	}

	EventHandler<javafx.event.ActionEvent> buttonfileAction = new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent t) {
			FileChooser fileChooser = new FileChooser();

			// Set extension filter
			FileChooser.ExtensionFilter extFilterJPG = new FileChooser.ExtensionFilter("JPG files (*.JPG)", "*.JPG");
			FileChooser.ExtensionFilter extFilterjpg = new FileChooser.ExtensionFilter("jpg files (*.jpg)", "*.jpg");
			FileChooser.ExtensionFilter extFilterPNG = new FileChooser.ExtensionFilter("PNG files (*.PNG)", "*.PNG");
			FileChooser.ExtensionFilter extFilterpng = new FileChooser.ExtensionFilter("png files (*.png)", "*.png");
			fileChooser.getExtensionFilters().addAll(extFilterJPG, extFilterjpg, extFilterPNG, extFilterpng);

			// Show open file dialog
			file = fileChooser.showOpenDialog(null);

			try {
				BufferedImage bufferedImage = ImageIO.read(file);

				Image image = SwingFXUtils.toFXImage(bufferedImage, null);
				imageview.setImage(image);
			} catch (IOException ex) {
				Logger.getLogger(TelaAluno.class.getName()).log(Level.SEVERE, null, ex);

			}
		}
	};

	public ImageView getImageview() {
		return imageview;
	}

	public void setImageview(ImageView imageview) {
		this.imageview = imageview;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public Button getButtonfile() {
		return buttonfile;
	}

	public void setButtonfile(Button buttonfile) {
		this.buttonfile = buttonfile;
	}

	public Label getLabeltext() {
		return labeltext;
	}

	public void setLabeltext(Label labeltext) {
		this.labeltext = labeltext;
	}

	public javafx.scene.control.Button getButtonSair() {
		return buttonSair;
	}

	public void setButtonSair(javafx.scene.control.Button buttonSair) {
		this.buttonSair = buttonSair;
	}

	public javafx.scene.control.Button getButtonselecionar() {
		return buttonselecionar;
	}

	public void setButtonselecionar(javafx.scene.control.Button buttonselecionar) {
		this.buttonselecionar = buttonselecionar;
	}

	public Button getButtonsalvar() {
		return buttonsalvar;
	}

	public void setButtonsalvar(Button buttonsalvar) {
		this.buttonsalvar = buttonsalvar;
	}

	public javafx.scene.control.Button getButtonExcluir() {
		return buttonExcluir;
	}

	public void setButtonExcluir(javafx.scene.control.Button buttonExcluir) {
		this.buttonExcluir = buttonExcluir;
	}

	public javafx.scene.control.Button getButtonatualizar() {
		return buttonatualizar;
	}

	public void setButtonatualizar(javafx.scene.control.Button buttonatualizar) {
		this.buttonatualizar = buttonatualizar;
	}

	public javafx.scene.control.TextArea getAreaCometario() {
		return areaCometario;
	}

	public void setAreaCometario(javafx.scene.control.TextArea areaCometario) {
		this.areaCometario = areaCometario;
	}

	public Label getLabelareaCometario() {
		return labelareaCometario;
	}

	public void setLabelareaCometario(Label labelareaCometario) {
		this.labelareaCometario = labelareaCometario;
	}

	public TextField getTextFieldMatricula() {
		return textFieldMatricula;
	}

	public void setTextFieldMatricula(TextField textFieldMatricula) {
		this.textFieldMatricula = textFieldMatricula;
	}

	public Label getLabellMatricula() {
		return labellMatricula;
	}

	public void setLabellMatricula(Label labellMatricula) {
		this.labellMatricula = labellMatricula;
	}

	public TextField getTextFieldtDataCadastro() {
		return textFieldtDataCadastro;
	}

	public void setTextFieldtDataCadastro(TextField textFieldtDataCadastro) {
		this.textFieldtDataCadastro = textFieldtDataCadastro;
	}

	public Label getLabelAcademia() {
		return labelAcademia;
	}

	public void setLabelAcademia(Label labelAcademia) {
		this.labelAcademia = labelAcademia;
	}

	public TextField getTextFieldAcademia() {
		return textFieldAcademia;
	}

	public void setTextFieldAcademia(TextField textFieldAcademia) {
		this.textFieldAcademia = textFieldAcademia;
	}

	public Label getLabelDataCadastro() {
		return labelDataCadastro;
	}

	public void setLabelDataCadastro(Label labelDataCadastro) {
		this.labelDataCadastro = labelDataCadastro;
	}

	public TextField getTextFieldNome() {
		return textFieldNome;
	}

	public void setTextFieldNome(TextField textFieldNome) {
		this.textFieldNome = textFieldNome;
	}

	public Label getLabelNome() {
		return labelNome;
	}

	public void setLabelNome(Label labelNome) {
		this.labelNome = labelNome;
	}

	public ComboBox<String> getcSexo() {
		return cSexo;
	}

	public void setcSexo(ComboBox<String> cSexo) {
		this.cSexo = cSexo;
	}

	public Label getLabelsexo() {
		return labelsexo;
	}

	public void setLabelsexo(Label labelsexo) {
		this.labelsexo = labelsexo;
	}

	public TextField getTextFieldNascimento() {
		return textFieldNascimento;
	}

	public void setTextFieldNascimento(TextField textFieldNascimento) {
		this.textFieldNascimento = textFieldNascimento;
	}

	public Label getLabelNascimento() {
		return labelNascimento;
	}

	public void setLabelNascimento(Label labelNascimento) {
		this.labelNascimento = labelNascimento;
	}

	public TextField getTextFieldTelefone() {
		return textFieldTelefone;
	}

	public void setTextFieldTelefone(TextField textFieldTelefone) {
		this.textFieldTelefone = textFieldTelefone;
	}

	public Label getLabelTelefone() {
		return labelTelefone;
	}

	public void setLabelTelefone(Label labelTelefone) {
		this.labelTelefone = labelTelefone;
	}

	public TextField getTextFieldCelular() {
		return textFieldCelular;
	}

	public void setTextFieldCelular(TextField textFieldCelular) {
		this.textFieldCelular = textFieldCelular;
	}

	public Label getLabelCelular() {
		return labelCelular;
	}

	public void setLabelCelular(Label labelCelular) {
		this.labelCelular = labelCelular;
	}

	public TextField getTextFieldEmail() {
		return textFieldEmail;
	}

	public void setTextFieldEmail(TextField textFieldEmail) {
		this.textFieldEmail = textFieldEmail;
	}

	public Label getLabelEmail() {
		return labelEmail;
	}

	public void setLabelEmail(Label labelEmail) {
		this.labelEmail = labelEmail;
	}

	public EventHandler<javafx.event.ActionEvent> getButtonfileAction() {
		return buttonfileAction;
	}

	public void setButtonfileAction(EventHandler<javafx.event.ActionEvent> buttonfileAction) {
		this.buttonfileAction = buttonfileAction;
	}

}