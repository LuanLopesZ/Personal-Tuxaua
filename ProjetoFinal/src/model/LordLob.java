package model;

public class LordLob {

	private int idAntropometriaGeral;
	private boolean fisiologicaLL;
	private boolean aumentadaLL;
	private boolean retificadall;
	
	public int getIdAntropometriaGeral() {
		return idAntropometriaGeral;
	}
	public void setIdAntropometriaGeral(int idAntropometriaGeral) {
		this.idAntropometriaGeral = idAntropometriaGeral;
	}

	public boolean isFisiologicaLL() {
		return fisiologicaLL;
	}

	public void setFisiologicaLL(boolean fisiologicaLL) {
		this.fisiologicaLL = fisiologicaLL;
	}

	public boolean isAumentadaLL() {
		return aumentadaLL;
	}

	public void setAumentadaLL(boolean aumentadaLL) {
		this.aumentadaLL = aumentadaLL;
	}

	public boolean isRetificadall() {
		return retificadall;
	}

	public void setRetificadall(boolean retificadall) {
		this.retificadall = retificadall;
	}
	
	public LordLob(int idAntropometriaGeral, boolean fisiologicaLL, boolean aumentadaLL, boolean retificadall) {
		super();
		this.idAntropometriaGeral = idAntropometriaGeral;
		this.fisiologicaLL = fisiologicaLL;
		this.aumentadaLL = aumentadaLL;
		this.retificadall = retificadall;
	}

	

}
