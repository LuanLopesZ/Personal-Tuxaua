package model;

public class antropometriaDobrasCutaneas {
    
	private int idAntropometriaGeral;
	private double tricF;
	private double subCapF;
	private double bicipitalF;
	private double peitoralF;
	private double axilarMediaF;
	private double suprailiacaF;
	private double abdominalF;
	private double coxaAnteriorF;
	private double pernaF;
	
	public int getIdAntropometriaGeral() {
		return idAntropometriaGeral;
	}

	public void setIdAntropometriaGeral(int idAntropometriaGeral) {
		this.idAntropometriaGeral = idAntropometriaGeral;
	}

	public double getTricF() {
		return tricF;
	}

	public void setTricF(double tricF) {
		this.tricF = tricF;
	}

	public double getSubCapF() {
		return subCapF;
	}

	public void setSubCapF(double subCapF) {
		this.subCapF = subCapF;
	}

	public double getBicipitalF() {
		return bicipitalF;
	}

	public void setBicipitalF(double bicipitalF) {
		this.bicipitalF = bicipitalF;
	}

	public double getPeitoralF() {
		return peitoralF;
	}

	public void setPeitoralF(double peitoralF) {
		this.peitoralF = peitoralF;
	}

	public double getAxilarMediaF() {
		return axilarMediaF;
	}

	public void setAxilarMediaF(double axilarMediaF) {
		this.axilarMediaF = axilarMediaF;
	}

	public double getSuprailiacaF() {
		return suprailiacaF;
	}

	public void setSuprailiacaF(double suprailiacaF) {
		this.suprailiacaF = suprailiacaF;
	}

	public double getAbdominalF() {
		return abdominalF;
	}

	public void setAbdominalF(double abdominalF) {
		this.abdominalF = abdominalF;
	}

	public double getCoxaAnteriorF() {
		return coxaAnteriorF;
	}

	public void setCoxaAnteriorF(double coxaAnteriorF) {
		this.coxaAnteriorF = coxaAnteriorF;
	}

	public double getPernaF() {
		return pernaF;
	}

	public void setPernaF(double pernaF) {
		this.pernaF = pernaF;
	}

	public antropometriaDobrasCutaneas(int idAntropometriaGeral, double tricF, double subCapF, double bicipitalF,
			double peitoralF, double axilarMediaF, double suprailiacaF, double abdominalF, double coxaAnteriorF,
			double pernaF) {
		super();
		this.idAntropometriaGeral = idAntropometriaGeral;
		this.tricF = tricF;
		this.subCapF = subCapF;
		this.bicipitalF = bicipitalF;
		this.peitoralF = peitoralF;
		this.axilarMediaF = axilarMediaF;
		this.suprailiacaF = suprailiacaF;
		this.abdominalF = abdominalF;
		this.coxaAnteriorF = coxaAnteriorF;
		this.pernaF = pernaF;
	}

}
