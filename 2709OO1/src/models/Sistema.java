package models;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema {
	private List<Persona> lstPersonas;

	public Sistema() {
		this.lstPersonas = new ArrayList<Persona>();
	}

	public List<Persona> getlstPersonas() {
		return this.lstPersonas;
	}

	// agregar Empleado

	public boolean agregarEmpleado(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo,
			float sueldoMensual) {

		return this.lstPersonas.add(new Empleado(nombre, apellido, dni, fechaNacimiento, legajo, sueldoMensual));
	}

	// agregar Cliente

	public boolean agregarCliente(String nombre, String apellido, long dni, LocalDate fechaNacimiento, String cuit,
			float limiteCredito) {
		return this.lstPersonas.add(new Cliente(nombre, apellido, dni, fechaNacimiento, cuit, limiteCredito));
	}
	// mostrar

	public Empleado traerEmpleado(int legajo) {
		int i=0;
		Empleado e= null;
		Empleado aux=null;
		while (i< this.lstPersonas.size() && e == null) {
			if(this.lstPersonas.get(i) instanceof Empleado) {
				aux= (Empleado)this.lstPersonas.get(i);
				if(aux.getLegajo()==legajo) {
					e=aux;
				}
			}
			
				i++;
		}
		return e;
	}
	
	public Cliente traerCliente(String cuit) {
		int i=0;
		Cliente c= null;
		Cliente aux=null;
		while (i< this.lstPersonas.size() && c == null) {
			if(this.lstPersonas.get(i) instanceof Cliente) {
				aux= (Cliente)this.lstPersonas.get(i);
				if(aux.getCuit().equalsIgnoreCase(cuit)) {
					c=aux;
				}
			}
			
				i++;
		}
		return c;
	}
	@Override
	public String toString() {
		return "Sistema [lstPersonas=" + lstPersonas + "]";
	}

}
