package proyectoIncaa;



public class Pelicula {
		private int idPelicula;
		private String pelicula;
		private Genero genero;
		
		public Pelicula(int idPelicula, String pelicula, Genero genero) {
			super();
			this.idPelicula = idPelicula;
			this.pelicula = pelicula;
			this.genero= genero;
		}
		
		
		public int getIdPelicula() {
			return idPelicula;
		}
		
		
		public String getPelicula() {
			return pelicula;
		}
		public void setPelicula(String pelicula) {
			this.pelicula = pelicula;
		}


		public Genero getGenero() {
			return genero;
		}



		@Override
		public String toString() {
			return "Pelicula [idPelicula=" + idPelicula + ", pelicula=" + pelicula + ", genero=" + genero + "]";
		}

		
	



		public boolean equals(Pelicula p) {
			
			return this.idPelicula == p.getIdPelicula() && this.pelicula== p.getPelicula();
		}
		
		
	
	
}