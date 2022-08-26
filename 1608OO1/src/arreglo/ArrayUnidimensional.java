package arreglo;

import java.util.Arrays;

public class ArrayUnidimensional {
	private int[] vector;

	public ArrayUnidimensional(int[] vector) {
		super();
		this.vector = vector;
	}

	public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	}

	@Override
	public String toString() {
		return "ArrayUnidimensional [vector=" + Arrays.toString(vector) + "]";
	} //java ya tiene un metodo para mostrar correctamente un vector
	
	public int traerElMenor() {
		int x=this.getVector()[0];
		for(int i=1; i<this.vector.length; i++) {
			if(x> this.getVector()[i]) {
				x=this.vector[i];
			}
		}
		return x;
	}
	public int traerFrecuecia(int num) {
		int cantidad=0;
		for (int i=0; i<this.getVector().length; i++) {
			if(this.getVector()[i]==num) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
}
