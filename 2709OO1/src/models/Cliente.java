package models;

import java.time.LocalDate;

public class Cliente extends Persona{
	private String cuit;
	private float limiteCredito;
	public Cliente(String nombre, String apellido, long dni, LocalDate fechaNacimiento, String cuit,
			float limiteCredito) {
		super(nombre, apellido, dni, fechaNacimiento);
		this.cuit = cuit;
		this.limiteCredito = limiteCredito;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public float getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(float limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	public String hablar() {
		return "Soy un cliente";
	}
	@Override
	public String toString() {
		return "\nCliente"  + super.toString()+ "[cuit=" + cuit + ", limiteCredito=" + limiteCredito + "]\n";
	}
	
	
}
