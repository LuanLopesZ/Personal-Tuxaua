package view;

// Importação de class
import java.util.List;
import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import model.Aluno;
import model.AntropometriaCircunferenciasMusculares;
import model.AntropometriaGeral;
import model.ComposicaoCorporal;
import model.Escapula;
import model.EspIlicAntPost;
import model.Joelhos;
import model.Joelhos2;
import model.PosicaoPes;
import model.TriangDTal;
import model.DAO.Abdomen2DAO;
import model.DAO.AlunoDAO;
import model.DAO.AntropometriaCircunferenciasMuscularesDAO;
import model.DAO.AntropometriaDobrasCutaneasDAO;
import model.DAO.AntropometriaGeralDAO;
import model.DAO.AvaliacaoDAO;
import model.DAO.CifoseToracDAO;
import model.DAO.ColunaDAO;
import model.DAO.ComentarioFinalDAO;
import model.DAO.ComposicaoCorporalDAO;
import model.DAO.EscapulaDAO;
import model.DAO.EspIlicAntPostDAO;
import model.DAO.EspIlicaAntPostDAO;
import model.DAO.FemurDAO;
import model.DAO.IndiceCinturaQuadrilDAO;
import model.DAO.Joelhos2DAO;
import model.DAO.JoelhosDAO;
import model.DAO.LordCervicalDAO;
import model.DAO.LordLobDAO;
import model.DAO.Ombro2DAO;
import model.DAO.OmbrovlDAO;
import model.DAO.PescocoDAO;
import model.DAO.PosicaoDosPesDAO;
import model.DAO.TibiaDAO;
import model.DAO.TriangDTalDAO;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import javafx.scene.text.Font;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;

