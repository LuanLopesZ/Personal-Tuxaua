package model;

public class EspIlicaAntPost {

	private int idAntropometriaGeral;
	private boolean alinhadoEs;
	private boolean esqDeprimido;
	private boolean dirDeprimido;

	public int getIdAntropometriaGeral() {
		return idAntropometriaGeral;
	}

	public void setIdAntropometriaGeral(int idAntropometriaGeral) {
		this.idAntropometriaGeral = idAntropometriaGeral;
	}

	public boolean isAlinhadoEs() {
		return alinhadoEs;
	}

	public void setAlinhadoEs(boolean alinhadoEs) {
		this.alinhadoEs = alinhadoEs;
	}

	public boolean isEsqDeprimido() {
		return esqDeprimido;
	}

	public void setEsqDeprimido(boolean esqDeprimido) {
		this.esqDeprimido = esqDeprimido;
	}

	public boolean isDirDeprimido() {
		return dirDeprimido;
	}

	public void setDirDeprimido(boolean dirDeprimido) {
		this.dirDeprimido = dirDeprimido;
	}

	public EspIlicaAntPost(int idAntropometriaGeral, boolean alinhadoEs, boolean esqDeprimido, boolean dirDeprimido) {
		super();
		this.idAntropometriaGeral = idAntropometriaGeral;
		this.alinhadoEs = alinhadoEs;
		this.esqDeprimido = esqDeprimido;
		this.dirDeprimido = dirDeprimido;
	}

}
