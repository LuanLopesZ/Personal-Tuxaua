package controller;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Agenda;
import model.Aluno;
import model.AntropometriaCircunferenciasMusculares;
import model.AntropometriaGeral;
import model.ComentarioFinal;
import model.ComposicaoCorporal;
import model.IndiceCinturaQuadril;
import model.Usuario;
import model.antropometriaDobrasCutaneas;
import model.DAO.AgendaDAO;
import model.DAO.AlunoDAO;
import model.DAO.AntropometriaCircunferenciasMuscularesDAO;
import model.DAO.AntropometriaDobrasCutaneasDAO;
import model.DAO.AntropometriaGeralDAO;
import model.DAO.AvaliacaoDAO;
import model.DAO.ComentarioFinalDAO;
import model.DAO.ComposicaoCorporalDAO;
import model.DAO.IndiceCinturaQuadrilDAO;
import model.DAO.UsuarioDAO;
import view.TelaAgenda;
import view.TelaAluno;
import view.TelaAvaliacao;
import view.TelaInicial;
import view.TelaLogin;

public class Main extends Application {

	private static AlunoDAO AlunoDAO;
	private static Usuario usuario;
	private static TelaLogin telalogin;
	private static TelaInicial telainicial = new TelaInicial();
	private static Main main = new Main();
	private static TelaAluno telaAluno;

