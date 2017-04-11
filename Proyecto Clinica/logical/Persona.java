package logical;

public abstract class Persona {
	
	private String nombre, sexo, cedula, estadoCivil;
	private int edad;
	
	public Persona(String nomb, String sexo, String cedula, String estCivil, int edad) {
		this.nombre = nomb;
		this.sexo = sexo;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
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
