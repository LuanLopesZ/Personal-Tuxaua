package model;

public class AntropometriaGeral {

	private int id;
	private String dataAvaliacao;
	private String valiadAvaliacao;
	private double massaCorpoTotal;
	private double estatura;
	private double freqCardRep;
	private double PreArtSistRepo;
	private double PresArtDiaRep;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDataAvaliacao() {
		return dataAvaliacao;
	}

	public void setDataAvaliacao(String dataAvaliacao) {
		this.dataAvaliacao = dataAvaliacao;
	}

	public String getValiadAvaliacao() {
		return valiadAvaliacao;
	}

	public void setValiadAvaliacao(String valiadAvaliacao) {
		this.valiadAvaliacao = valiadAvaliacao;
	}

	public double getMassaCorpoTotal() {
		return massaCorpoTotal;
	}

	public void setMassaCorpoTotal(double massaCorpoTotal) {
		this.massaCorpoTotal = massaCorpoTotal;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getFreqCardRep() {
		return freqCardRep;
	}

	public void setFreqCardRep(double freqCardRep) {
		this.freqCardRep = freqCardRep;
	}

	public double getPreArtSistRepo() {
		return PreArtSistRepo;
	}

	public void setPreArtSistRepo(double preArtSistRepo) {
		PreArtSistRepo = preArtSistRepo;
	}

	public double getPresArtDiaRep() {
		return PresArtDiaRep;
	}

	public void setPresArtDiaRep(double presArtDiaRep) {
		PresArtDiaRep = presArtDiaRep;
	}

	
	public AntropometriaGeral() {
		super();
	}

	public AntropometriaGeral(int id, String dataAvaliacao, String valiadAvaliacao, double massaCorpoTotal,
			double estatura, double freqCardRep, double preArtSistRepo, double presArtDiaRep) {
		super();
		this.id= id;
		this.dataAvaliacao = dataAvaliacao;
		this.valiadAvaliacao = valiadAvaliacao;
		this.massaCorpoTotal = massaCorpoTotal;
		this.estatura = estatura;
		this.freqCardRep = freqCardRep;
		this.PreArtSistRepo = preArtSistRepo;
		this.PresArtDiaRep = presArtDiaRep;
	}

	
	
	public AntropometriaGeral(String dataAvaliacao, String valiadAvaliacao, double massaCorpoTotal,
			double estatura, double freqCardRep, double preArtSistRepo, double presArtDiaRep) {
		super();
		this.dataAvaliacao = dataAvaliacao;
		this.valiadAvaliacao = valiadAvaliacao;
		this.massaCorpoTotal = massaCorpoTotal;
		this.estatura = estatura;
		this.freqCardRep = freqCardRep;
		this.PreArtSistRepo = preArtSistRepo;
		this.PresArtDiaRep = presArtDiaRep;
	}

}
