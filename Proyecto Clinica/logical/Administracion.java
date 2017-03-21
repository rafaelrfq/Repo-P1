package logical;

public class Administracion extends Persona {

	private String usuario, password, posicion;
	
	public Administracion(String nomb, String apel, String cedula, String estCivil, int edad, String user, String pass, String posicion) {
		super(nomb, apel, cedula, estCivil, edad);
		this.usuario = user;
		this.password = pass;
		this.posicion = posicion;
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

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

}
