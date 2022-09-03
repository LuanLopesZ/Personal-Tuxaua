package model;

public class EspIlicAntPost {

	private int idAntropometriaGeral;
	private boolean alinhadovl;
	private boolean av;
	private boolean rv;

	public int getIdAntropometriaGeral() {
		return idAntropometriaGeral;
	}

	public void setIdAntropometriaGeral(int idAntropometriaGeral) {
		this.idAntropometriaGeral = idAntropometriaGeral;
	}

	public boolean isAlinhadovl() {
		return alinhadovl;
	}

	public void setAlinhadovl(boolean alinhadovl) {
		this.alinhadovl = alinhadovl;
	}

	public boolean isAv() {
		return av;
	}

	public void setAv(boolean av) {
		this.av = av;
	}

	public boolean isRv() {
		return rv;
	}

	public void setRv(boolean rv) {
		this.rv = rv;
	}

	public EspIlicAntPost(int idAntropometriaGeral, boolean alinhadovl, boolean av, boolean rv) {
		super();
		this.idAntropometriaGeral = idAntropometriaGeral;
		this.alinhadovl = alinhadovl;
		this.av = av;
		this.rv = rv;
	}

}
