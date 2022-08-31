package funciones;

import java.time.LocalDate;
import java.time.LocalTime;

public class Funciones {
	// no posee atributos
	// pero sí metodos estaticos
	public static boolean esBisiesto(int anio) {
		return (anio % 4 == 0) && (anio % 100 != 0 || anio % 400 == 0);
	}

	public static boolean esFechaValida(LocalDate fecha) {
		// la validacion ya es propia de la libreria localDate
		return esBisiesto(fecha.getYear());
	}

	public static String traerFechaCorta(LocalDate fecha) {
		return fecha.getDayOfMonth() + "/" + fecha.getMonth().getValue() + "/" + fecha.getYear();
	}

	public static String traerHoraCorta(LocalTime hora) {
		return hora.getHour() + ":" + hora.getMinute();
	}

	public static boolean esDiaHabil(LocalDate fecha) {
		return fecha.getDayOfWeek().getValue() < 6;
	}

	public static String traerDiaDeLaSemana(LocalDate fecha) {
		return fecha.getDayOfWeek().toString();
	}

	public static String traerMesEnLetras(LocalDate fecha) {
		return fecha.getMonth().toString();
	}

	public static String traerFechaLarga(LocalDate fecha) {
		return traerDiaDeLaSemana(fecha) + " " + fecha.getDayOfMonth() + " de " + traerMesEnLetras(fecha) + " del "
				+ fecha.getYear();
	}

	public static int traerCantDiasDeUnMes(int anio, int mes) {
		int c = 0;
		if (mes < 12 && mes > 0) {
			if (mes == 2) {
				c = 28;
				if (esBisiesto(anio)) {
					c++;
				}
			} else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				c = 31;
			} else {
				c = 30;
			}
		} else {
			c = -1;
		}

		return c;
	}

	public static boolean esNumero(char c) {
		return Character.isDigit(c);
	}

	public static boolean esLetra(char c) {
		return Character.isAlphabetic(c);
	}

	public static boolean esCadenaNros(String cadena) {
		boolean e = true;
		int i = 0;
		while (e == true && i < cadena.length()) {
			e = esNumero(cadena.charAt(i));
			i++;
		}
		return e;
	}

	public static boolean esCadenaLetras(String cadena) {
		boolean e = true;
		int i = 0;
		while (e == true && i < cadena.length()) {
			e = esLetra(cadena.charAt(i));
			i++;
		}
		return e;
	}

	public static double aproximar2Decimal(double valor) {
		return Math.round(valor*100.0)/100.0;
	}
}
