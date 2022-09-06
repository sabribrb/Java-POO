package ejerciciosBasicos;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in); 
		int num= s.nextInt();
		int resto=0;
		/*
		while(num%7!=0) {
			num++;
			resto++;
		}
		System.out.println("\n El numero que ingresaste es "
		+ (num-resto)+ " y hay que sumarle "+resto
		+ " para que sea multiplo de 7\n");*/
	
	////////////////////////////////
	//Ej3
	//leve modificacion 
	System.out.println("\nIngrese el numero al que quiere averiguar divisibilidad \n");
		int divisor= s.nextInt();
	while(num%divisor!=0) {
		num++;
		resto++;
		}
	System.out.println("\n El numero que ingresaste es "
	+ (num-resto)+ " y hay que sumarle "+resto
	+ " para que sea multiplo de "+ divisor);

 }
}