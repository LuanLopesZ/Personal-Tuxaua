package model;

public class PosicaoPes {

	private int idAntropometriaGeral;
	private boolean esqPronado;
	private boolean dirSupinado;
	private boolean alinhado;
	private boolean esqSupinado;
	private boolean dirPronado;
	
	public int getIdAntropometriaGeral() {
		return idAntropometriaGeral;
	}

	public void setIdAntropometriaGeral(int idAntropometriaGeral) {
		this.idAntropometriaGeral = idAntropometriaGeral;
	}

	public boolean isEsqPronado() {
		return esqPronado;
	}

	public void setEsqPronado(boolean esqPronado) {
		this.esqPronado = esqPronado;
	}

	public boolean isDirSupinado() {
		return dirSupinado;
	}

	public void setDirSupinado(boolean dirSupinado) {
		this.dirSupinado = dirSupinado;
	}

	public boolean isAlinhado() {
		return alinhado;
	}

	public void setAlinhado(boolean alinhado) {
		this.alinhado = alinhado;
	}

	public boolean isEsqSupinado() {
		return esqSupinado;
	}

	public void setEsqSupinado(boolean esqSupinado) {
		this.esqSupinado = esqSupinado;
	}

	public boolean isDirPronado() {
		return dirPronado;
	}

	public void setDirPronado(boolean dirPronado) {
		this.dirPronado = dirPronado;
	}

	public PosicaoPes(int idAntropometriaGeral,boolean esqPronado, boolean dirSupinado, boolean alinhado, boolean esqSupinado,
			boolean dirPronado) {
		super();
		this.idAntropometriaGeral = idAntropometriaGeral;
		this.esqPronado = esqPronado;
		this.dirSupinado = dirSupinado;
		this.alinhado = alinhado;
		this.esqSupinado = esqSupinado;
		this.dirPronado = dirPronado;
	}

}
