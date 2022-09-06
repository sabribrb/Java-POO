package ejercicios3;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Ingrese la cant de veces que desa la palabra eco:");
		int cant= s.nextInt();
		
		for(int i=0; i<cant; i++) {
			System.out.println("Eco");
		}
	}

}
