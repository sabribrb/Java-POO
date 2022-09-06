package ejerciciosBasicos;
import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.println("Medida en MILIMETROS");
		float milimetros = s.nextFloat();
		System.out.println("Medida en CENTIMETROS");
		float centimetros = s.nextFloat();
		System.out.println("Medida en METROS");
		float metros = s.nextFloat();
		
		float total = milimetros / 10 + centimetros + metros * 100;

		System.out.println("Total calculado en cm: " + total);
	}

}
