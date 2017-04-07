package logical;

public class Administracion extends Empleado {

	private String posicion;
	
	public Administracion(String nomb, String apel, String cedula, String estCivil, int edad, String user, String pass, String posicion) {
		super(nomb, apel, cedula, estCivil, edad, user, pass);
		this.posicion = posicion;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

}
