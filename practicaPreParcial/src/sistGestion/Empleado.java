package sistGestion;

public class Empleado {
	private String nombre;
	private String apellido;
	private String nroLegajo;
	private double valorHora;
	
	
	public Empleado(String nombre, String apellido, String nroLegajo, double valorHora) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroLegajo = nroLegajo;
		this.valorHora = valorHora;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNroLegajo() {
		return nroLegajo;
	}
	public void setNroLegajo(String nroLegajo) {
		this.nroLegajo = nroLegajo;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", nroLegajo=" + nroLegajo + ", valorHora="
				+ valorHora + "]";
	}
	
	
	
}
