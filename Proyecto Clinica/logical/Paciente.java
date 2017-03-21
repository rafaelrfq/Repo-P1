package logical;

public class Paciente extends Persona {

	private Seguro seg;
	private HistoriaClinica miHistoria;
	private String direccion;
	
	public Paciente(String nomb, String apel, String cedula, String estCivil, int edad, String aseguradora, int poliza, String direccion) {
		super(nomb, apel, cedula, estCivil, edad);
		seg = new Seguro(aseguradora, poliza);
		this.direccion = direccion;
	}

	public Seguro getSeg() {
		return seg;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
