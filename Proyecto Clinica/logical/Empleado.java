package logical;

public abstract class Empleado extends Persona{
	
	private String username, password;

	public Empleado(String nomb, String sexo, String cedula, String estCivil, int edad, String username, String password) {
		super(nomb, sexo, cedula, estCivil, edad);
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
