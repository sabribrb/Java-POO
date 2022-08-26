package supermercado;

public class testSupermercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supermercado sup= new Supermercado();
		sup.agregarProducto("Tomate", 4);
		sup.agregarProducto("Acelga", 8);
		sup.agregarProducto("Arroz", 107);
		System.out.println(sup.toString());
		//System.out.println(sup.traerProducto(2));
		//sup.eliminarProducto(2);
		//System.out.println(sup.toString());
		//-----
		Carrito cart= new Carrito(0, null, null);
		
		cart.agregarItem(sup.getGondola().get(0), 3);
		cart.agregarItem(sup.getGondola().get(0), 1);
		cart.agregarItem(sup.getGondola().get(1), 4);
		cart.agregarItem(sup.getGondola().get(2), 1);
		System.out.println(cart.toString());
		cart.eliminarItem(sup.getGondola().get(0), 4);
		System.out.println(cart.toString());
		
		//continuar con siguiente diagrama agregando cliente
	}

}
