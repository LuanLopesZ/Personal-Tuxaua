package model;

public class Joelhos2 {

	private int idAntropometriaGeral;
	private boolean alinhadosVL;
	private boolean recurvatum;
	private boolean semifletido;

	public int getIdAntropometriaGeral() {
		return idAntropometriaGeral;
	}

	public void setIdAntropometriaGeral(int idAntropometriaGeral) {
		this.idAntropometriaGeral = idAntropometriaGeral;
	}

	public boolean isAlinhadosVL() {
		return alinhadosVL;
	}

	public void setAlinhadosVL(boolean alinhadosVL) {
		this.alinhadosVL = alinhadosVL;
	}

	public boolean isRecurvatum() {
		return recurvatum;
	}

	public void setRecurvatum(boolean recurvatum) {
		this.recurvatum = recurvatum;
	}

	public boolean isSemifletido() {
		return semifletido;
	}

	public void setSemifletido(boolean semifletido) {
		this.semifletido = semifletido;
	}

	public Joelhos2(int idAntropometriaGeral, boolean alinhadosVL, boolean recurvatum, boolean semifletido) {
		super();
		this.idAntropometriaGeral = idAntropometriaGeral;
		this.alinhadosVL = alinhadosVL;
		this.recurvatum = recurvatum;
		this.semifletido = semifletido;
	}

}
