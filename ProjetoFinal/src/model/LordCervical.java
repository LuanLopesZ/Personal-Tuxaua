package model;

public class LordCervical {

	private int idAntropometriaGeral;
	private boolean fisiologica;
	private boolean aumentada;
	private boolean retificada;

	public int getIdAntropometriaGeral() {
		return idAntropometriaGeral;
	}

	public void setIdAntropometriaGeral(int idAntropometriaGeral) {
		this.idAntropometriaGeral = idAntropometriaGeral;
	}

	public boolean isFisiologica() {
		return fisiologica;
	}

	public void setFisiologica(boolean fisiologica) {
		this.fisiologica = fisiologica;
	}

	public boolean isAumentada() {
		return aumentada;
	}

	public void setAumentada(boolean aumentada) {
		this.aumentada = aumentada;
	}

	public boolean isRetificada() {
		return retificada;
	}

	public void setRetificada(boolean retificada) {
		this.retificada = retificada;
	}

	public LordCervical(int idAntropometriaGeral, boolean fisiologica, boolean aumentada, boolean retificada) {
		super();
		this.idAntropometriaGeral = idAntropometriaGeral;
		this.fisiologica = fisiologica;
		this.aumentada = aumentada;
		this.retificada = retificada;
	}

}
