package model;

public class Femur {

	private int idAntropometriaGeral;
	private boolean torcaoInterna;
	private boolean torcaoExterna;

	public int getIdAntropometriaGeral() {
		return idAntropometriaGeral;
	}

	public void setIdAntropometriaGeral(int idAntropometriaGeral) {
		this.idAntropometriaGeral = idAntropometriaGeral;
	}

	public boolean isTorcaoInterna() {
		return torcaoInterna;
	}

	public void setTorcaoInterna(boolean torcaoInterna) {
		this.torcaoInterna = torcaoInterna;
	}

	public boolean isTorcaoExterna() {
		return torcaoExterna;
	}

	public void setTorcaoExterna(boolean torcaoExterna) {
		this.torcaoExterna = torcaoExterna;
	}

	public Femur(int idAntropometriaGeral, boolean torcaoInterna, boolean torcaoExterna) {
		super();
		this.idAntropometriaGeral = idAntropometriaGeral;
		this.torcaoInterna = torcaoInterna;
		this.torcaoExterna = torcaoExterna;
	}
}
