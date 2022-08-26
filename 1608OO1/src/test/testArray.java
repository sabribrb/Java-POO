package test;

import arreglo.ArrayUnidimensional;

public class testArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector1= {1,2,2, 3,8,2,25};
		ArrayUnidimensional array1= new ArrayUnidimensional(vector1);
		System.out.println(array1.toString());
		//observar que java tiene una superclase con un tostring para arrays
		System.out.print(array1.traerElMenor()+ "\n");
		System.out.print(array1.traerFrecuecia(2));
		
	}

}
