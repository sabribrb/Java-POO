package proyectoIncaa;

import java.util.Objects;

public class Genero {
	private int idGenero;
	private String genero;

	public Genero(int idGenero, String genero) {
		super();
		this.idGenero = idGenero;
		this.genero = genero;
	}

	public int getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Genero [idGenero=" + idGenero + ", genero=" + genero + "]";
	}

	

	public boolean equals(Genero gen) {
		
		return this.genero == gen.genero;
	}
	

}
