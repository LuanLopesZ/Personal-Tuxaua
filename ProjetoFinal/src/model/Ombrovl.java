package model;

public class Ombrovl {

	private int idAntropometriaGeral;
	private boolean alinhadoOmvl;
	private boolean protusos;
	private boolean retraidos;

	public int getIdAntropometriaGeral() {
		return idAntropometriaGeral;
	}

	public void setIdAntropometriaGeral(int idAntropometriaGeral) {
		this.idAntropometriaGeral = idAntropometriaGeral;
	}

	public boolean isAlinhadoOmvl() {
		return alinhadoOmvl;
	}

	public void setAlinhadoOmvl(boolean alinhadoOmvl) {
		this.alinhadoOmvl = alinhadoOmvl;
	}

	public boolean isProtusos() {
		return protusos;
	}

	public void setProtusos(boolean protusos) {
		this.protusos = protusos;
	}

	public boolean isRetraidos() {
		return retraidos;
	}

	public void setRetraidos(boolean retraidos) {
		this.retraidos = retraidos;
	}

	public Ombrovl(int idAntropometriaGeral, boolean alinhadoOmvl, boolean protusos, boolean retraidos) {
		super();
		this.idAntropometriaGeral = idAntropometriaGeral;
		this.alinhadoOmvl = alinhadoOmvl;
		this.protusos = protusos;
		this.retraidos = retraidos;
	}

}
