package sistGestion;

import java.time.LocalDate;

public class Tarea {
	private int idTarea;
	private String tarea;
	private LocalDate fechaInicio; // inicio de la tarea
	private LocalDate fechaFin; 
	private Empleado responsable; 
	private int cantHorasDiarias; 
	private boolean habil; 
	
	
	
	public Tarea(int idTarea, String tarea, LocalDate fechaInicio, LocalDate fechaFin, Empleado responsable,
			int cantHorasDiarias, boolean habil) {
		super();
		this.idTarea = idTarea;
		this.tarea = tarea;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.responsable = responsable;
		this.cantHorasDiarias = cantHorasDiarias;
		this.habil = habil;
	}

	

	public String getTarea() {
		return tarea;
	}



	public void setTarea(String tarea) {
		this.tarea = tarea;
	}



	public LocalDate getFechaInicio() {
		return fechaInicio;
	}



	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}



	public LocalDate getFechaFin() {
		return fechaFin;
	}



	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}



	public Empleado getResponsable() {
		return responsable;
	}



	public void setResponsable(Empleado responsable) {
		this.responsable = responsable;
	}



	public int getCantHorasDiarias() {
		return cantHorasDiarias;
	}



	public void setCantHorasDiarias(int cantHorasDiarias) {
		this.cantHorasDiarias = cantHorasDiarias;
	}



	public boolean isHabil() {
		return habil;
	}



	public void setHabil(boolean habil) {
		this.habil = habil;
	}



	public int getIdTarea() {
		return idTarea;
	}



	@Override
	public String toString() {
		return "\nTarea [idTarea=" + idTarea + ", tarea=" + tarea + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + ", responsable=" + responsable + ", cantHorasDiarias=" + cantHorasDiarias + ", habil="
				+ habil + "]";
	}



	// true significa que en esta tarea el responsable trabaja de Lunes a Viernes. Si esta
	//false significa que trabaja sábado y domingo. (el examen no contempla feriados)
	public double calcularJornal() {
		double jornal;
		if(this.habil) {
			jornal= cantHorasDiarias*responsable.getValorHora();
		} else {
			jornal=cantHorasDiarias*responsable.getValorHora()*1.5;
		}
		
		return jornal;
	}
	/*public int calcularCantDiasTrabajados (int mes, int anio) {
		//??
		
		return 0;
	}*/
	
	

}
