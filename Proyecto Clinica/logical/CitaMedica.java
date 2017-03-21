package logical;

import java.text.SimpleDateFormat;

public class CitaMedica {

	/*
	 * Simple Date Format "yyyy-mm-dd"
	*/
	private SimpleDateFormat fecha;
	private String date;
	
	public CitaMedica(String date) {
		this.date = date;
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
}
