package proyectoIncaa;

import java.util.ArrayList;
import java.util.List;
import proyectoIncaa.Pelicula;
import proyectoIncaa.Genero;

public class Incaa {
	private List<Pelicula> catalogo;
	private List<Genero> listaGeneros;

	public Incaa() {
		super();
		this.catalogo = new ArrayList<Pelicula>();
		this.listaGeneros = new ArrayList<Genero>();
	}

	public List<Pelicula> getCatalogo() {
		return catalogo;
	}
	
	public List<Genero> getListaGeneros() {
		return listaGeneros;
	}

	

	@Override
	public String toString() {
		return "Incaa [catalogo=" + catalogo + ",\n listaGeneros=" + listaGeneros + "]";
	}

	public boolean agregarPelicula(String pelicula,Genero genero) {
		int i;
		if (catalogo.size() == 0) {
			i = 1;
		} else {
			i = (this.catalogo.get(catalogo.size() - 1).getIdPelicula()) + 1;
		}
		
		
		Pelicula p = new Pelicula(i, pelicula, genero);
		

		return catalogo.add(p);
	}

	public Pelicula traerPelicula(int idPelicula) {
		int i = 0;
		Pelicula p = null;

		while (i < catalogo.size() && p == null) {
			if (catalogo.get(i).getIdPelicula() == idPelicula) {
				p = catalogo.get(i);
			}
			i++;
		}

		return p;

	}

	public List<Pelicula> traerPelicula(String partePelicula) {
		List<Pelicula> contiene = new ArrayList<Pelicula>();
		for (Pelicula p : catalogo) {
			if (p.getPelicula().contains(partePelicula) == true) {
				contiene.add(p);
			}
		}
		return contiene;
	}

	public void modificarPelicula(int idPelicula, String pelicula) {

		// Modificar la película traerPelicula por id, si no existe la película lanzar
		// la excepción, de lo
		// contrario setPelicula con el parámetro pelicula .
		Pelicula aux = this.traerPelicula(idPelicula);
		if (aux != null) {
			aux.setPelicula(pelicula);
		} else {
			// excepcion
			System.out.println("\nLa pelicula buscada no existe\n");
		}

	}

	public boolean eliminarPelicula(int idPelicula) {
		Pelicula aux = this.traerPelicula(idPelicula);
		return catalogo.remove(aux);

	}
	
	
	
	public boolean agregarGenero(String genero) {
		int i;
		if (listaGeneros.size() == 0) {
			i = 1;
		} else {
			i = (this.listaGeneros.get(listaGeneros.size() - 1).getIdGenero()) + 1;
		}
		Genero g= new Genero(i, genero);
		return listaGeneros.add(g);
	}
	
	public List<Pelicula> traerPelicula(Genero genero) {
		List<Pelicula> contiene = new ArrayList<Pelicula>();
		for (Pelicula p : catalogo) {
			if(p.getGenero()== genero) {
				contiene.add(p);
			}
		}
		return contiene;
	}

	// modificar pelicula reutiliza setTitulo porque el id no se modifica
	
	// getCCat retorna LIsta
	// no existe setter de una lista ni tampoco el constructor recibe lkista por
	// parametro
}
