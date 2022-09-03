package model;

public class Coluna {

	private int idAntropometriaGeral;
	private boolean alinhadaCO;
	private boolean escolioseLombarDir;
	private boolean escolioseLombarEsq;
	private boolean escolioseToracicaDir;
	private boolean escolioseToracicaEsq;
	private boolean escolioseDorsoLombarDir;
	private boolean escolioseDorsoLombarEsq;
	private boolean escolioseEmS;

	public int getIdAntropometriaGeral() {
		return idAntropometriaGeral;
	}

	public void setIdAntropometriaGeral(int idAntropometriaGeral) {
		this.idAntropometriaGeral = idAntropometriaGeral;
	}

	public boolean isAlinhadaCO() {
		return alinhadaCO;
	}

	public void setAlinhadaCO(boolean alinhadaCO) {
		this.alinhadaCO = alinhadaCO;
	}

	public boolean isEscolioseLombarDir() {
		return escolioseLombarDir;
	}

	public void setEscolioseLombarDir(boolean escolioseLombarDir) {
		this.escolioseLombarDir = escolioseLombarDir;
	}

	public boolean isEscolioseLombarEsq() {
		return escolioseLombarEsq;
	}

	public void setEscolioseLombarEsq(boolean escolioseLombarEsq) {
		this.escolioseLombarEsq = escolioseLombarEsq;
	}

	public boolean isEscolioseToracicaDir() {
		return escolioseToracicaDir;
	}

	public void setEscolioseToracicaDir(boolean escolioseToracicaDir) {
		this.escolioseToracicaDir = escolioseToracicaDir;
	}

	public boolean isEscolioseToracicaEsq() {
		return escolioseToracicaEsq;
	}

	public void setEscolioseToracicaEsq(boolean escolioseToracicaEsq) {
		this.escolioseToracicaEsq = escolioseToracicaEsq;
	}

	public boolean isEscolioseDorsoLombarDir() {
		return escolioseDorsoLombarDir;
	}

	public void setEscolioseDorsoLombarDir(boolean escolioseDorsoLombarDir) {
		this.escolioseDorsoLombarDir = escolioseDorsoLombarDir;
	}

	public boolean isEscolioseDorsoLombarEsq() {
		return escolioseDorsoLombarEsq;
	}

	public void setEscolioseDorsoLombarEsq(boolean escolioseDorsoLombarEsq) {
		this.escolioseDorsoLombarEsq = escolioseDorsoLombarEsq;
	}

	public boolean isEscolioseEmS() {
		return escolioseEmS;
	}

	public void setEscolioseEmS(boolean escolioseEmS) {
		this.escolioseEmS = escolioseEmS;
	}

	public Coluna(int idAntropometriaGeral, boolean alinhadaCO, boolean escolioseLombarDir, boolean escolioseLombarEsq,
			boolean escolioseToracicaDir, boolean escolioseToracicaEsq, boolean escolioseDorsoLombarDir,
			boolean escolioseDorsoLombarEsq, boolean escolioseEmS) {
		super();
		this.idAntropometriaGeral = idAntropometriaGeral;
		this.alinhadaCO = alinhadaCO;
		this.escolioseLombarDir = escolioseLombarDir;
		this.escolioseLombarEsq = escolioseLombarEsq;
		this.escolioseToracicaDir = escolioseToracicaDir;
		this.escolioseToracicaEsq = escolioseToracicaEsq;
		this.escolioseDorsoLombarDir = escolioseDorsoLombarDir;
		this.escolioseDorsoLombarEsq = escolioseDorsoLombarEsq;
		this.escolioseEmS = escolioseEmS;
	}

}
