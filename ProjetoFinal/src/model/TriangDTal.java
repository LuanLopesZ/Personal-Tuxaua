package model;

public class TriangDTal {

	private int idAntropometriaGeral;
	private boolean simetricos;
	private boolean agudosADir;
	private boolean agudosAEsq;

	public int getIdAntropometriaGeral() {
		return idAntropometriaGeral;
	}

	public void setIdAntropometriaGeral(int idAntropometriaGeral) {
		this.idAntropometriaGeral = idAntropometriaGeral;
	}

	public boolean isSimetricos() {
		return simetricos;
	}

	public void setSimetricos(boolean simetricos) {
		this.simetricos = simetricos;
	}

	public boolean isAgudosADir() {
		return agudosADir;
	}

	public void setAgudosADir(boolean agudosADir) {
		this.agudosADir = agudosADir;
	}

	public boolean isAgudosAEsq() {
		return agudosAEsq;
	}

	public void setAgudosAEsq(boolean agudosAEsq) {
		this.agudosAEsq = agudosAEsq;
	}

	public TriangDTal(int idAntropometriaGeral, boolean simetricos, boolean agudosADir, boolean agudosAEsq) {
		super();
		this.idAntropometriaGeral = idAntropometriaGeral;
		this.simetricos = simetricos;
		this.agudosADir = agudosADir;
		this.agudosAEsq = agudosAEsq;
	}

}
