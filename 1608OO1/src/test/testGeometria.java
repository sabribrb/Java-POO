package test;

import geometria.Circulo;
import geometria.Punto;

public class testGeometria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Punto punto1 = new Punto(1, 2);
		Punto punto2 = new Punto(5, 4);
		
		System.out.println("Dist entre puntoos: " + punto1.calcularDistancia(punto2));
		
		//testeo equals punto
		System.out.print(punto1.equals(punto2));
		
		Circulo circ1 = new Circulo(punto1, 4);
		Circulo circ2 = new Circulo(punto2, 2);
		
		System.out.println("\nDistancia entre Circulos;: " + circ1.calcularDistancia(circ2));
		
		//testeo setRadio
		System.out.println(circ1.toString());
		Punto punto3 = new Punto(1, 8);
		circ1.setRadio(punto3);
		System.out.println(circ1.toString()); 
		
		//testeo equals circulo
		System.out.print(circ1.equals(circ2)); 
		//calcular area
		System.out.println(circ1.calcularArea());
	}

	
	

}
