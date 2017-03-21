package logical;

public class Medico extends Persona {

	private String usuario, password, especialidad;
	private int tiempo;
	
	public Medico(String nomb, String apel, String cedula, String estCivil, int edad, String usuario, String password, String especialidad, int tiempo) {
		super(nomb, apel, cedula, estCivil, edad);
		this.usuario = usuario;
		this.password = password;
		this.especialidad = especialidad;
		this.tiempo = tiempo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
