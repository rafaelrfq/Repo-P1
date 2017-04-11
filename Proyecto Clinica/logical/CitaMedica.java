package logical;

import java.text.SimpleDateFormat;

public class CitaMedica {

	/*
	 * Simple Date Format "yyyy-mm-dd"
	*/
	private SimpleDateFormat fecha;
	private String date;
	private String doctorEscogido;
	
	public CitaMedica(String date, String doctorEscogido) {
		this.date = date;
		this.doctorEscogido = doctorEscogido;
		fecha = new SimpleDateFormat(date);
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public SimpleDateFormat getFecha() {
		return fecha;
	}

	public String getDoctorEscogido() {
		return doctorEscogido;
	}
}
