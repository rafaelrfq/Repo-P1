package logical;

public abstract class Persona {
	
	private String nombre, apellido, cedula, estadoCivil;
	private int edad;
	
	public Persona(String nomb, String apel, String cedula, String estCivil, int edad) {
		this.nombre = nomb;
		this.apellido = apel;
		this.cedula = cedula;
		this.estadoCivil = estCivil;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
