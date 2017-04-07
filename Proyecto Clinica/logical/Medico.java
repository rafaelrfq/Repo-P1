package logical;

public class Medico extends Empleado {

	private String especialidad;
	private int tiempo;
	
	public Medico(String nomb, String apel, String cedula, String estCivil, int edad, String usuario, String password, String especialidad, int tiempo) {
		super(nomb, apel, cedula, estCivil, edad, usuario, password);
		this.especialidad = especialidad;
		this.tiempo = tiempo;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

}
