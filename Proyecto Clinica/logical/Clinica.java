package logical;

import java.util.ArrayList;

public class Clinica {

	private ArrayList<Empleado> miPersonal;
	private ArrayList<Paciente> misPacientes;
	private static Clinica clinica = null;
	private int indiceUser;
	
	public int getIndiceUser() {
		return indiceUser;
	}

	public void setIndiceUser(int indiceUser) {
		this.indiceUser = indiceUser;
	}

	public ArrayList<Empleado> getMiPersonal() {
		return miPersonal;
	}

	public ArrayList<Paciente> getMisPacientes() {
		return misPacientes;
	}

	private Clinica() {
		miPersonal = new ArrayList<Empleado>();
		misPacientes = new ArrayList<Paciente>();
	}
	
	public static Clinica getInstance() {
		if(clinica == null) {
			clinica = new Clinica();
		}
		return clinica;
	}
	
	public void agregarPersonal(Empleado aux) {
		miPersonal.add(aux);
	}
	
	public void agregarPaciente(Paciente aux) {
		misPacientes.add(aux);
	}

}
