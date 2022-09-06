package ejercicios3;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("ingrese un num de 3 cifras");
		int n= s.nextInt();
		
		 String numString = String.valueOf(n); 
	 //ahora el numero lo pase a una cadena de caracteres
	
		 
	 //a esa cadena la paso a un array de char, cada char vale lo q vale cada digito 
	      char[] digitos = numString.toCharArray();

	        for(int i = 0; i < digitos.length; i++) {
	            System.out.println(digitos[i]);
	        }
		
		s.close();
	}
	}