public class TelaAvaliacao extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	ObservableList<String> CheckBoxList = FXCollections.observableArrayList();
	
	//===============================//
	private Tab iCQ_tab;
	private Tab geral_tab;
	private Tab Circun_tab;
	private Tab dob_tab;
	private Tab comp_tab;
	private Tab post_tab;
	
	//===============================//
	
	private TextArea observacaoA;
	private TextArea objetivoA;
	private TextArea atividPretAcadF;
	private TextArea periodicidadeA;
	
	//===============================//
	
	private Button tabela;
	private Button buttonConfirmar;
	
	//===============================//
	private RadioButton radioPost;
	private RadioButton radioAnt;
	private RadioButton radioLat;
	//===============================//
	
	private TextField textFieldMatricula;
	private TextField textFielddataAvaliacao;
	private TextField textFieldvaliadAvaliacF;
	private TextField textFieldmassCorpTotalF;
	private TextField textFieldestaturaF;
	private TextField textFieldfreqCardRepF;
	private TextField textFieldPreArtSistRepoF;
	private TextField textFieldPresArtDiaRepF;
	private TextField textFieldombroF;
	private TextField textFieldtoraxF;
	private TextField textFieldbustoF;
	private TextField textFieldbracoDirF;
	private TextField textFieldantBracDirF;
	private TextField textFieldbracoEsqF;
	private TextField textFieldantBracEsqF;
	private TextField textFieldcinturaF;
	private TextField textFieldabdomenF;
	private TextField textFieldquadrilF;
	private TextField textFiledcoxaDirF;
	private TextField textFieldcoxaEsqF;
	private TextField textFieldpernaEsqF;
	private TextField textFieldpernaDirF;
	private TextField textFildtricF;
	private TextField textFildsubCapF;
	private TextField textFildbicipitalF;
	private TextField textFildpeitoralF;
	private TextField textFildaxilarMediaF;
	private TextField textFildsuprailiacaF;
	private TextField textFildabdominalF;
	private TextField textFildcoxaAnteriorF;
	private TextField textFildpernaF;
	private TextField textFildmassCorpTotal2F;
	private TextField textFildpercentGorduraF;
	private TextField textFildmasCopIdF;
	private TextField textFildmasCorpGordaF;
	private TextField textFildmasCopMagraF;
	private TextField textFildexGordCorpF;
	private TextField textFildcirCintAvaTestFi;
	private TextField textFildcircQuadAvalTestF;
	private TextField textFildrelaCintQuadF;
	private TextField textFieldriscoF;
	
	//===============================//
	private Label labellMatricula;
	private Label labelantropGeral;
	private Label labeldataAvaliacao;
	private Label labelvalidaAvaliacao;
	private Label massCorpTotal;
	private Label estatura;
	private Label freqCardRep;
	private Label PreArtSistRepo;
	private Label PresArtDiaRep;
	private Label coment;
	private Label kg;
	private Label m;
	private Label bpm;
	private Label mmhg;
	private Label mmhg2;
	private Label posicaoPes;
	private Label tibia;
	private Label joelhos;
	private Label femur;
	private Label espIlicaAntPost;
	private Label ombro2;
	private Label pescoco;
	private Label triangDTal;
	private Label joelhos2;
	private Label espIlicAntPost;
	private Label ombrovl;
	private Label abdomen2;
	private Label coluna;
	private Label lordLob;
	private Label lordCervical;
	private Label cifoseTorac;
	private Label escapula;
	private Label observacao;
	private Label cm17;
	private Label avaliacaoPost;
	private Label periodicidade;
	private Label atividPretAcad;
	private Label cirCintAvaTest;
	private Label circQuadAvalTest;
	private Label cm18;
	private Label risco;
	private Label relaCintQuad;
	private Label icq;
	private Label objetivo;
	private Label kg6;
	//===============================//

	private CheckBox esqPronado;
	private CheckBox dirSupinado;
	private CheckBox alinhado;
	private CheckBox esqSupinado;
	private CheckBox dirPronado;
	private CheckBox alinhada;
	private CheckBox esqVara;
	private CheckBox dirVara;
	private CheckBox esqValgo;
	private CheckBox dirValgo;
	private CheckBox alinhados;
	private CheckBox esqVaraJ;
	private CheckBox dirVaraJ;
	private CheckBox esqValgoJ;
	private CheckBox dirValgoJ;
	private CheckBox torcaoInterna;
	private CheckBox torcaoExterna;
	private CheckBox alinhadoEs;
	private CheckBox esqDeprimido;
	private CheckBox dirDeprimido;
	private CheckBox alinhadoOm;
	private CheckBox esqDeprimidoOm;
	private CheckBox dirDeprimidoOm;
	private CheckBox alinhadoPe;
	private CheckBox esqInclinLateral;
	private CheckBox dirInclinLateral;
	private CheckBox simetricos;
	private CheckBox agudosADir;
	private CheckBox agudosAEsq;
	private CheckBox alinhadosVL;
	private CheckBox recurvatum;
	private CheckBox semifletido;
	private CheckBox alinhadovl;
	private CheckBox av;
	private CheckBox rv;
	private CheckBox alinhadoOmvl;
	private CheckBox protusos;
	private CheckBox retraidos;
	private CheckBox fisiologica;
	private CheckBox aumentada;
	private CheckBox retificada;
	private CheckBox fisiologicaCT;
	private CheckBox aumentadaCT;
	private CheckBox retificadaCT;
	private CheckBox fisiologicaLL;
	private CheckBox aumentadaLL;
	private CheckBox retificadall;
	private CheckBox normotrofico;
	private CheckBox protuso;
	private CheckBox alinhadaCO;
	private CheckBox escolioseLombarDir;
	private CheckBox escolioseLombarEsq;
	private CheckBox escolioseToracicaDir;
	private CheckBox escolioseToracicaEsq;
	private CheckBox escolioseDorsoLombarDir;
	private CheckBox escolioseDorsoLombarEsq;
	private CheckBox escolioseEmS;
	private CheckBox alinhadaEs;
	private CheckBox esqAbduzida;
	private CheckBox dirAbduzida;
	private CheckBox esqAduzida;
	private CheckBox dirAduzida;
	private CheckBox rodadaAImEsq;
	private CheckBox rodadaAInfDir;
	private CheckBox rodadaASupEsq;
	private CheckBox rodadaSupDir;
	private CheckBox esqAlada;
	private CheckBox dirAlada;

	//===============================//

	private TelaTabela telaTabela;
	AvaliacaoDAO avaliacaodao;
	AntropometriaGeral antropometriaGeral;
	AntropometriaGeralDAO antropometriaGeralDAO;
	IndiceCinturaQuadrilDAO indiceCinturaQuadrilDAO;
	ComposicaoCorporalDAO composicaoCorporalDAO;
	AntropometriaDobrasCutaneasDAO antropometriaDobrasCutaneasDAO;
	AntropometriaCircunferenciasMuscularesDAO antropometriaCircunferenciasMuscularesDAO;
	ComentarioFinalDAO comentarioFinalDAO;
	PosicaoDosPesDAO posicaoDosPesDAO;
	TibiaDAO tibiaDAO;
	JoelhosDAO joelhosDAO;
	model.Aluno aluno;
	FemurDAO femurDAO;
	EspIlicaAntPostDAO espIlicaAntPostDAO;
	Ombro2DAO ombro2dao;
	TriangDTalDAO triangDTalDAO;
	PescocoDAO pescocoDAO;
	EspIlicAntPostDAO espIlicAntPostDAO;
	Joelhos2DAO joelhos2dao;
	OmbrovlDAO ombrovlDAO;
	LordCervicalDAO lordCervicalDAO;
	CifoseToracDAO cifoseToracDAO;
	LordLobDAO lordLobDAO;
	Abdomen2DAO abdomen2dao;
	ColunaDAO colunaDAO;
	EscapulaDAO escapulaDAO;
	AlunoDAO alunodao;
	


	public void start(Stage primaryStage) throws Exception {

		// Declaração TabPane
		TabPane tp = new TabPane();
		// Código de trava de TabPane
		tp.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);

		// Criação de Layouts (Antropometria- Geral,Circunferï¿½ncias
		// Musculares,Dobras Cutânias,composiçãoo Corporal,Avaliação
		// Postural,Visão /Anterior/Lateral/Posterior,ICQ)
		AnchorPane layoutGeral = new AnchorPane();
		AnchorPane layoutCircun = new AnchorPane();
		AnchorPane layoutDobcut = new AnchorPane();
		AnchorPane layoutCompCorp = new AnchorPane();
		AnchorPane layoutVisaoAnt = new AnchorPane();
		AnchorPane layoutVisaoLat = new AnchorPane();
		AnchorPane layoutVisaoPost = new AnchorPane();
		AnchorPane layoutICQ = new AnchorPane();

		///////////////////////////////////////////// Tab Antropometria Geral
		///////////////////////////////////////////// //////////////////////////////////////////////

		// Declaração Tab geral_tab
		geral_tab = new Tab("Geral");
		
		
		
		tabela = new javafx.scene.control.Button("Tabela");
		tabela.setPrefSize(80, 15);
		tabela.setLayoutX(900);
		tabela.setLayoutY(8);
		int tamanh= 13;
		Font fo = new Font(tamanh);
		tabela.setFont(fo);
		tabela.setOnAction(e -> {
			
			 List<Aluno> alu = alunodao.buscarAluno();
			 telaTabela = new TelaTabela(alu);
			 telaTabela.setVisible(true);

		});

		
		labellMatricula = new Label("Matrícula:");
		labellMatricula.setFont(new Font(15));
		labellMatricula.setPrefSize(70, 20);
		labellMatricula.setLayoutX(96);
		labellMatricula.setLayoutY(180);

		// Entrada da matricula do aluno
		textFieldMatricula = new TextField();
		textFieldMatricula.setPromptText("Matrícula do Aluno...");
		textFieldMatricula.setPrefSize(130, 25);
		textFieldMatricula.setLayoutX(96);
		textFieldMatricula.setLayoutY(200);

		

		// Criação  de variável Label - antropGeral
		labelantropGeral = new Label("Antropometria  Geral");
		// Tamanho de Fonte de Label- antropGeral
		labelantropGeral.setFont(new Font(30));
		// Posicionamento Nó Label- antropGeral
		labelantropGeral.setLayoutX(350);
		labelantropGeral.setLayoutY(20);

		// Criação de variável Label- dataAvaliac
		labeldataAvaliacao = new Label("Data da Avaliação");
		// Tamanho de Fonte Label- dataAvaliac
		labeldataAvaliacao.setFont(new Font(12));
		// Posicionamento Nó Label- dataAvaliac
		labeldataAvaliacao.setLayoutX(100);
		labeldataAvaliacao.setLayoutY(240);

		// Declaração  de variável TextField- dataAvaliac
		textFielddataAvaliacao = new TextField();
		// Tamanho TextField- datAvaliacao
		textFielddataAvaliacao.setMaxSize(100, 100);
		// Posicionamento Nó TextField- datAvaliacao
		textFielddataAvaliacao.setLayoutX(100);
		textFielddataAvaliacao.setLayoutY(260);

		// Criação de variável Label- validAvaliac
		labelvalidaAvaliacao = new Label("Validade da Avaliação");
		// Tamanho de Fonte Label- validAvaliac
		labelvalidaAvaliacao.setFont(new Font(12));
		// Posicionamento Nó Label- validAvaliac
		labelvalidaAvaliacao.setLayoutX(270);
		labelvalidaAvaliacao.setLayoutY(240);

		// Declaração de Nó  TextField- validAvaliacF
		textFieldvaliadAvaliacF = new TextField();
		// Tamanho de TextField- validAvaliacF
		textFieldvaliadAvaliacF.setMaxSize(100, 100);
		// Posicionamento Nó Label- validAvaliacF
		textFieldvaliadAvaliacF.setLayoutX(270);
		textFieldvaliadAvaliacF.setLayoutY(260);

		massCorpTotal = new Label("Massa Corporal Total :");
		// Tamanho de Fonte de TextField- massCorpTotal
		massCorpTotal.setFont(new Font(15));
		// Posicionamento Nó Label- massCorpTotal
		massCorpTotal.setLayoutX(100);
		massCorpTotal.setLayoutY(300);

		textFieldmassCorpTotalF = new TextField();
		// Tamanho de TextField- massCorpTotalF
		textFieldmassCorpTotalF.setMaxSize(50, 50);
		// Posicionamento Nó TextField- massCorpTotalF
		textFieldmassCorpTotalF.setLayoutX(360);
		textFieldmassCorpTotalF.setLayoutY(300);

		// Criação de Variável Label- kg
		kg = new Label("kg");
		// Posicionamento Nó Label- kg
		kg.setLayoutX(420);
		kg.setLayoutY(300);

		// Criação de Variável Label- estatura
		estatura = new Label("Estatura:");
		// Tamanho de Label- estatura
		estatura.setFont(new Font(15));
		// Posicionamento Nó Label- estatura
		estatura.setLayoutX(100);
		estatura.setLayoutY(340);

		// Declaração de variável TextField- estaturaF
		textFieldestaturaF = new TextField();
		// Tamanho de TextField- estaturaF
		textFieldestaturaF.setMaxSize(50, 50);
		// Posicionamento Nó TextField- estaturaF
		textFieldestaturaF.setLayoutX(360);
		textFieldestaturaF.setLayoutY(340);

		// Criação de variável m
		m = new Label("m");
		// Posicionamento Nó Label- m
		m.setLayoutX(420);
		m.setLayoutY(340);

		// Criação de variável Label- freqCardRep
		freqCardRep = new Label("Frequência cardíaca em Repouso:");
		// Tamanho de fonte Label- freqCardRep
		freqCardRep.setFont(new Font(15));
		// Posicionamento Nó Label- freqCardRep
		freqCardRep.setLayoutX(100);
		freqCardRep.setLayoutY(380);

		// Declaraï¿½ï¿½o de variável TextField- freqCardRepF
		textFieldfreqCardRepF = new TextField();
		textFieldfreqCardRepF.setMaxSize(50, 50);
		// Posicionamento Nó TextField- freqCardRepF
		textFieldfreqCardRepF.setLayoutX(360);
		textFieldfreqCardRepF.setLayoutY(380);

		// Criação  de variável Label-bpm
		bpm = new Label("bpm");
		// Posicionamento Nó Label- bpm
		bpm.setLayoutX(420);
		bpm.setLayoutY(380);

		// Criação  de variável -Label- PreArtSistRepo
		PreArtSistRepo = new Label("Pressão arterial sistêmica em repouso:");
		// Tamanho de fonte Label- PreArtSistRepo
		PreArtSistRepo.setFont(new Font(15));
		// Posicionamento Nï¿½ Label- PreArtSistRepo
		PreArtSistRepo.setLayoutX(100);
		PreArtSistRepo.setLayoutY(420);

		// Declaraão  de variável TextField- PreArtSistRepoF
		textFieldPreArtSistRepoF = new TextField();
		// Tamanho de Nnó TextField- PreArtSistRepoF
		textFieldPreArtSistRepoF.setMaxSize(50, 50);
		// Posicionamento Nó TextField- PreArtSistRepoF
		textFieldPreArtSistRepoF.setLayoutX(360);
		textFieldPreArtSistRepoF.setLayoutY(420);

		// Criaï¿½ï¿½o de variável Label-mmhg
		mmhg = new Label("mmhg");
		//// Posicionamento Nó Label- mmhg
		mmhg.setLayoutX(420);
		mmhg.setLayoutY(420);

		// Criação de variável-Label- PresArtDiaRep
		PresArtDiaRep = new Label("Pressão arterial diastólica em repouso:");
		// Tamanho de fonte Label- PresArtDiaRep
		PresArtDiaRep.setFont(new Font(15));
		// Posicionamento Nó Label- PresArtDiaRep
		PresArtDiaRep.setLayoutX(100);
		PresArtDiaRep.setLayoutY(460);

		// Declaração de variável TextField- PresArtDiaRepF
		textFieldPresArtDiaRepF = new TextField();
		// Tamanho de TextField- PresArtDiaRepF
		textFieldPresArtDiaRepF.setMaxSize(50, 50);
		// Posicionamento Nó TextField- PresArtDiaRepF
		textFieldPresArtDiaRepF.setLayoutX(360);
		textFieldPresArtDiaRepF.setLayoutY(460);

		// Criaçaõ  de variável -Label mmhg
		mmhg2 = new Label("mmhg");
		//// Posicionamento Nó Label- mmhg
		mmhg2.setLayoutX(420);
		mmhg2.setLayoutY(460);

		layoutGeral.getChildren().addAll(tabela,labellMatricula,textFieldMatricula,labeldataAvaliacao, textFielddataAvaliacao, labelvalidaAvaliacao,
				textFieldvaliadAvaliacF, massCorpTotal, kg, textFieldmassCorpTotalF, estatura, m, textFieldestaturaF, freqCardRep, bpm,
				textFieldfreqCardRepF, PreArtSistRepo, textFieldPreArtSistRepoF, PresArtDiaRep, mmhg, textFieldPresArtDiaRepF, mmhg2);
		layoutGeral.setPadding(new Insets(5));
		geral_tab.setContent(layoutGeral);

		// Declaração Tap Circun_tab
		Circun_tab = new Tab("Circunferência Musculares");

		// Criação de variável Label- circun
		Label circun = new Label("Circunfência Musculares");
		// Tamanho de fonte Label- circun
		circun.setFont(new Font(30));
		// Posicionamento Nó Label- circun
		circun.setLayoutX(350);
		circun.setLayoutY(20);

		// Criação de variável  Label- ombro
		Label ombro = new Label("Ombro=");
		// Tamanho de fonte Label- ombro
		ombro.setFont(new Font(15));
		// Posicionamento Nï¿½ Label-ombro
		ombro.setLayoutX(100);
		ombro.setLayoutY(130);
		// Declaração de variável TextField ombroF
		textFieldombroF = new TextField();
		// Tamanho de TextField- ombro
		textFieldombroF.setMaxSize(50, 50);
		// Posicionamento Nï¿½ TextField- ombroF
		textFieldombroF.setLayoutX(210);
		textFieldombroF.setLayoutY(130);
		// Criação de variável Label cm1
		Label cm1 = new Label("cm");
		// Posicionamento Nó Label- cm1
		cm1.setLayoutX(270);
		cm1.setLayoutY(130);

		// Criação de variável  Label- torax
		Label torax = new Label("Tórax=");
		// Tamanho de Nï¿½ fonte Label- torax
		torax.setFont(new Font(15));
		// Posicionamento Nï¿½ Label- torax
		torax.setLayoutX(100);
		torax.setLayoutY(180);
		// Declaração  de variável TextField- toraxF
		textFieldtoraxF = new TextField();
		// Tamanho de TextField- toraxF
		textFieldtoraxF.setMaxSize(50, 50);
		// Posicionamento Nó TextField- toraxf
		textFieldtoraxF.setLayoutX(210);
		textFieldtoraxF.setLayoutY(180);
		// Criação de variável Label- cm2
		Label cm2 = new Label("cm");
		// Posicionamento Nó Label- cm2
		cm2.setLayoutX(270);
		cm2.setLayoutY(180);

		// Criação de variável Label- busto
		Label busto = new Label("Busto=");
		// Tamanho de fonte Label- Ombro
		busto.setFont(new Font(15));
		// Posicionamento Nó Label- busto
		busto.setLayoutX(100);
		busto.setLayoutY(230);
		/// Declaração de variável TextField- bustoF
		textFieldbustoF = new TextField();
		// Tamanho de TextField- bustoF
		textFieldbustoF.setMaxSize(50, 50);
		// Posicionamento Nó  TextField- bustoF
		textFieldbustoF.setLayoutX(210);
		textFieldbustoF.setLayoutY(230);
		// Criaï¿½ï¿½o de variï¿½vel Label-cm
		Label cm3 = new Label("cm");
		// Posicionamento Nó Label- cm
		cm3.setLayoutX(270);
		cm3.setLayoutY(230);

		// Criação de variável Label- bracoDir
		Label bracoDir = new Label("Braço dir.=");
		// Tamanho de fonte Label- bracoDir
		bracoDir.setFont(new Font(15));
		// Posicionamento Nó Label- bracoDir
		bracoDir.setLayoutX(100);
		bracoDir.setLayoutY(280);
		/// Declaração de variável TextField- bracoDirF
		textFieldbracoDirF = new TextField();
		// Tamanho de TextField- bracoDirF
		textFieldbracoDirF.setMaxSize(50, 50);
		// Posicionamento Nó TextField- bracoDirF
		textFieldbracoDirF.setLayoutX(210);
		textFieldbracoDirF.setLayoutY(280);
		// Criação de variável Label-cm4.
		Label cm4 = new Label("cm");
		// Posicionamento Nó Label- cm4
		cm4.setLayoutX(270);
		cm4.setLayoutY(280);

		// Criação de Variável Label- antBracDir
		Label antBracDir = new Label("Antebraço dir.=");
		// Tamanho de fonte Label- antBracDir
		antBracDir.setFont(new Font(15));
		// Posicionamento Nó Label-antBracDir
		antBracDir.setLayoutX(100);
		antBracDir.setLayoutY(330);
		/// Declaração de variável TextField- antBracDirF
		textFieldantBracDirF = new TextField();
		// Tamanho de TextField- antBracDirF
		textFieldantBracDirF.setMaxSize(50, 50);
		// Posicionamento Nï¿½ TextField- antBracDirF
		textFieldantBracDirF.setLayoutX(210);
		textFieldantBracDirF.setLayoutY(330);
		// Criaçãod e variável Label- cm5
		Label cm5 = new Label("cm");
		// Posicionamento Nó Label- cm5
		cm5.setLayoutX(270);
		cm5.setLayoutY(330);

		// Criação de variável  Label- bracoEsq
		Label bracoEsq = new Label("Braço esq.=");
		// Tamanho de fonte Label- bracoEsq
		bracoEsq.setFont(new Font(15));
		// Posicionamento Nó Label- bracoEsq
		bracoEsq.setLayoutX(100);
		bracoEsq.setLayoutY(380);
		// Declaração de variável  TextField- bracoEsqF
		textFieldbracoEsqF = new TextField();
		// Tamanho de TextField- bracoEsqF
		textFieldbracoEsqF.setMaxSize(50, 50);
		// Posicionamento Nó TextField- bracoEsqF
		textFieldbracoEsqF.setLayoutX(210);
		textFieldbracoEsqF.setLayoutY(380);
		// Declaração de variável  Label- cm6
		Label cm6 = new Label("cm");
		// Posicionamento Nï¿½ Label- cm6
		cm6.setLayoutX(270);
		cm6.setLayoutY(380);

		// Criação de variável Label- antBracEsq
		Label antBracEsq = new Label("Antebraço esq.=");
		// Tamanho de fonte Label- antBracEsq
		antBracEsq.setFont(new Font(15));
		// Posicionamento Nó Label- antBracEsq
		antBracEsq.setLayoutX(100);
		antBracEsq.setLayoutY(430);
		// Declaração de variável  TextField- antBracEsqF
		textFieldantBracEsqF = new TextField();
		// Tamanho de TextField- antBracEsqF
		textFieldantBracEsqF.setMaxSize(50, 50);
		// Posicionamento Nï¿½ TextField- antBracEsqF
		textFieldantBracEsqF.setLayoutX(210);
		textFieldantBracEsqF.setLayoutY(430);
		// Criação de variável Label- cm7
		Label cm7 = new Label("cm");
		// Posicionamento Nó Label- cm7
		cm7.setLayoutX(270);
		cm7.setLayoutY(430);

		// Criação de variávelLabel- cintura
		Label cintura = new Label("Cintura=");
		// Tamanho de fonte Label- cintura
		cintura.setFont(new Font(15));
		// Posicionamento Nï¿½ Label- cintura
		cintura.setLayoutX(500);
		cintura.setLayoutY(130);
		// Declaração de variável  TextField-cinturaF
		textFieldcinturaF = new TextField();
		// Tamanho de TextField- cinturaF
		textFieldcinturaF.setMaxSize(50, 50);
		// Posicionamento Nó TextField- cinturaF
		textFieldcinturaF.setLayoutX(600);
		textFieldcinturaF.setLayoutY(130);
		// Criação de variável Label- cm8
		Label cm8 = new Label("cm");
		// Posicionamento Nó Label- cm8
		cm8.setLayoutX(660);
		cm8.setLayoutY(130);

		// Criação de variável Label- abdomen
		Label abdomen = new Label("Abdômen=");
		// Tamanho de fonte Label- abdomen
		abdomen.setFont(new Font(15));
		// Posicionamento Nó Label- abdomen
		abdomen.setLayoutX(500);
		abdomen.setLayoutY(180);
		// Declaração de variável  TextField- abdomenF
		textFieldabdomenF = new TextField();
		textFieldabdomenF.setMaxSize(50, 50);
		// Posicionamento Nó TextField- abdomenF
		textFieldabdomenF.setLayoutX(600);
		textFieldabdomenF.setLayoutY(180);
		// Criação de variável Label - cm9
		Label cm9 = new Label("cm");
		// Posicionamento Nó Label- cm9
		cm9.setLayoutX(660);
		cm9.setLayoutY(180);

		// Criação de variável Label - quadril
		Label quadril = new Label("Quadril=");
		// Tamanho de fonte Label- quadril
		quadril.setFont(new Font(15));
		// Posicionamento Nó Label- quadril
		quadril.setLayoutX(500);
		quadril.setLayoutY(230);
		// Declaração de variável TextField- quadrilF
		textFieldquadrilF = new TextField();
		// Tamanho de TextField- quadrilF
		textFieldquadrilF.setMaxSize(50, 50);
		// Posicionamento Nó TextField- quadrilF
		textFieldquadrilF.setLayoutX(600);
		textFieldquadrilF.setLayoutY(230);
		// Criação de variável- cm10
		Label cm10 = new Label("cm");
		// Posicionamento Nó Label- 10
		cm10.setLayoutX(660);
		cm10.setLayoutY(230);
		//Criação de variável Label- coxaDir
		Label coxaDir = new Label("Coxa dir.=");
		// Tamanho de fonte Label- coxaDir
		coxaDir.setFont(new Font(15));
		// Posicionamento Nó Label- coxaDir
		coxaDir.setLayoutX(500);
		coxaDir.setLayoutY(280);
		// Declaração de variável TextField- coxaDirF
		textFiledcoxaDirF = new TextField();
		// Tamanho de TextField- coxaDirF
		textFiledcoxaDirF.setMaxSize(50, 50);
		// Posicionamento Nï¿½ TextField- coxaDirF
		textFiledcoxaDirF.setLayoutX(600);
		textFiledcoxaDirF.setLayoutY(280);
		// Criação de variável  Label- cm11
		Label cm11 = new Label("cm");
		// Posicionamento nó variável  Label- cm11
		cm11.setLayoutX(660);
		cm11.setLayoutY(280);

		// Criação de variável Label- coxaEsq
		Label coxaEsq = new Label("Coxa  esq.=");
		// Tamanho de fonte Label- coxaEsq
		coxaEsq.setFont(new Font(15));
		// Posicionamento Nó Label- coxaEsq
		coxaEsq.setLayoutX(500);
		coxaEsq.setLayoutY(330);
		// Declaração de variável TextField- coxaEsqF
		textFieldcoxaEsqF = new TextField();
		// Tamanho de TextField- coxaEsqF
		textFieldcoxaEsqF.setMaxSize(50, 50);
		// Posicionamento de TextField- coxaEsqF
		textFieldcoxaEsqF.setLayoutX(600);
		textFieldcoxaEsqF.setLayoutY(330);
		// Criação de variável Label- cm12
		Label cm12 = new Label("cm");
		// Posicionamento Nó Label- cm12
		cm12.setLayoutX(660);
		cm12.setLayoutY(330);
		// Criação de variável Label- pernaEsq
		Label pernaEsq = new Label("Perna esq.=");
		// Tamanho de fonte Label- pernaEsq
		pernaEsq.setFont(new Font(15));
		// Posicionamento Nï¿½ Label- pernaEsq
		pernaEsq.setLayoutX(500);
		pernaEsq.setLayoutY(380);
		// Declaração de variável TextField- pernaEsqF
		textFieldpernaEsqF = new TextField();
		// Tamanho de TextField- pernaEsqF
		textFieldpernaEsqF.setMaxSize(50, 50);
		// Posicionamento de TextField- pernaEsqF
		textFieldpernaEsqF.setLayoutX(600);
		textFieldpernaEsqF.setLayoutY(380);
		// Criação de variável Label- c13
		Label cm13 = new Label("cm");
		// Posicionamento Nï¿½ Label- cm13
		cm13.setLayoutX(660);
		cm13.setLayoutY(380);

		// Criação de variável Label- pernaDir
		Label pernaDir = new Label("Perna dir.=");
		// Tamanho de fonte Label- pernaDir
		pernaDir.setFont(new Font(15));
		// Posicionamento Nó Label- pernaDir
		pernaDir.setLayoutX(500);
		pernaDir.setLayoutY(430);
		// Declaração de variável TextField- pernaDirF
		textFieldpernaDirF = new TextField();
		// Tamanho de TextField- pernaDirF
		textFieldpernaDirF.setMaxSize(50, 50);
		// Tamanho de TextField- pernaDirF
		textFieldpernaDirF.setLayoutX(600);
		textFieldpernaDirF.setLayoutY(430);
		// Criação de variável Label- c14
		Label cm14 = new Label("cm");
		// Posicionamento Nó  Label- cm14
		cm14.setLayoutX(660);
		cm14.setLayoutY(430);

		layoutCircun.getChildren().addAll(circun, ombro, textFieldombroF, cm1, torax, textFieldtoraxF, cm2, busto, textFieldbustoF, cm3, bracoDir,
				cm4, textFieldbracoDirF, antBracDir, textFieldantBracDirF, cm5, bracoEsq, textFieldbracoEsqF, cm6, antBracEsq, textFieldantBracEsqF, cm7,
				cintura, textFieldcinturaF, cm8, abdomen, textFieldabdomenF, cm9, quadril, textFieldquadrilF, cm10, coxaDir, textFiledcoxaDirF, cm11,
				coxaEsq, textFieldcoxaEsqF, cm12, pernaEsq, textFieldpernaEsqF, cm13, pernaDir, textFieldpernaDirF, cm14);
		layoutCircun.setPadding(new Insets(5));
		Circun_tab.setContent(layoutCircun);

		///////////////////////////////////////////// Tab Dobras
		///////////////////////////////////////////// Cutâneas//////////////////////////////////////////////

		// Declaração  Tap dob_tab
		dob_tab = new Tab("Dobras Cutâneas");

		// Criação de variável Label- dobLabel
		Label dobLabel = new Label("Dobras Cutâneas");
		// Tamanho de fonte Label- dobLabel
		dobLabel.setFont(new Font(30));
		// Posicionamento Nó Label- dobLabel
		dobLabel.setLayoutX(350);
		dobLabel.setLayoutY(20);

		//Criação de variável Label- subCap
		Label subCap = new Label("Subescapular:");
		// Tamanho de fonte Label- subCap
		subCap.setFont(new Font(15));
		// Posicionamento Nó Label-subCap
		subCap.setLayoutX(100);
		subCap.setLayoutY(130);

		textFildsubCapF = new TextField();

		textFildsubCapF.setMaxSize(50, 50);
		textFildsubCapF.setLayoutX(210);
		textFildsubCapF.setLayoutY(130);

		Label mm1 = new Label("mm");
		mm1.setLayoutX(270);
		mm1.setLayoutY(130);

		// Criação de variável Label- tric
		Label tric = new Label("Tricipital:");
		// Tamanho de fonte Label- tric
		tric.setFont(new Font(15));
		// Posicionamento Nó Label-tric
		tric.setLayoutX(100);
		tric.setLayoutY(180);
		// Declaraçao de variável TextField-tricF
		textFildtricF = new TextField();
		// Tamanho de TextField- tricF
		textFildtricF.setMaxSize(50, 50);
		// Posicionamento de TextField-tricF
		textFildtricF.setLayoutX(210);
		textFildtricF.setLayoutY(180);
		// Criaï¿½ï¿½o de variï¿½vel Label- mm2
		Label mm2 = new Label("mm");
		// Posicionamento Nó Label- mm2
		mm2.setLayoutX(270);
		mm2.setLayoutY(180);

		Label bicipital = new Label("Bicipital:");
		bicipital.setFont(new Font(15));
		bicipital.setLayoutX(100);
		bicipital.setLayoutY(230);

		textFildbicipitalF = new TextField();
		textFildbicipitalF.setMaxSize(50, 50);
		textFildbicipitalF.setLayoutX(210);
		textFildbicipitalF.setLayoutY(230);

		Label mm3 = new Label("mm");
		mm3.setLayoutX(270);
		mm3.setLayoutY(230);

		Label peitoral = new Label("Peitoral:");
		peitoral.setFont(new Font(15));
		peitoral.setLayoutX(100);
		peitoral.setLayoutY(280);

		textFildpeitoralF = new TextField();
		textFildpeitoralF.setMaxSize(50, 50);
		textFildpeitoralF.setLayoutX(210);
		textFildpeitoralF.setLayoutY(280);

		Label mm4 = new Label("mm");
		mm4.setLayoutX(270);
		mm4.setLayoutY(280);

		Label axilarMedia = new Label("Axilar Média:");
		axilarMedia.setFont(new Font(15));
		axilarMedia.setLayoutX(100);
		axilarMedia.setLayoutY(330);

		textFildaxilarMediaF = new TextField();
		textFildaxilarMediaF.setMaxSize(50, 50);
		textFildaxilarMediaF.setLayoutX(210);
		textFildaxilarMediaF.setLayoutY(330);

		Label mm5 = new Label("mm");
		mm5.setLayoutX(270);
		mm5.setLayoutY(330);

		Label suprailiaca = new Label("Suprailiaca:");
		suprailiaca.setFont(new Font(15));
		suprailiaca.setLayoutX(500);
		suprailiaca.setLayoutY(130);

		textFildsuprailiacaF = new TextField();
		textFildsuprailiacaF.setMaxSize(50, 50);
		textFildsuprailiacaF.setLayoutX(600);
		textFildsuprailiacaF.setLayoutY(130);

		Label mm6 = new Label("mm");
		mm6.setLayoutX(660);
		mm6.setLayoutY(130);

		Label abdominal = new Label("Abdominal:");
		abdominal.setFont(new Font(15));
		abdominal.setLayoutX(500);
		abdominal.setLayoutY(180);

		textFildabdominalF = new TextField();
		textFildabdominalF.setMaxSize(50, 50);
		textFildabdominalF.setLayoutX(600);
		textFildabdominalF.setLayoutY(180);

		Label mm7 = new Label("mm");
		mm7.setLayoutX(660);
		mm7.setLayoutY(180);

		Label coxaAnterior = new Label("Coxa anterior:");
		coxaAnterior.setFont(new Font(15));
		coxaAnterior.setLayoutX(500);
		coxaAnterior.setLayoutY(230);

		textFildcoxaAnteriorF = new TextField();
		textFildcoxaAnteriorF.setMaxSize(50, 50);
		textFildcoxaAnteriorF.setLayoutX(600);
		textFildcoxaAnteriorF.setLayoutY(230);

		Label mm8 = new Label("mm");
		mm8.setLayoutX(660);
		mm8.setLayoutY(230);

		Label perna = new Label("Perna:");
		perna.setFont(new Font(15));
		perna.setLayoutX(500);
		perna.setLayoutY(280);

		textFildpernaF = new TextField();
		textFildpernaF.setMaxSize(50, 50);
		textFildpernaF.setLayoutX(600);
		textFildpernaF.setLayoutY(280);

		Label mm9 = new Label("mm");
		mm9.setLayoutX(660);
		mm9.setLayoutY(280);

		layoutDobcut.getChildren().addAll(dobLabel, subCap, textFildsubCapF, mm1, tric, textFildtricF, mm2, bicipital, textFildbicipitalF, mm3,
				peitoral, textFildpeitoralF, mm4, axilarMedia, textFildaxilarMediaF, mm5, suprailiaca, textFildsuprailiacaF, mm6, abdominal,
				textFildabdominalF, mm7, coxaAnterior, textFildcoxaAnteriorF, mm8, perna, textFildpernaF, mm9);
		layoutDobcut.setPadding(new Insets(5));
		dob_tab.setContent(layoutDobcut);

		comp_tab = new Tab("Composição  Corporal");

		Label CompCorp = new Label("Composição  Corporal");
		CompCorp.setFont(new Font(30));
		CompCorp.setLayoutX(350);
		CompCorp.setLayoutY(20);

		Label massCorpTotal2 = new Label("Massa corporal total:");
		massCorpTotal2.setFont(new Font(15));
		massCorpTotal2.setLayoutX(100);
		massCorpTotal2.setLayoutY(130);

		textFildmassCorpTotal2F = new TextField();
		textFildmassCorpTotal2F.setMaxSize(50, 50);
		textFildmassCorpTotal2F.setLayoutX(300);
		textFildmassCorpTotal2F.setLayoutY(130);

		Label kg1 = new Label("kg");
		kg1.setLayoutX(360);
		kg1.setLayoutY(130);

		Label percentGordura = new Label("Percentual de gordura:");
		percentGordura.setFont(new Font(15));
		percentGordura.setLayoutX(100);
		percentGordura.setLayoutY(180);

		textFildpercentGorduraF = new TextField();
		textFildpercentGorduraF.setMaxSize(50, 50);
		textFildpercentGorduraF.setLayoutX(300);
		textFildpercentGorduraF.setLayoutY(180);

		Label porcent = new Label("%");
		porcent.setLayoutX(360);
		porcent.setLayoutY(180);

		Label masCopId = new Label("Massa coporal ideal:");
		masCopId.setFont(new Font(15));
		masCopId.setLayoutX(100);
		masCopId.setLayoutY(230);

		textFildmasCopIdF = new TextField();
		textFildmasCopIdF.setMaxSize(50, 50);
		textFildmasCopIdF.setLayoutX(300);
		textFildmasCopIdF.setLayoutY(230);

		Label kg2 = new Label("kg");
		kg2.setLayoutX(360);
		kg2.setLayoutY(230);

		Label masCorpGorda = new Label("Massa corporal gorda:");
		masCorpGorda.setFont(new Font(15));
		masCorpGorda.setLayoutX(100);
		masCorpGorda.setLayoutY(280);

		textFildmasCorpGordaF = new TextField();
		textFildmasCorpGordaF.setMaxSize(50, 50);
		textFildmasCorpGordaF.setLayoutX(300);
		textFildmasCorpGordaF.setLayoutY(280);

		Label kg3 = new Label("kg");
		kg3.setLayoutX(360);
		kg3.setLayoutY(280);

		Label masCopMagra = new Label("Massa corporal magra:");
		masCopMagra.setFont(new Font(15));
		masCopMagra.setLayoutX(100);
		masCopMagra.setLayoutY(330);

		textFildmasCopMagraF = new TextField();
		textFildmasCopMagraF.setMaxSize(50, 50);
		textFildmasCopMagraF.setLayoutX(300);
		textFildmasCopMagraF.setLayoutY(325);

		Label kg4 = new Label("kg");
		kg4.setLayoutX(360);
		kg4.setLayoutY(325);

		Label exGordCorp = new Label("Excesso de gordura corporal:");
		exGordCorp.setFont(new Font(15));
		exGordCorp.setLayoutX(100);
		exGordCorp.setLayoutY(370);

		textFildexGordCorpF = new TextField();
		textFildexGordCorpF.setMaxSize(50, 50);
		textFildexGordCorpF.setLayoutX(300);
		textFildexGordCorpF.setLayoutY(370);

		kg6 = new Label("cm");
		kg6.setLayoutX(360);
		kg6.setLayoutY(370);

		layoutCompCorp.getChildren().addAll(CompCorp, massCorpTotal2, textFildmassCorpTotal2F, kg1, percentGordura,
				textFildpercentGorduraF, porcent, kg2, masCorpGorda, textFildmasCorpGordaF, kg3, masCopMagra, textFildmasCopMagraF, masCopId,
				textFildmasCopIdF, kg4, exGordCorp, textFildexGordCorpF, kg6);
		layoutCompCorp.setPadding(new Insets(5));
		comp_tab.setContent(layoutCompCorp);

		post_tab = new Tab("Avaliação Postural");

		avaliacaoPost = new Label("Avaliação Postural");
		avaliacaoPost.setFont(new Font(30));
		avaliacaoPost.setLayoutX(350);
		avaliacaoPost.setLayoutY(20);

		ToggleGroup group = new ToggleGroup();

		radioAnt = new RadioButton("Visão Anterior");
		radioAnt.setToggleGroup(group);
		radioAnt.setSelected(true);
		radioAnt.setFont(new Font(15));
		radioAnt.setLayoutX(175);
		radioAnt.setLayoutY(90);

		radioLat = new RadioButton("Visisão Lateral");
		radioLat.setToggleGroup(group);
		radioLat.setFont(new Font(15));
		radioLat.setLayoutX(350);
		radioLat.setLayoutY(90);

		radioPost = new RadioButton("Visião  Posterior");
		radioPost.setToggleGroup(group);
		radioPost.setFont(new Font(15));
		radioPost.setLayoutX(500);
		radioPost.setLayoutY(90);

		//======Visao Anterior======//

		posicaoPes = new Label("Posição dos pés:");
		posicaoPes.setFont(new Font(15));
		posicaoPes.setLayoutX(100);
		posicaoPes.setLayoutY(30);

		esqPronado = new CheckBox("Esq. Pronado");
		esqPronado.setLayoutX(100);
		esqPronado.setLayoutY(55);

		dirSupinado = new CheckBox("Dir. Pronado");
		dirSupinado.setLayoutX(390);
		dirSupinado.setLayoutY(55);

		alinhado = new CheckBox("Alinhado");
		alinhado.setLayoutX(245);
		alinhado.setLayoutY(55);

		esqSupinado = new CheckBox("Esq. Supinado");
		esqSupinado.setLayoutX(535);
		esqSupinado.setLayoutY(55);

		dirPronado = new CheckBox("Dir.Supinado");
		dirPronado.setLayoutX(680);
		dirPronado.setLayoutY(55);

		tibia = new Label("Tíbia:");
		tibia.setFont(new Font(15));
		tibia.setLayoutX(100);
		tibia.setLayoutY(90);

		alinhada = new CheckBox("Alinhada");
		alinhada.setLayoutX(100);
		alinhada.setLayoutY(115);

		esqVara = new CheckBox("Esq. Vara");
		esqVara.setLayoutX(245);
		esqVara.setLayoutY(115);

		dirVara = new CheckBox("Dir. Vara");
		dirVara.setLayoutX(390);
		dirVara.setLayoutY(115);

		esqValgo = new CheckBox("Esq. Valgo");
		esqValgo.setLayoutX(535);
		esqValgo.setLayoutY(115);

		dirValgo = new CheckBox("Dir. Valgo");
		dirValgo.setLayoutX(680);
		dirValgo.setLayoutY(115);

		joelhos = new Label("Joelhos:");
		joelhos.setFont(new Font(15));
		joelhos.setLayoutX(100);
		joelhos.setLayoutY(150);

		alinhados = new CheckBox("Alinhados");
		alinhados.setLayoutX(100);
		alinhados.setLayoutY(175);

		esqVaraJ = new CheckBox("Esq. Vara");
		esqVaraJ.setLayoutX(245);
		esqVaraJ.setLayoutY(175);

		dirVaraJ = new CheckBox("Dir. Vara");
		dirVaraJ.setLayoutX(390);
		dirVaraJ.setLayoutY(175);

		esqValgoJ = new CheckBox(" Esq. Valgo");
		esqValgoJ.setLayoutX(535);
		esqValgoJ.setLayoutY(175);

		dirValgoJ = new CheckBox("Dir. Valgo");
		dirValgoJ.setLayoutX(680);
		dirValgoJ.setLayoutY(175);

		femur = new Label("Fêmur:");
		femur.setFont(new Font(15));
		femur.setLayoutX(100);
		femur.setLayoutY(210);

		torcaoInterna = new CheckBox("Torção interna");
		torcaoInterna.setLayoutX(100);
		torcaoInterna.setLayoutY(235);

		torcaoExterna = new CheckBox("Torção Externa");
		torcaoExterna.setLayoutX(245);
		torcaoExterna.setLayoutY(235);

		espIlicaAntPost = new Label("Esp. Iliaca  Ant. Post:");
		espIlicaAntPost.setFont(new Font(15));
		espIlicaAntPost.setLayoutX(100);
		espIlicaAntPost.setLayoutY(270);

		alinhadoEs = new CheckBox("Alinhado");
		alinhadoEs.setLayoutX(100);
		alinhadoEs.setLayoutY(295);

		esqDeprimido = new CheckBox("Esq. Deprimido");
		esqDeprimido.setLayoutX(245);
		esqDeprimido.setLayoutY(295);

		dirDeprimido = new CheckBox("Dir. Deprimido");
		dirDeprimido.setLayoutX(390);
		dirDeprimido.setLayoutY(295);

		ombro2 = new Label("Ombro:");
		ombro2.setFont(new Font(15));
		ombro2.setLayoutX(100);
		ombro2.setLayoutY(330);

		alinhadoOm = new CheckBox("Alinhado");
		alinhadoOm.setLayoutX(100);
		alinhadoOm.setLayoutY(355);

		esqDeprimidoOm = new CheckBox("Esq. Deprimido");
		esqDeprimidoOm.setLayoutX(245);
		esqDeprimidoOm.setLayoutY(355);

		dirDeprimidoOm = new CheckBox("Dir. Deprimido");
		dirDeprimidoOm.setLayoutX(390);
		dirDeprimidoOm.setLayoutY(355);

		pescoco = new Label("Pescoção:");
		pescoco.setFont(new Font(15));
		pescoco.setLayoutX(100);
		pescoco.setLayoutY(385);

		alinhadoPe = new CheckBox("Alinhado");
		alinhadoPe.setLayoutX(100);
		alinhadoPe.setLayoutY(410);

		esqInclinLateral = new CheckBox("Esq. Inclin. Lateral");
		esqInclinLateral.setLayoutX(245);
		esqInclinLateral.setLayoutY(410);

		dirInclinLateral = new CheckBox("Dir. Inclin. Lateral");
		dirInclinLateral.setLayoutX(390);
		dirInclinLateral.setLayoutY(410);

		triangDTal = new Label("Triangulo de Tales:");
		triangDTal.setFont(new Font(15));
		triangDTal.setLayoutX(100);
		triangDTal.setLayoutY(445);

		simetricos = new CheckBox("Simétricos");
		simetricos.setLayoutX(100);
		simetricos.setLayoutY(470);

		agudosADir = new CheckBox("Agudos à Dir.");
		agudosADir.setLayoutX(245);
		agudosADir.setLayoutY(470);

		agudosAEsq = new CheckBox("Agudos à Esq.");
		agudosAEsq.setLayoutX(390);
		agudosAEsq.setLayoutY(470);

		layoutVisaoAnt.getChildren().addAll(posicaoPes, esqPronado, dirSupinado, alinhado, esqSupinado, dirPronado,
				tibia, alinhada, esqVara, dirVara, esqValgo, dirValgo, joelhos, alinhados, esqVaraJ, dirVaraJ,
				esqValgoJ, dirValgoJ, femur, torcaoInterna, torcaoExterna, espIlicaAntPost, alinhadoEs, esqDeprimido,
				dirDeprimido, ombro2, alinhadoOm, esqDeprimidoOm, dirDeprimidoOm, pescoco, alinhadoPe, esqInclinLateral,
				dirInclinLateral, triangDTal, simetricos, agudosADir, agudosAEsq);

		//========== Visao Lateral ==========//

		joelhos2 = new Label("Joelhos:");
		joelhos2.setFont(new Font(15));
		joelhos2.setLayoutX(100);
		joelhos2.setLayoutY(30);

		alinhadosVL = new CheckBox("Alinhados");
		alinhadosVL.setLayoutX(100);
		alinhadosVL.setLayoutY(55);

		recurvatum = new CheckBox("Recurvatum");
		recurvatum.setLayoutX(245);
		recurvatum.setLayoutY(55);

		semifletido = new CheckBox("Semifletido");
		semifletido.setLayoutX(390);
		semifletido.setLayoutY(55);

		espIlicAntPost = new Label("Esp. Iliaca  Ant. Post:");
		espIlicAntPost.setFont(new Font(15));
		espIlicAntPost.setLayoutX(100);
		espIlicAntPost.setLayoutY(90);

		alinhadovl = new CheckBox("Alinhado");
		alinhadovl.setLayoutX(100);
		alinhadovl.setLayoutY(115);

		av = new CheckBox("AV");
		av.setLayoutX(245);
		av.setLayoutY(115);

		rv = new CheckBox("RV");
		rv.setLayoutX(390);
		rv.setLayoutY(115);

		ombrovl = new Label("Ombro:");
		ombrovl.setFont(new Font(15));
		ombrovl.setLayoutX(100);
		ombrovl.setLayoutY(150);

		alinhadoOmvl = new CheckBox("Alinhado");
		alinhadoOmvl.setLayoutX(100);
		alinhadoOmvl.setLayoutY(175);

		protusos = new CheckBox("Protusos");
		protusos.setLayoutX(245);
		protusos.setLayoutY(175);

		retraidos = new CheckBox("Retraídos");
		retraidos.setLayoutX(390);
		retraidos.setLayoutY(175);

		lordCervical = new Label("Lordose cervical:");
		lordCervical.setFont(new Font(15));
		lordCervical.setLayoutX(100);
		lordCervical.setLayoutY(210);

		fisiologica = new CheckBox("Fisiológica");
		fisiologica.setLayoutX(100);
		fisiologica.setLayoutY(235);

		aumentada = new CheckBox("Aumentada");
		aumentada.setLayoutX(245);
		aumentada.setLayoutY(235);

		retificada = new CheckBox("Retificada");
		retificada.setLayoutX(390);
		retificada.setLayoutY(235);

		cifoseTorac = new Label("Cifose Torácica:");
		cifoseTorac.setFont(new Font(15));
		cifoseTorac.setLayoutX(100);
		cifoseTorac.setLayoutY(270);

		fisiologicaCT = new CheckBox("Fisioliológica");
		fisiologicaCT.setLayoutX(100);
		fisiologicaCT.setLayoutY(295);

		aumentadaCT = new CheckBox("Aumentada");
		aumentadaCT.setLayoutX(245);
		aumentadaCT.setLayoutY(295);

		retificadaCT = new CheckBox("Retificada");
		retificadaCT.setLayoutX(390);
		retificadaCT.setLayoutY(295);

		lordLob = new Label("Lordose lombar: ");
		lordLob.setFont(new Font(15));
		lordLob.setLayoutX(100);
		lordLob.setLayoutY(330);

		fisiologicaLL = new CheckBox("Fisiológica");
		fisiologicaLL.setLayoutX(100);
		fisiologicaLL.setLayoutY(355);

		aumentadaLL = new CheckBox("Aumentada");
		aumentadaLL.setLayoutX(245);
		aumentadaLL.setLayoutY(355);

		retificadall = new CheckBox("Retificada");
		retificadall.setLayoutX(390);
		retificadall.setLayoutY(355);

		abdomen2 = new Label("Abdômen:");
		abdomen2.setFont(new Font(15));
		abdomen2.setLayoutX(100);
		abdomen2.setLayoutY(390);

		normotrofico = new CheckBox("Normotrófico");
		normotrofico.setLayoutX(100);
		normotrofico.setLayoutY(410);

		protuso = new CheckBox("Protuso");
		protuso.setLayoutX(245);
		protuso.setLayoutY(410);

		layoutVisaoLat.getChildren().addAll(joelhos2, alinhadosVL, recurvatum, semifletido, espIlicAntPost, alinhadovl,
				av, rv, ombrovl, alinhadoOmvl, protusos, retraidos, lordCervical, fisiologica, aumentada, retificada,
				cifoseTorac, fisiologicaCT, aumentadaCT, retificadaCT, lordLob, fisiologicaLL, aumentadaLL,
				retificadall, abdomen2, normotrofico, protuso);

		//============= Visão Posterior============//
		
		coluna = new Label("Coluna:");
		coluna.setFont(new Font(15));
		coluna.setLayoutX(100);
		coluna.setLayoutY(30);

		alinhadaCO = new CheckBox("Alinhada");
		alinhadaCO.setLayoutX(100);
		alinhadaCO.setLayoutY(55);

		escolioseLombarDir = new CheckBox("Escoliose Lombar Dir");
		escolioseLombarDir.setLayoutX(300);
		escolioseLombarDir.setLayoutY(55);

		escolioseLombarEsq = new CheckBox("Escoliose Lombar Esq");
		escolioseLombarEsq.setLayoutX(500);
		escolioseLombarEsq.setLayoutY(55);

		escolioseToracicaDir = new CheckBox("Escoliose torácica Dir");
		escolioseToracicaDir.setLayoutX(700);
		escolioseToracicaDir.setLayoutY(55);

		escolioseToracicaEsq = new CheckBox("Escoliose Torácica Esq");
		escolioseToracicaEsq.setLayoutX(100);
		escolioseToracicaEsq.setLayoutY(90);

		escolioseDorsoLombarDir = new CheckBox("Escoliose Dorso  Lombar Dir");
		escolioseDorsoLombarDir.setLayoutX(300);
		escolioseDorsoLombarDir.setLayoutY(90);

		escolioseDorsoLombarEsq = new CheckBox("Escoliose Dorso Lombar Esq");
		escolioseDorsoLombarEsq.setLayoutX(500);
		escolioseDorsoLombarEsq.setLayoutY(90);

		escolioseEmS = new CheckBox("Escoliose em S");
		escolioseEmS.setLayoutX(700);
		escolioseEmS.setLayoutY(90);

		escapula = new Label("Escápula:");
		escapula.setFont(new Font(15));
		escapula.setLayoutX(100);
		escapula.setLayoutY(150);

		alinhadaEs = new CheckBox("Alinhada");
		alinhadaEs.setLayoutX(100);
		alinhadaEs.setLayoutY(175);

		esqAbduzida = new CheckBox("Esq. Abduzida");
		esqAbduzida.setLayoutX(300);
		esqAbduzida.setLayoutY(175);

		dirAbduzida = new CheckBox("Dir. Abduzida");
		dirAbduzida.setLayoutX(500);
		dirAbduzida.setLayoutY(175);

		esqAduzida = new CheckBox("Esq. Aduzida");
		esqAduzida.setLayoutX(700);
		esqAduzida.setLayoutY(175);

		dirAduzida = new CheckBox("Dir. Aduzida");
		dirAduzida.setLayoutX(100);
		dirAduzida.setLayoutY(210);

		rodadaAImEsq = new CheckBox("Rodada A. Im. Esq");
		rodadaAImEsq.setLayoutX(300);
		rodadaAImEsq.setLayoutY(210);

		rodadaAInfDir = new CheckBox("Rodada A. Inf. Dir");
		rodadaAInfDir.setLayoutX(500);
		rodadaAInfDir.setLayoutY(210);

		rodadaASupEsq = new CheckBox("Rodada A. Sup. Esq");
		rodadaASupEsq.setLayoutX(700);
		rodadaASupEsq.setLayoutY(210);

		rodadaSupDir = new CheckBox("Rodada  Sup. Dir");
		rodadaSupDir.setLayoutX(100);
		rodadaSupDir.setLayoutY(245);

		esqAlada = new CheckBox("Esq. Alada");
		esqAlada.setLayoutX(300);
		esqAlada.setLayoutY(245);

		dirAlada = new CheckBox("Dir. Alada");
		dirAlada.setLayoutX(500);
		dirAlada.setLayoutY(245);

		layoutVisaoPost.getChildren().addAll(coluna, alinhadaCO, escolioseLombarDir, escolioseLombarEsq,
				escolioseToracicaDir, escolioseToracicaEsq, escolioseDorsoLombarDir, escolioseDorsoLombarEsq,
				escolioseEmS, escapula, alinhadaEs, esqAbduzida, dirAbduzida, esqAduzida, dirAduzida, rodadaAImEsq,
				rodadaAInfDir, rodadaASupEsq, rodadaSupDir, esqAlada, dirAlada);

		AnchorPane layoutAvaliacTopo = new AnchorPane();
		layoutAvaliacTopo.getChildren().addAll(avaliacaoPost, radioAnt, radioLat, radioPost);

		BorderPane layoutAvaliacPostural = new BorderPane();
		layoutAvaliacPostural.setTop(layoutAvaliacTopo);
		layoutAvaliacPostural.setCenter(layoutVisaoAnt);

		post_tab.setContent(layoutAvaliacPostural);

		radioAnt.setOnAction(e -> layoutAvaliacPostural.setCenter(layoutVisaoAnt));
		radioPost.setOnAction(e -> layoutAvaliacPostural.setCenter(layoutVisaoPost));
		radioLat.setOnAction(e -> layoutAvaliacPostural.setCenter(layoutVisaoLat));

		iCQ_tab = new Tab("ICQ");

		// Criação de variável Label - icq
		icq = new Label("Indice  Cintura/Quadril ");
		// Tamanho de fonte Label- cintura
		icq.setFont(new Font(30));
		// Posicionamento Nï¿½ Label-icq
		icq.setLayoutX(350);
		icq.setLayoutY(30);

		// Criação de variável Label - cirCintAvaTest
		cirCintAvaTest = new Label("Circunferência da cintura avaliada no teste (dados atuais)=");
		// Tamanho de fonte Label- cirCintAvaTest
		cirCintAvaTest.setFont(new Font(15));
		// Posicionamento Nó Label- cirCintAvaTest
		cirCintAvaTest.setLayoutX(100);
		cirCintAvaTest.setLayoutY(130);
		// Declaração de variável TextField- cirCintAvaTestFi
		textFildcirCintAvaTestFi = new TextField();
		// Tamanho de TextField-cirCintAvaTestFi
		textFildcirCintAvaTestFi.setMaxSize(60, 60);
		// Posicionamento de TextField- cirCintAvaTestFi
		textFildcirCintAvaTestFi.setLayoutX(500);
		textFildcirCintAvaTestFi.setLayoutY(130);
		//Criação de variável  Label - cm15
		Label cm15 = new Label("cm");
		// Posicionamento de TextField- cm15
		cm15.setLayoutX(570);
		cm15.setLayoutY(130);

		circQuadAvalTest = new Label("Circunferência  do quadril avaliada no teste (dados atuais)=");
		circQuadAvalTest.setFont(new Font(15));
		circQuadAvalTest.setLayoutX(100);
		circQuadAvalTest.setLayoutY(180);

		textFildcircQuadAvalTestF = new TextField();
		textFildcircQuadAvalTestF.setMaxSize(60, 60);
		textFildcircQuadAvalTestF.setLayoutX(500);
		textFildcircQuadAvalTestF.setLayoutY(180);

		cm17 = new Label("cm");
		cm17.setLayoutX(570);
		cm17.setLayoutY(180);

		relaCintQuad = new Label("Relação cintura-quadril (dados atuais)=");
		relaCintQuad.setFont(new Font(15));
		relaCintQuad.setLayoutX(100);
		relaCintQuad.setLayoutY(230);

		textFildrelaCintQuadF = new TextField();
		textFildrelaCintQuadF.setMaxSize(60, 60);
		textFildrelaCintQuadF.setLayoutX(370);
		textFildrelaCintQuadF.setLayoutY(230);
		
		cm18 = new Label("cm");
		cm18.setLayoutX(440);
		cm18.setLayoutY(230);

		risco = new Label("Risco:");
		risco.setFont(new Font(15));
		risco.setMaxSize(60, 60);
		risco.setLayoutX(100);
		risco.setLayoutY(280);

		textFieldriscoF = new TextField();
		textFieldriscoF.setMaxSize(200, 200);
		textFieldriscoF.setLayoutX(150);
		textFieldriscoF.setLayoutY(280);

		// Criação de variável Label - coment
		coment = new Label("Comentário Final ");
		// Tamanho de fonte Label- coment
		coment.setFont(new Font(25));
		// Posicionamento Nó Label-icq
		coment.setLayoutX(350);
		coment.setLayoutY(340);

		observacao = new Label("Observações:");
		observacao.setFont(new Font(15));
		observacao.setLayoutX(100);
		observacao.setLayoutY(400);

		observacaoA = new TextArea();
		observacaoA.setMaxSize(1000, 80);
		observacaoA.setLayoutX(100);
		observacaoA.setLayoutY(430);

		objetivo = new Label("Objetivo:");
		objetivo.setFont(new Font(15));
		objetivo.setLayoutX(100);
		objetivo.setLayoutY(540);

		objetivoA = new TextArea();
		objetivoA.setMaxSize(1000, 80);
		objetivoA.setLayoutX(100);
		objetivoA.setLayoutY(570);
		
		atividPretAcad = new Label("Atividades Pretendidas na Academia:");
		atividPretAcad.setFont(new Font(15));
		atividPretAcad.setLayoutX(100);
		atividPretAcad.setLayoutY(660);

		atividPretAcadF = new TextArea();
		atividPretAcadF.setMaxSize(1000, 80);
		atividPretAcadF.setLayoutX(100);
		atividPretAcadF.setLayoutY(700);

		periodicidade = new Label("Periodicidade:");
		periodicidade.setFont(new Font(15));
		periodicidade.setLayoutX(100);
		periodicidade.setLayoutY(800);

		periodicidadeA = new TextArea();
		periodicidadeA.setMaxSize(1000, 80);
		periodicidadeA.setLayoutX(100);
		periodicidadeA.setLayoutY(830);

		buttonConfirmar = new Button("Confirmar");
		buttonConfirmar.setLayoutX(380);
		buttonConfirmar.setLayoutY(920);
		
		buttonConfirmar.setOnAction(Event -> {

			String dataAvaliacao = textFielddataAvaliacao.getText();
			String valiadAvaliacao = textFieldvaliadAvaliacF.getText();
			double massaCorpoTotal = Double.parseDouble(textFieldmassCorpTotalF.getText());
			double estatura = Double.parseDouble(textFieldestaturaF.getText());
			double freqCardRep = Double.parseDouble(textFieldfreqCardRepF.getText());
			double preArtSistRepo = Double.parseDouble(textFieldPreArtSistRepoF.getText());
			double presArtDiaRep = Double.parseDouble(textFieldPresArtDiaRepF.getText());

			antropometriaGeral = antropometriaGeralDAO.insertGeral(dataAvaliacao, valiadAvaliacao, massaCorpoTotal,
					freqCardRep, preArtSistRepo, presArtDiaRep, estatura);

			int idAntropometriaGeral = antropometriaGeral.getId();

			double ombrob = Double.parseDouble(textFieldombroF.getText());
			double toraxb = Double.parseDouble(textFieldtoraxF.getText());
			double bustob = Double.parseDouble(textFieldbustoF.getText());
			double bracoDirb = Double.parseDouble(textFieldbracoDirF.getText());
			double antBracDirb = Double.parseDouble(textFieldantBracDirF.getText());
			double bracoEsqb = Double.parseDouble(textFieldbracoEsqF.getText());
			double antBracEsqb = Double.parseDouble(textFieldantBracEsqF.getText());
			double cinturab = Double.parseDouble(textFieldcinturaF.getText());
			double abdomenb = Double.parseDouble(textFieldabdomenF.getText());
			double quadrilb = Double.parseDouble(textFieldquadrilF.getText());
			double coxaDirb = Double.parseDouble(textFiledcoxaDirF.getText());
			double coxaEsqb = Double.parseDouble(textFieldcoxaEsqF.getText());
			double pernaEsqb = Double.parseDouble(textFieldpernaEsqF.getText());
			double pernaDirb = Double.parseDouble(textFieldpernaDirF.getText());

			antropometriaCircunferenciasMuscularesDAO.insertCincun(idAntropometriaGeral, ombrob, toraxb, bustob,
					bracoDirb, antBracDirb, bracoEsqb, antBracEsqb, cinturab, abdomenb, quadrilb, coxaDirb, coxaEsqb,
					pernaEsqb, pernaDirb);

			
			double tricF1 = Double.parseDouble(textFildtricF.getText());
			double subCapF1 = Double.parseDouble(textFildsubCapF.getText());
			double bicipital1 = Double.parseDouble(textFildbicipitalF.getText());
			double peitoral1 = Double.parseDouble(textFildpeitoralF.getText());
			double axilarMedia1 = Double.parseDouble(textFildaxilarMediaF.getText());
			double suprailiaca1 = Double.parseDouble(textFildsuprailiacaF.getText());
			double abdominalF1 = Double.parseDouble(textFildabdominalF.getText());
			double coxaAnterior1 = Double.parseDouble(textFildcoxaAnteriorF.getText());
			double pernaF1 = Double.parseDouble(textFildpernaF.getText());

			antropometriaDobrasCutaneasDAO.insertDobrascir(idAntropometriaGeral,suprailiaca1, abdominalF1, coxaAnterior1, tricF1, subCapF1,
					bicipital1, axilarMedia1, pernaF1, peitoral1);
			
            	double massCorpTotal2F1 = Double.parseDouble(textFildmassCorpTotal2F.getText());
				double percentGorduraF1 = Double.parseDouble(textFildpercentGorduraF.getText());
				double masCopIdF1 = Double.parseDouble(textFildmasCopIdF.getText());
				double masCorpGordaF1 = Double.parseDouble(textFildmasCorpGordaF.getText());
				double masCopMagraF1 = Double.parseDouble(textFildmasCopMagraF.getText());
				double exGordCorpF1 = Double.parseDouble(textFildexGordCorpF.getText());

				composicaoCorporalDAO.insertCompCor(idAntropometriaGeral,massCorpTotal2F1, percentGorduraF1, masCopIdF1, masCorpGordaF1,masCopMagraF1, exGordCorpF1);
		        
				posicaoDosPesDAO.insertPosicaoPes(idAntropometriaGeral,esqPronado.isSelected(), dirSupinado.isSelected(), alinhado.isSelected(),esqSupinado.isSelected(), dirPronado.isSelected());
				tibiaDAO.insertTibia(idAntropometriaGeral,alinhada.isSelected(), esqVara.isSelected(), dirVara.isSelected(),esqValgo.isSelected(), dirValgo.isSelected());
				joelhosDAO.insertJoelhos(idAntropometriaGeral,alinhados.isSelected(), esqVaraJ.isSelected(), dirVaraJ.isSelected(),esqValgoJ.isSelected(), dirValgoJ.isSelected());
				femurDAO.insertFemur(idAntropometriaGeral,torcaoInterna.isSelected(), torcaoExterna.isSelected());
				espIlicaAntPostDAO.insertEspIlicaAntPost(idAntropometriaGeral,alinhadoEs.isSelected(), esqDeprimido.isSelected(),dirDeprimido.isSelected());
				ombro2dao.insertOmbroVA(idAntropometriaGeral,alinhadoOmvl.isSelected(), protusos.isSelected(), retraidos.isSelected());
				pescocoDAO.insertPescoco(idAntropometriaGeral,alinhadoPe.isSelected(), esqInclinLateral.isSelected(),dirInclinLateral.isSelected());
				triangDTalDAO.insertTriangDTal(idAntropometriaGeral,simetricos.isSelected(), agudosADir.isSelected(), agudosAEsq.isSelected());
				espIlicAntPostDAO.insertespIliacaAntPostVL(idAntropometriaGeral,alinhadovl.isSelected(), av.isSelected(), rv.isSelected());
				joelhos2dao.insertjoelhosVL(idAntropometriaGeral,alinhadosVL.isSelected(), recurvatum.isSelected(), semifletido.isSelected());
				ombrovlDAO.insertOmbrovl(idAntropometriaGeral,alinhadoOmvl.isSelected(), protusos.isSelected(), retraidos.isSelected());
				lordCervicalDAO.insertlordoseCervical(idAntropometriaGeral,fisiologica.isSelected(), aumentada.isSelected(),retificada.isSelected());
				cifoseToracDAO.insertCifoseToracica(idAntropometriaGeral,fisiologicaCT.isSelected(), aumentadaCT.isSelected(),retificadaCT.isSelected());
				lordLobDAO.insertLordoseLombar(idAntropometriaGeral,fisiologicaLL.isSelected(), aumentadaLL.isSelected(),retificadall.isSelected());
				abdomen2dao.insertAbdomen(idAntropometriaGeral,normotrofico.isSelected(), protuso.isSelected());
				colunaDAO.insertColuna(idAntropometriaGeral,alinhadaCO.isSelected(), escolioseLombarDir.isSelected(),escolioseLombarEsq.isSelected(), escolioseToracicaDir.isSelected(),escolioseToracicaEsq.isSelected(), escolioseDorsoLombarDir.isSelected(),escolioseDorsoLombarEsq.isSelected(), escolioseEmS.isSelected());
				escapulaDAO.insertEscapula(idAntropometriaGeral,alinhadaEs.isSelected(), esqAbduzida.isSelected(), dirAbduzida.isSelected(),esqAduzida.isSelected(), dirAduzida.isSelected(), rodadaAImEsq.isSelected(),rodadaAInfDir.isSelected(), rodadaASupEsq.isSelected(), rodadaSupDir.isSelected(),esqAlada.isSelected(), dirAlada.isSelected());
  
			double cirCintAvaTestFi1 = Double.parseDouble(textFildcirCintAvaTestFi.getText());
			double circQuadAvalTestF1 = Double.parseDouble(textFildcircQuadAvalTestF.getText());
			double relaCintQuadF1 = Double.parseDouble(textFildrelaCintQuadF.getText());
			String riscoF1 = textFieldriscoF.getText();

			indiceCinturaQuadrilDAO.insertIndeCin(idAntropometriaGeral,cirCintAvaTestFi1, circQuadAvalTestF1, relaCintQuadF1, riscoF1);

			String observacaoA1 = observacaoA.getText();
			String objetivoA1 = objetivoA.getText();
			String atividPretAcadF1 = atividPretAcadF.getText();
			String periodicidadeA1 = periodicidadeA.getText();

			comentarioFinalDAO.insertComentFi(idAntropometriaGeral,observacaoA1, objetivoA1, periodicidadeA1, atividPretAcadF1);

			JOptionPane.showMessageDialog(null, "Seu cadastro foi concluido com sucesso");
		});

		ScrollPane sp = new ScrollPane();
		layoutICQ.getChildren().addAll(icq, cirCintAvaTest, textFildcirCintAvaTestFi, cm15, circQuadAvalTest, coment,
				observacao, observacaoA, objetivo, objetivoA, textFildcircQuadAvalTestF, cm17, relaCintQuad, textFildrelaCintQuadF,
				cm18, risco, textFieldriscoF, atividPretAcad, atividPretAcadF, periodicidade, periodicidadeA, buttonConfirmar);

		layoutICQ.setPadding(new Insets(5));
		sp.setContent(layoutICQ);

		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		iCQ_tab.setContent(sp);

		Scene scene = new Scene(tp);

		tp.getTabs().addAll(geral_tab, Circun_tab, dob_tab, comp_tab, post_tab, iCQ_tab);
		
		//scene.getStylesheets().add("view/application.css");
		primaryStage.setTitle("Avaliacao Funcional");
		scene.getStylesheets().add("view/application.css");
		primaryStage.setX(100);
		primaryStage.setY(100);
		primaryStage.setHeight(700);
		primaryStage.setWidth(1000);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setResizable(false);
	}

}

