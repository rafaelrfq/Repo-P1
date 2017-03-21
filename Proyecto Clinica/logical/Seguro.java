package logical;

public class Seguro {

	private String aseguradora;
	private int poliza;
	
	public Seguro(String aseguradora, int poliza) {
		this.aseguradora = aseguradora;
		this.poliza = poliza;
	}

	public String getAseguradora() {
		return aseguradora;
	}

	public void setAseguradora(String aseguradora) {
		this.aseguradora = aseguradora;
	}

	public int getPoliza() {
		return poliza;
	}

	public void setPoliza(int poliza) {
		this.poliza = poliza;
	}
}
