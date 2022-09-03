package model;

public class ComposicaoCorporal {

	private int idAntropometriaGeral;
	private double massCorpTotal2F;
	private double percentGorduraF;
	private double masCopIdF;
	private double masCorpGordaF;
	private double masCopMagraF;
	private double exGordCorpF;

	public int getIdAntropometriaGeral() {
		return idAntropometriaGeral;
	}

	public void setIdAntropometriaGeral(int idAntropometriaGeral) {
		this.idAntropometriaGeral = idAntropometriaGeral;
	}

	public double getMassCorpTotal2F() {
		return massCorpTotal2F;
	}

	public void setMassCorpTotal2F(double massCorpTotal2F) {
		this.massCorpTotal2F = massCorpTotal2F;
	}

	public double getPercentGorduraF() {
		return percentGorduraF;
	}

	public void setPercentGorduraF(double percentGorduraF) {
		this.percentGorduraF = percentGorduraF;
	}

	public double getMasCopIdF() {
		return masCopIdF;
	}

	public void setMasCopIdF(double masCopIdF) {
		this.masCopIdF = masCopIdF;
	}

	public double getMasCorpGordaF() {
		return masCorpGordaF;
	}

	public void setMasCorpGordaF(double masCorpGordaF) {
		this.masCorpGordaF = masCorpGordaF;
	}

	public double getMasCopMagraF() {
		return masCopMagraF;
	}

	public void setMasCopMagraF(double masCopMagraF) {
		this.masCopMagraF = masCopMagraF;
	}

	public double getExGordCorpF() {
		return exGordCorpF;
	}

	public void setExGordCorpF(double exGordCorpF) {
		this.exGordCorpF = exGordCorpF;
	}

	public ComposicaoCorporal(int idAntropometriaGeral, double massCorpTotal2F, double percentGorduraF,
			double masCopIdF, double masCorpGordaF, double masCopMagraF, double exGordCorpF) {
		super();
		this.idAntropometriaGeral = idAntropometriaGeral;
		this.massCorpTotal2F = massCorpTotal2F;
		this.percentGorduraF = percentGorduraF;
		this.masCopIdF = masCopIdF;
		this.masCorpGordaF = masCorpGordaF;
		this.masCopMagraF = masCopMagraF;
		this.exGordCorpF = exGordCorpF;
	}

}
