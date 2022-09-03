package model;

public class AntropometriaCircunferenciasMusculares {
    
	private int idAntropometriaGeral;
	private double ombro;
	private double torax;
	private double busto;
	private double bracoDir;
	private double antBracDir;
	private double bracoEsq;
	private double antBracEsq;
	private double cintura;
	private double abdomen;
	private double quadril;
	private double coxaDir;
	private double coxaEsq;
	private double pernaEsq;
	private double pernaDir;
	
	public int getIdAntropometriaGeral() {
		return idAntropometriaGeral;
	}
	public void setIdAntropometriaGeral(int idAntropometriaGeral) {
		this.idAntropometriaGeral = idAntropometriaGeral;
	}
	public double getOmbro() {
		return ombro;
	}
	public void setOmbro(double ombro) {
		this.ombro = ombro;
	}
	public double getTorax() {
		return torax;
	}
	public void setTorax(double torax) {
		this.torax = torax;
	}
	public double getBusto() {
		return busto;
	}
	public void setBusto(double busto) {
		this.busto = busto;
	}
	public double getBracoDir() {
		return bracoDir;
	}
	public void setBracoDir(double bracoDir) {
		this.bracoDir = bracoDir;
	}
	public double getAntBracDir() {
		return antBracDir;
	}
	public void setAntBracDir(double antBracDir) {
		this.antBracDir = antBracDir;
	}
	public double getBracoEsq() {
		return bracoEsq;
	}
	public void setBracoEsq(double bracoEsq) {
		this.bracoEsq = bracoEsq;
	}
	public double getAntBracEsq() {
		return antBracEsq;
	}
	public void setAntBracEsq(double antBracEsq) {
		this.antBracEsq = antBracEsq;
	}
	public double getCintura() {
		return cintura;
	}
	public void setCintura(double cintura) {
		this.cintura = cintura;
	}
	public double getAbdomen() {
		return abdomen;
	}
	public void setAbdomen(double abdomen) {
		this.abdomen = abdomen;
	}
	public double getQuadril() {
		return quadril;
	}
	public void setQuadril(double quadril) {
		this.quadril = quadril;
	}
	public double getCoxaDir() {
		return coxaDir;
	}
	public void setCoxaDir(double coxaDir) {
		this.coxaDir = coxaDir;
	}
	public double getCoxaEsq() {
		return coxaEsq;
	}
	public void setCoxaEsq(double coxaEsq) {
		this.coxaEsq = coxaEsq;
	}
	public double getPernaEsq() {
		return pernaEsq;
	}
	public void setPernaEsq(double pernaEsq) {
		this.pernaEsq = pernaEsq;
	}
	public double getPernaDir() {
		return pernaDir;
	}
	public void setPernaDir(double pernaDir) {
		this.pernaDir = pernaDir;
	}
	public AntropometriaCircunferenciasMusculares(int idAntropometriaGeral,double ombro, double torax, double busto, double bracoDir,
			double antBracDir, double bracoEsq, double antBracEsq, double cintura, double abdomen, double quadril,
			double coxaDir, double coxaEsq, double pernaEsq, double pernaDir) {
		super();
		this.idAntropometriaGeral = idAntropometriaGeral;
		this.ombro = ombro;
		this.torax = torax;
		this.busto = busto;
		this.bracoDir = bracoDir;
		this.antBracDir = antBracDir;
		this.bracoEsq = bracoEsq;
		this.antBracEsq = antBracEsq;
		this.cintura = cintura;
		this.abdomen = abdomen;
		this.quadril = quadril;
		this.coxaDir = coxaDir;
		this.coxaEsq = coxaEsq;
		this.pernaEsq = pernaEsq;
		this.pernaDir = pernaDir;
	}
	
	
}
