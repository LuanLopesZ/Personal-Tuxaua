package model;

public class Ombro2 {

	private int idAntropometriaGeral;
	private boolean alinhadoOm;
	private boolean esqDeprimidoOm;
	private boolean dirDeprimidoOm;
	
	public int getIdAntropometriaGeral() {
		return idAntropometriaGeral;
	}
	public void setIdAntropometriaGeral(int idAntropometriaGeral) {
		this.idAntropometriaGeral = idAntropometriaGeral;
	}

	public boolean isAlinhadoOm() {
		return alinhadoOm;
	}

	public void setAlinhadoOm(boolean alinhadoOm) {
		this.alinhadoOm = alinhadoOm;
	}

	public boolean isEsqDeprimidoOm() {
		return esqDeprimidoOm;
	}

	public void setEsqDeprimidoOm(boolean esqDeprimidoOm) {
		this.esqDeprimidoOm = esqDeprimidoOm;
	}

	public boolean isDirDeprimidoOm() {
		return dirDeprimidoOm;
	}

	public void setDirDeprimidoOm(boolean dirDeprimidoOm) {
		this.dirDeprimidoOm = dirDeprimidoOm;
	}

	public Ombro2(int idAntropometriaGeral, boolean alinhadoOm, boolean esqDeprimidoOm, boolean dirDeprimidoOm) {
		super();
		this.idAntropometriaGeral = idAntropometriaGeral;
		this.alinhadoOm = alinhadoOm;
		this.esqDeprimidoOm = esqDeprimidoOm;
		this.dirDeprimidoOm = dirDeprimidoOm;
	}

	
}
