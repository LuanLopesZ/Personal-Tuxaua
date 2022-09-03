package model;

public class Joelhos {

	private int idAntropometriaGeral;
	private boolean alinhados;
	private boolean esqVaraJ;
	private boolean dirVaraJ;
	private boolean esqValgoJ;
	private boolean dirValgoJ;
	
	public int getIdAntropometriaGeral() {
		return idAntropometriaGeral;
	}

	public void setIdAntropometriaGeral(int idAntropometriaGeral) {
		this.idAntropometriaGeral = idAntropometriaGeral;
	}


	public boolean isAlinhados() {
		return alinhados;
	}

	public void setAlinhados(boolean alinhados) {
		this.alinhados = alinhados;
	}

	public boolean isEsqVaraJ() {
		return esqVaraJ;
	}

	public void setEsqVaraJ(boolean esqVaraJ) {
		this.esqVaraJ = esqVaraJ;
	}

	public boolean isDirVaraJ() {
		return dirVaraJ;
	}

	public void setDirVaraJ(boolean dirVaraJ) {
		this.dirVaraJ = dirVaraJ;
	}

	public boolean isEsqValgoJ() {
		return esqValgoJ;
	}

	public void setEsqValgoJ(boolean esqValgoJ) {
		this.esqValgoJ = esqValgoJ;
	}

	public boolean isDirValgoJ() {
		return dirValgoJ;
	}

	public void setDirValgoJ(boolean dirValgoJ) {
		this.dirValgoJ = dirValgoJ;
	}

	public Joelhos(int idAntropometriaGeral, boolean alinhados, boolean esqVaraJ, boolean dirVaraJ, boolean esqValgoJ,
			boolean dirValgoJ) {
		super();
		this.idAntropometriaGeral = idAntropometriaGeral;
		this.alinhados = alinhados;
		this.esqVaraJ = esqVaraJ;
		this.dirVaraJ = dirVaraJ;
		this.esqValgoJ = esqValgoJ;
		this.dirValgoJ = dirValgoJ;
	}

	

}
