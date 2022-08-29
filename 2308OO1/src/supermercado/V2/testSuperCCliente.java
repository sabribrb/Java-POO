package supermercado.V2;

import java.time.LocalDate;
import java.time.LocalTime;

import supermercado.Supermercado;

public class testSuperCCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//agregarCliente(String cliente, long dni, String direccion): boolean
		//traerCliente(int idCliente): Cliente
		//eliminarCliente(int idCliente): boolean
		SupermercadoV2 sist= new SupermercadoV2();
		sist.agregarProducto("tomate", 100);
		sist.agregarProducto("lechuga", 1020);
		sist.agregarProducto("hamburguesa", 405);
		sist.agregarCliente("Sabrina", 44725980, "Lanus");
		sist.agregarCliente("Jose", 87282022, "Lanus");
		sist.agregarCliente("Carolina", 25842557, "Monte Grande");
		sist.agregarCliente("Tomas", 44725980, "Capital Federal");
		sist.eliminarCliente(2);
		System.out.print(sist.toString());
		
		
		//agregarCarrito(LocalDate fecha, LocalTime hora, cliente Cliente): boolean
		//traerCarrito(int idCarrito): Carrito
		//eliminarCarrito(int idCarrito): boolean
		
		sist.agregarCarrito(LocalDate.now(), LocalTime.now(), sist.traerCliente(1));
		sist.agregarCarrito(LocalDate.now(), LocalTime.now(), sist.traerCliente(3));
		sist.agregarCarrito(LocalDate.now(), LocalTime.now(), sist.traerCliente(4));
		sist.eliminarCarrito(2);
		System.out.print(sist.toString());
		//calcular total hay varios. uno pide que calcules del cliente, otro del dia
	}

}
