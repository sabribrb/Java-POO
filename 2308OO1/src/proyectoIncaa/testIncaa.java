package proyectoIncaa;

import proyectoIncaa.Genero;
import java.util.ArrayList;
import java.util.List;

import proyectoIncaa.Pelicula;
public class testIncaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// inicializo 1 objeto INcaa = un objeto de la clase que actua como bd
		// new incaa sistema
		Incaa sistema = new Incaa();
		sistema.agregarGenero("Thriller");
		sistema.agregarGenero("Aventura");
		sistema.agregarGenero("Horror");
		sistema.agregarGenero("Drama");
		Genero g1= new Genero(1, "Aventura");
		Genero g2= new Genero(2, "Niños");
		Genero g3= new Genero(4, "Thriller");
		
		
		sistema.agregarPelicula("Jumanji", g1);
		sistema.agregarPelicula("Indiana", g1);
		sistema.agregarPelicula("Bla", g1);
		sistema.agregarPelicula("Knives out", g3);
		sistema.agregarPelicula("Dora", g2);
		sistema.agregarPelicula("Rio", g2);
		sistema.agregarPelicula("Bob Esponja", g2);
		sistema.agregarPelicula("Nemo", g2);
		System.out.println(sistema.toString());
		
		System.out.println(sistema.traerPelicula(g1));
		
		//sistema.eliminarPelicula(2);
		//System.out.println(sistema.toString());
		// pruebo modificarPeli
		// sistema.modificarPelicula(3,"Jumanji 2- La selva");
		// System.out.println(sistema.toString());

		// ---------------------------------------------------
		// en incaa poner lista de generos ACT2
		// ACT2 traerGenero (int id):Genero
	}

}
