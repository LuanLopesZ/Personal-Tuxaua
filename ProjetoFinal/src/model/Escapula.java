package model;

public class Escapula {

	private int idAntropometriaGeral;
	private boolean alinhadaEs;
	private boolean esqAbduzida;
	private boolean dirAbduzida;
	private boolean esqAduzida;
	private boolean dirAduzida;
	private boolean rodadaAImEsq;
	private boolean rodadaAInfDir;
	private boolean rodadaASupEsq;
	private boolean rodadaSupDir;
	private boolean esqAlada;
	private boolean dirAlada;

	public int getIdAntropometriaGeral() {
		return idAntropometriaGeral;
	}

	public void setIdAntropometriaGeral(int idAntropometriaGeral) {
		this.idAntropometriaGeral = idAntropometriaGeral;
	}

	public boolean isAlinhadaEs() {
		return alinhadaEs;
	}

	public void setAlinhadaEs(boolean alinhadaEs) {
		this.alinhadaEs = alinhadaEs;
	}

	public boolean isEsqAbduzida() {
		return esqAbduzida;
	}

	public void setEsqAbduzida(boolean esqAbduzida) {
		this.esqAbduzida = esqAbduzida;
	}

	public boolean isDirAbduzida() {
		return dirAbduzida;
	}

	public void setDirAbduzida(boolean dirAbduzida) {
		this.dirAbduzida = dirAbduzida;
	}

	public boolean isEsqAduzida() {
		return esqAduzida;
	}

	public void setEsqAduzida(boolean esqAduzida) {
		this.esqAduzida = esqAduzida;
	}

	public boolean isDirAduzida() {
		return dirAduzida;
	}

	public void setDirAduzida(boolean dirAduzida) {
		this.dirAduzida = dirAduzida;
	}

	public boolean isRodadaAImEsq() {
		return rodadaAImEsq;
	}

	public void setRodadaAImEsq(boolean rodadaAImEsq) {
		this.rodadaAImEsq = rodadaAImEsq;
	}

	public boolean isRodadaAInfDir() {
		return rodadaAInfDir;
	}

	public void setRodadaAInfDir(boolean rodadaAInfDir) {
		this.rodadaAInfDir = rodadaAInfDir;
	}

	public boolean isRodadaASupEsq() {
		return rodadaASupEsq;
	}

	public void setRodadaASupEsq(boolean rodadaASupEsq) {
		this.rodadaASupEsq = rodadaASupEsq;
	}

	public boolean isRodadaSupDir() {
		return rodadaSupDir;
	}

	public void setRodadaSupDir(boolean rodadaSupDir) {
		this.rodadaSupDir = rodadaSupDir;
	}

	public boolean isEsqAlada() {
		return esqAlada;
	}

	public void setEsqAlada(boolean esqAlada) {
		this.esqAlada = esqAlada;
	}

	public boolean isDirAlada() {
		return dirAlada;
	}

	public void setDirAlada(boolean dirAlada) {
		this.dirAlada = dirAlada;
	}

	public Escapula(int idAntropometriaGeral, boolean alinhadaEs, boolean esqAbduzida, boolean dirAbduzida,
			boolean esqAduzida, boolean dirAduzida, boolean rodadaAImEsq, boolean rodadaAInfDir, boolean rodadaASupEsq,
			boolean rodadaSupDir, boolean esqAlada, boolean dirAlada) {
		super();
		this.idAntropometriaGeral = idAntropometriaGeral;
		this.alinhadaEs = alinhadaEs;
		this.esqAbduzida = esqAbduzida;
		this.dirAbduzida = dirAbduzida;
		this.esqAduzida = esqAduzida;
		this.dirAduzida = dirAduzida;
		this.rodadaAImEsq = rodadaAImEsq;
		this.rodadaAInfDir = rodadaAInfDir;
		this.rodadaASupEsq = rodadaASupEsq;
		this.rodadaSupDir = rodadaSupDir;
		this.esqAlada = esqAlada;
		this.dirAlada = dirAlada;
	}

}
