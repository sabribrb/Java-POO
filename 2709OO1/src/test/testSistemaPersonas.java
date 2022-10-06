package test;

import java.time.LocalDate;

import models.*;

public class testSistemaPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema s= new Sistema();
		s.agregarCliente("pablo", "Bla", 448788, LocalDate.of(2000, 5, 12), "A4444777", 4);
		s.agregarEmpleado("sabrina", "qsyo", 87955, LocalDate.of(1999, 5, 12), 125555, 450000);
		s.agregarEmpleado("carolina", "qsyo", 789522, LocalDate.of(2002, 5, 12), 87889, 450000);
		System.out.println(s.getlstPersonas().toString());
		System.out.println(s.traerEmpleado(125555));
	}

}
