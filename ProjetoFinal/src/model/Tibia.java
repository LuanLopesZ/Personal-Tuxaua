package model;

public class Tibia {

	private int idAntropometriaGeral;
	private boolean alinhada;
	private boolean esqVara;
	private boolean dirVara;
	private boolean esqValgo;
	private boolean dirValgo;
	
	public int getIdAntropometriaGeral() {
		return idAntropometriaGeral;
	}

	public void setIdAntropometriaGeral(int idAntropometriaGeral) {
		this.idAntropometriaGeral = idAntropometriaGeral;
	}

	public boolean isAlinhada() {
		return alinhada;
	}

	public void setAlinhada(boolean alinhada) {
		this.alinhada = alinhada;
	}

	public boolean isEsqVara() {
		return esqVara;
	}

	public void setEsqVara(boolean esqVara) {
		this.esqVara = esqVara;
	}

	public boolean isDirVara() {
		return dirVara;
	}

	public void setDirVara(boolean dirVara) {
		this.dirVara = dirVara;
	}

	public boolean isEsqValgo() {
		return esqValgo;
	}

	public void setEsqValgo(boolean esqValgo) {
		this.esqValgo = esqValgo;
	}

	public boolean isDirValgo() {
		return dirValgo;
	}

	public void setDirValgo(boolean dirValgo) {
		this.dirValgo = dirValgo;
	}

	public Tibia(int idAntropometriaGeral, boolean alinhada, boolean esqVara, boolean dirVara, boolean esqValgo, boolean dirValgo) {
		super();
		this.idAntropometriaGeral = idAntropometriaGeral;
		this.alinhada = alinhada;
		this.esqVara = esqVara;
		this.dirVara = dirVara;
		this.esqValgo = esqValgo;
		this.dirValgo = dirValgo;
	}

}
