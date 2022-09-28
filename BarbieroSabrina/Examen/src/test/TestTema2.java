package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.SistemaSaludDispositivos;

public class TestTema2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SistemaSaludDispositivos sist = new SistemaSaludDispositivos();
		System.out.println("1)");
		sist.agregarEmpresa("Empresa 1");
		sist.agregarEmpresa("Empresa 2");
		System.out.println(sist.getLstEmpresas());

		System.out.println("\n2)");
		System.out.println("Empresa encontrada: " + sist.traerEmpresa("Empresa 1"));

		System.out.println("\n3)");
		try {
			sist.agregarDispositivo("Sensor Calor", "A2020", sist.traerEmpresa("Empresa 1"));
			sist.agregarDispositivo("Sensor Presión", "A2325", sist.traerEmpresa("Empresa 1"));
			sist.agregarDispositivo("Sensor Temperatura", "B2021", sist.traerEmpresa("Empresa 2"));
			sist.agregarDispositivo("Sensor Humedad", "B2326", sist.traerEmpresa("Empresa 2"));
			System.out.println(sist.getLstDispositivos());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("\n4)");
		try {
			sist.agregarDispositivo("Sensor Movimiento", "B2022", sist.traerEmpresa("Empresa 1"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n5)");
		System.out.println("Dispositivo encontrado: " + sist.traerDispositivo("A2020"));
		
		System.out.println("\n6)");
		sist.traerDispositivo("A2020").agregarMetrica(18, LocalDate.of(2022, 9, 18), LocalTime.of(10, 0));
		sist.traerDispositivo("A2020").agregarMetrica(19, LocalDate.of(2022, 9, 19), LocalTime.of(12, 30));
		sist.traerDispositivo("A2020").agregarMetrica(23, LocalDate.of(2022, 9, 20), LocalTime.of(15, 0));
		sist.traerDispositivo("A2020").agregarMetrica(20, LocalDate.of(2022, 9, 21), LocalTime.of(18, 30));
		sist.traerDispositivo("A2020").agregarMetrica(18, LocalDate.of(2022, 9, 22), LocalTime.of(22, 30));
		System.out.println(sist.traerDispositivo("A2020"));
		
		System.out.println("\n7)");
		System.out.println("Metrica encontrada: " + sist.traerDispositivo("A2020").traerMetrica(LocalDate.of(2022, 9, 19), LocalTime.of(12, 30)));
	
		System.out.println("\n8)");
		System.out.println(sist.traerDispositivo("A2020").traerMetricas(LocalDate.of(2022, 9, 19), LocalDate.of(2022, 9, 21)));
		
		System.out.println("\n9)");
		System.out.println(sist.traerDispositivo("A2020").traerMetricas(LocalDate.of(2022, 9, 19), LocalDate.of(2022, 9, 21), 22));

	
	}

}
