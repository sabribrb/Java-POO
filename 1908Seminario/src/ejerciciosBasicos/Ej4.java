package ejerciciosBasicos;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 4
		Scanner s= new Scanner(System.in); 
		System.out.println("Por favor ingrese base del triangulo\n");
		int base= s.nextInt();
		System.out.println("\nAhora ingrese altura del triangulo\n");
		int altura= s.nextInt();
		System.out.print((base*altura)/2);
		
		
	}

}
