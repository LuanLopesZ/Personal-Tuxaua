package model;

public class ComentarioFinal {

	private int idAntropometriaGeral;
	private String observacaoA;
	private String objetivoA;
	private String atividPretAcadF;
	private String periodicidadeA;

	public int getIdAntropometriaGeral() {
		return idAntropometriaGeral;
	}

	public void setIdAntropometriaGeral(int idAntropometriaGeral) {
		this.idAntropometriaGeral = idAntropometriaGeral;
	}

	public String getObservacaoA() {
		return observacaoA;
	}

	public void setObservacaoA(String observacaoA) {
		this.observacaoA = observacaoA;
	}

	public String getObjetivoA() {
		return objetivoA;
	}

	public void setObjetivoA(String objetivoA) {
		this.objetivoA = objetivoA;
	}

	public String getAtividPretAcadF() {
		return atividPretAcadF;
	}

	public void setAtividPretAcadF(String atividPretAcadF) {
		this.atividPretAcadF = atividPretAcadF;
	}

	public String getPeriodicidadeA() {
		return periodicidadeA;
	}

	public void setPeriodicidadeA(String periodicidadeA) {
		this.periodicidadeA = periodicidadeA;
	}

	public ComentarioFinal(int idAntropometriaGeral, String observacaoA, String objetivoA, String atividPretAcadF,
			String periodicidadeA) {
		super();
		this.idAntropometriaGeral = idAntropometriaGeral;
		this.observacaoA = observacaoA;
		this.objetivoA = objetivoA;
		this.atividPretAcadF = atividPretAcadF;
		this.periodicidadeA = periodicidadeA;
	}

}
