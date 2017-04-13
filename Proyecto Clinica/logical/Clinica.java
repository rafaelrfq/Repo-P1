package logical;

import java.util.ArrayList;

public class Clinica {

	private ArrayList<Empleado> miPersonal;
	private ArrayList<Paciente> misPacientes;
	private static Clinica clinica = null;
	private int indiceUser;
	private ArrayList<Enfermedad> misEnfermedades;
	
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
	
	public ArrayList<Enfermedad> getMisEnfermedades() {
		return misEnfermedades;
	}
	
	private Clinica() {
		miPersonal = new ArrayList<Empleado>();
		misPacientes = new ArrayList<Paciente>();
		misEnfermedades = new ArrayList<Enfermedad>();
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
	

	public void agregarEnfermedad(String nombre){
		Enfermedad aux =  new Enfermedad(nombre);
		misEnfermedades.add(aux);
	}
	
	public int cantPacientes(){
		return misPacientes.size();
	}
	
	public int cantEnfermedades(){
		return misEnfermedades.size();
	}

	public float porcientoDeEnfermedad(String Enfermedad){
		int cont = 0;
		for(int ind = 0 ; ind < misEnfermedades.size() ; ind++)
		{
			if(misEnfermedades.get(ind).getNombre() == Enfermedad)
				cont ++;
		}
		return (float) (cont/cantPacientes());
	}
	

}
