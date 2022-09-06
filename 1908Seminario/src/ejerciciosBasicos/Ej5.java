package ejerciciosBasicos;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in); 
		System.out.println("\nIngrese coeficiente a\n");
		float a= s.nextFloat();
		System.out.println("\nIngrese coeficiente b\n");
		float b= s.nextFloat();
		System.out.println("\nIngrese coeficiente c\n");
		float c= s.nextFloat();
		System.out.println("\nAhora ingrese el valor de x \n");
		float x= s.nextFloat();
		
		System.out.println("\nEl polinomio tiene como valor en el eje Y: "
		+ (a*x*x+b*x+c));
	}

}
