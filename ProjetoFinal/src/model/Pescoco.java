package model;

public class Pescoco {

	private int idAntropometriaGeral;
	private boolean alinhadoPe;
	private boolean esqInclinLateral;
	private boolean dirInclinLateral;

	public int getIdAntropometriaGeral() {
		return idAntropometriaGeral;
	}

	public void setIdAntropometriaGeral(int idAntropometriaGeral) {
		this.idAntropometriaGeral = idAntropometriaGeral;
	}

	public boolean isAlinhadoPe() {
		return alinhadoPe;
	}

	public void setAlinhadoPe(boolean alinhadoPe) {
		this.alinhadoPe = alinhadoPe;
	}

	public boolean isEsqInclinLateral() {
		return esqInclinLateral;
	}

	public void setEsqInclinLateral(boolean esqInclinLateral) {
		this.esqInclinLateral = esqInclinLateral;
	}

	public boolean isDirInclinLateral() {
		return dirInclinLateral;
	}

	public void setDirInclinLateral(boolean dirInclinLateral) {
		this.dirInclinLateral = dirInclinLateral;
	}

	public Pescoco(int idAntropometriaGeral, boolean alinhadoPe, boolean esqInclinLateral, boolean dirInclinLateral) {
		super();
		this.idAntropometriaGeral = idAntropometriaGeral;
		this.alinhadoPe = alinhadoPe;
		this.esqInclinLateral = esqInclinLateral;
		this.dirInclinLateral = dirInclinLateral;
	}

}
