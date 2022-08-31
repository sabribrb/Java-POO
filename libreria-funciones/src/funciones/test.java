package funciones;
import funciones.Funciones;

import java.time.LocalDate;
import java.time.LocalTime;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate f=  LocalDate.of(2022, 8, 28);
		System.out.println(Funciones.traerHoraCorta(LocalTime.of(15, 40)));
		System.out.println(Funciones.traerFechaCorta(f));
		System.out.println(Funciones.traerFechaLarga(f));
		System.out.println(Funciones.traerCantDiasDeUnMes(2004, 2));
		
		System.out.println(Funciones.esCadenaLetras("akusgdkkk"));
		System.out.println(Funciones.aproximar2Decimal(20.206));
		
		
	}
	

}
