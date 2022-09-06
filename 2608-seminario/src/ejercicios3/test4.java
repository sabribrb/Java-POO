package ejercicios3;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Ingrese el numero del cuual desea saber aproximada raiz");
		int num= s.nextInt();
		int i=0;
		int x=0;
		while((i+1)*(i+1)<=num) {
			
			i++;
			x= i*i;
		}
		System.out.println("La raiz cuadrada mas cercana es "+ i + " y el resto es "
		+ (num-x));
		
	}

}
