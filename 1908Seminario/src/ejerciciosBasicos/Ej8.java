package ejerciciosBasicos;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Buenos días, comencemos a contabilizar\n");
		System.out.println("Ingrese la cantidad de hormigas capturadas\n");
		int h= s.nextInt() *6;
		System.out.println("Ingrese la cantidad de aranas capturadas\n");
		int a= s.nextInt() *8;
		System.out.println("Ingrese la cantidad de cochinillas capturadas\n");
		int c= s.nextInt() *14;
		System.out.println("La catidad de patas capturadas fue un "
				+ "total de: " + (h+a+c));
	}

}
