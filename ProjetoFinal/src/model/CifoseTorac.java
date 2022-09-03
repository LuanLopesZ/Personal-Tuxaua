package model;

public class CifoseTorac {
	
	private int idAntropometriaGeral;
	private boolean fisiologicaCT;
	private boolean aumentadaCT;
	private boolean retificadaCT;

	public int getIdAntropometriaGeral() {
		return idAntropometriaGeral;
	}
	public void setIdAntropometriaGeral(int idAntropometriaGeral) {
		this.idAntropometriaGeral = idAntropometriaGeral;
	}
	
	public boolean isFisiologicaCT() {
		return fisiologicaCT;
	}

	public void setFisiologicaCT(boolean fisiologicaCT) {
		this.fisiologicaCT = fisiologicaCT;
	}

	public boolean isAumentadaCT() {
		return aumentadaCT;
	}

	public void setAumentadaCT(boolean aumentadaCT) {
		this.aumentadaCT = aumentadaCT;
	}

	public boolean isRetificadaCT() {
		return retificadaCT;
	}

	public void setRetificadaCT(boolean retificadaCT) {
		this.retificadaCT = retificadaCT;
	}
	
	public CifoseTorac(int idAntropometriaGeral, boolean fisiologicaCT, boolean aumentadaCT, boolean retificadaCT) {
		super();
		this.idAntropometriaGeral = idAntropometriaGeral;
		this.fisiologicaCT = fisiologicaCT;
		this.aumentadaCT = aumentadaCT;
		this.retificadaCT = retificadaCT;
	}

	

}
