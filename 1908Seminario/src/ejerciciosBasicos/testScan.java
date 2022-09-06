package ejerciciosBasicos;
import java.util.Scanner;
public class testScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in); //un solo elemento scanner
		int n1= s.nextInt(); //los next piden un valor y
							 //lo guardan como variable que corresponda al tipo
		System.out.print(n1 +"\n");
		final String MAIL= "@outlook.com";
		String nombre= s.next();
		System.out.println(nombre + MAIL);
	}

}
