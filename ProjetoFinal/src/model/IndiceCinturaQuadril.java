package model;

public class IndiceCinturaQuadril {
	
	private int idAntropometriaGeral;
	private double cirCintAvaTestFi;
	private double circQuadAvalTestF;
	private double relaCintQuadF;
	private String riscoF;

	public int getIdAntropometriaGeral() {
		return idAntropometriaGeral;
	}
	public void setIdAntropometriaGeral(int idAntropometriaGeral) {
		this.idAntropometriaGeral = idAntropometriaGeral;
	}
	
	public double getCirCintAvaTestFi() {
		return cirCintAvaTestFi;
	}

	public void setCirCintAvaTestFi(double cirCintAvaTestFi) {
		this.cirCintAvaTestFi = cirCintAvaTestFi;
	}

	public double getCircQuadAvalTestF() {
		return circQuadAvalTestF;
	}

	public void setCircQuadAvalTestF(double circQuadAvalTestF) {
		this.circQuadAvalTestF = circQuadAvalTestF;
	}

	public double getRelaCintQuadF() {
		return relaCintQuadF;
	}

	public void setRelaCintQuadF(double relaCintQuadF) {
		this.relaCintQuadF = relaCintQuadF;
	}

	public String getRiscoF() {
		return riscoF;
	}

	public void setRiscoF(String riscoF) {
		this.riscoF = riscoF;
	}
	
	public IndiceCinturaQuadril(int idAntropometriaGeral, double cirCintAvaTestFi, double circQuadAvalTestF,
			double relaCintQuadF, String riscoF) {
		super();
		this.idAntropometriaGeral = idAntropometriaGeral;
		this.cirCintAvaTestFi = cirCintAvaTestFi;
		this.circQuadAvalTestF = circQuadAvalTestF;
		this.relaCintQuadF = relaCintQuadF;
		this.riscoF = riscoF;
	}



}
