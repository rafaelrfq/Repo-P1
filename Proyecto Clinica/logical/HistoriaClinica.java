package logical;

public class HistoriaClinica {

	private float presion, fc, glicemia, satO2;
	
	public HistoriaClinica(float presion, float fc, float glicemia, float satO2) {
		this.presion = presion;
		this.fc = fc;
		this.glicemia = glicemia;
		this.satO2 = satO2;
	}

	public float getPresion() {
		return presion;
	}

	public void setPresion(float presion) {
		this.presion = presion;
	}

	public float getFc() {
		return fc;
	}

	public void setFc(float fc) {
		this.fc = fc;
	}

	public float getGlicemia() {
		return glicemia;
	}

	public void setGlicemia(float glicemia) {
		this.glicemia = glicemia;
	}

	public float getSatO2() {
		return satO2;
	}

	public void setSatO2(float satO2) {
		this.satO2 = satO2;
	}

}
