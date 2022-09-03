package model;

public class Abdomen2 {

	private int idAntropometriaGeral;
	private boolean normotrofico;
	private boolean protuso;

	public int getIdAntropometriaGeral() {
		return idAntropometriaGeral;
	}
	public void setIdAntropometriaGeral(int idAntropometriaGeral) {
		this.idAntropometriaGeral = idAntropometriaGeral;
	}
	
	public boolean isNormotrofico() {
		return normotrofico;
	}

	public void setNormotrofico(boolean normotrofico) {
		this.normotrofico = normotrofico;
	}

	public boolean isProtuso() {
		return protuso;
	}

	public void setProtuso(boolean protuso) {
		this.protuso = protuso;
	}
	public Abdomen2(int idAntropometriaGeral, boolean normotrofico, boolean protuso) {
		super();
		this.idAntropometriaGeral = idAntropometriaGeral;
		this.normotrofico = normotrofico;
		this.protuso = protuso;
	}

	

}
