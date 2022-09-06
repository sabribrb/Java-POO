package ejerciciosBasicos;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Por favor ingrese la base imponible\n");
		float base = s.nextFloat();
		System.out.println("Ahora ingrese el IVA a aplicar (en %)\n");
		float iva = s.nextFloat();
		float total = base+((base*iva)/100);
		float importeIva=(((base*iva)/100));
		
		System.out.println("Importe correspondiente a IVA: " + importeIva);
		System.out.println("Total: " + total);
		
		
		
		
	}

}