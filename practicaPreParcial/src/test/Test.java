package test;

import java.time.LocalDate;

import sistGestion.Sistema;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema s = new Sistema();
		try {
			s.agregarEmpleado("Melo", "Tomas", "3724", 430.0);
			s.agregarEmpleado("Navarro", "Mónica", "3125", 410.0);

			s.traerEmpleado("3125");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			s.agregarTarea("Reparación Catelli altura 1700-1800", LocalDate.of(2021, 5, 13), LocalDate.of(2021, 6, 21),
					s.traerEmpleado("3724"), 6, true);
			s.agregarTarea("Reparación semaforo peatonal Alsina y Boedo", LocalDate.of(2021, 6, 17),
					LocalDate.of(2021, 7, 25), s.traerEmpleado("3125"), 6, false);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("5) "+ s.traerTarea(1).calcularJornal());
			System.out.println(s.traerTarea(2).calcularJornal());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	
	
	}

}