	private static boolean logado = false;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			telainicial.start(primaryStage);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void avaliaçaogeral(AntropometriaGeral antropometriaGeral,
			AntropometriaCircunferenciasMusculares antropometriaCircunferenciasMusculares,
			antropometriaDobrasCutaneas antropometriaDobrasCutaneas, ComposicaoCorporal composicaoCorporal,
			IndiceCinturaQuadril indiceCinturaQuadril, ComentarioFinal comentarioFinal) {

		// Obtendo atributos da claase TelaAvaliacao
		int id = antropometriaGeral.getId();
		String dataAvaliacao = antropometriaGeral.getDataAvaliacao();
		String valiadAvaliacao = antropometriaGeral.getValiadAvaliacao();
		Double estatura = antropometriaGeral.getEstatura();
		Double freqCardRep = antropometriaGeral.getFreqCardRep();
		Double massaCorpoTotal = antropometriaGeral.getMassaCorpoTotal();
		Double preArtSistRepo = antropometriaGeral.getPreArtSistRepo();
		Double presArtDiaRep = antropometriaGeral.getPresArtDiaRep();

		// =======================================================//

		int idAntropometriaGeral = antropometriaCircunferenciasMusculares.getIdAntropometriaGeral();
		Double ombro = antropometriaCircunferenciasMusculares.getOmbro();
		Double abdomen = antropometriaCircunferenciasMusculares.getAbdomen();
		Double antBracDir = antropometriaCircunferenciasMusculares.getAntBracDir();
		Double antBracEsq = antropometriaCircunferenciasMusculares.getAntBracEsq();
		Double bracoDir = antropometriaCircunferenciasMusculares.getBracoDir();
		Double bracoEsq = antropometriaCircunferenciasMusculares.getBracoEsq();
		Double busto = antropometriaCircunferenciasMusculares.getBusto();
		Double cintura = antropometriaCircunferenciasMusculares.getCintura();
		Double coxaDir = antropometriaCircunferenciasMusculares.getCoxaDir();
		Double coxaEsq = antropometriaCircunferenciasMusculares.getCoxaEsq();
		Double pernaDir = antropometriaCircunferenciasMusculares.getPernaDir();
		Double pernaEsq = antropometriaCircunferenciasMusculares.getPernaEsq();
		Double quadril = antropometriaCircunferenciasMusculares.getQuadril();
		Double torax = antropometriaCircunferenciasMusculares.getTorax();

		// =======================================================//

		Double abdominalF = antropometriaDobrasCutaneas.getAbdominalF();
		Double axilarMediaF = antropometriaDobrasCutaneas.getAxilarMediaF();
		Double bicipitalF = antropometriaDobrasCutaneas.getBicipitalF();
		Double coxaAnteriorF = antropometriaDobrasCutaneas.getCoxaAnteriorF();
		Double peitoralF = antropometriaDobrasCutaneas.getPeitoralF();
		Double pernaF = antropometriaDobrasCutaneas.getPernaF();
		Double subCapF = antropometriaDobrasCutaneas.getSubCapF();
		Double suprailiacaF = antropometriaDobrasCutaneas.getSuprailiacaF();
		Double tricF = antropometriaDobrasCutaneas.getTricF();

		// =======================================================//

		Double exGordCorpF = composicaoCorporal.getExGordCorpF();
		Double masCopIdF = composicaoCorporal.getMasCopIdF();
		Double masCopMagraF = composicaoCorporal.getMasCopMagraF();
		Double masCorpGordaF = composicaoCorporal.getMasCorpGordaF();
		Double massCorpTotal2F = composicaoCorporal.getMassCorpTotal2F();
		Double percentGorduraF = composicaoCorporal.getPercentGorduraF();

		// =======================================================//
		
		Double cirCintAvaTestFi = indiceCinturaQuadril.getCirCintAvaTestFi();
		Double circQuadAvalTestF = indiceCinturaQuadril.getCircQuadAvalTestF();
		Double relaCintQuadF = indiceCinturaQuadril.getRelaCintQuadF();
		String riscoF = indiceCinturaQuadril.getRiscoF();
		
		// =======================================================//
		
		
		String atividPretAcadF = comentarioFinal.getAtividPretAcadF();
		String objetivoA = comentarioFinal.getObjetivoA();
		String observacaoA = comentarioFinal.getObservacaoA();
		String periodicidadeA = comentarioFinal.getPeriodicidadeA();
		
		
		// =======================================================//
		
		
		AntropometriaGeralDAO.insertGeral(dataAvaliacao, valiadAvaliacao, massaCorpoTotal, freqCardRep, preArtSistRepo,
				presArtDiaRep, estatura);
		AntropometriaCircunferenciasMuscularesDAO.insertCincun(idAntropometriaGeral, ombro, torax, busto, bracoDir,
				antBracDir, bracoEsq, antBracEsq, cintura, abdomen, quadril, coxaDir, coxaEsq, pernaEsq, pernaDir);
		AntropometriaDobrasCutaneasDAO.insertDobrascir(idAntropometriaGeral, suprailiacaF, abdominalF, coxaAnteriorF,
				tricF, subCapF, bicipitalF, axilarMediaF, pernaF, peitoralF);
		ComposicaoCorporalDAO.insertCompCor(idAntropometriaGeral, massCorpTotal2F, percentGorduraF, masCopIdF,
				masCorpGordaF, masCopMagraF, exGordCorpF);
		IndiceCinturaQuadrilDAO.insertIndeCin(idAntropometriaGeral, cirCintAvaTestFi, circQuadAvalTestF, relaCintQuadF, riscoF);
		ComentarioFinalDAO.insertComentFi(idAntropometriaGeral, observacaoA, objetivoA, periodicidadeA, atividPretAcadF);
	}

	public static void fazerAgendamento(Agenda agenda) {
		String descricao = agenda.getDescricao();
		String diasaulas = agenda.getDiasaulas();
		String nome = agenda.getNome();
		String tiposaulas = agenda.getTiposaulas();
		String valor1 = agenda.getValor1();

		AgendaDAO.insert(nome, descricao, valor1, diasaulas, tiposaulas);
	}

	public static void informacao(Aluno aluno) {

		String dataCadastro = aluno.getDataCadastro();
		String nome = aluno.getNome();
		String academia = aluno.getAcademia();
		String sexo = aluno.getSexo();
		String nascimento = aluno.getNascimento();
		String telefone = aluno.getTelefone();
		String celular = aluno.getCelular();
		String email = aluno.getEmail();
		String comentarios = aluno.getComentarios();
		byte[] image = aluno.getImage();

		AlunoDAO.insert(dataCadastro, academia, nome, sexo, nascimento, telefone, celular, email, image, comentarios);

	}

	public static void Logar(Usuario usuario) {

		String login = usuario.getLogin();
		String senha = usuario.getSenha();

		UsuarioDAO.buscarPorLoginSenha(login, senha);
	}

}