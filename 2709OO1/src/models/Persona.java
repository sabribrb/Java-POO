package models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Persona {
	protected String nombre;
	protected String apellido;
	protected long dni;
	protected LocalDate fechaNacimiento;

	public Persona(String nombre, String apellido, long dni, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
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

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int calcularEdad() {
		return (int)ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());/// ??
	}

	public abstract String hablar();

	@Override
	public String toString() {
		return " [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", fechaNacimiento="
				+ fechaNacimiento + "] ";
	}
	
	
}
