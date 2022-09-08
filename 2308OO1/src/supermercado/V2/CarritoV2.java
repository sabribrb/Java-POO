package supermercado.V2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;
import supermercado.ItemCarrito;
import supermercado.Producto;
import supermercado.V2.Cliente;

public class CarritoV2 {
	private int idCarrito;
	private LocalDate fecha;
	private LocalTime hora;
	private List<ItemCarrito> listaItem;
	private Cliente cliente;

	public CarritoV2(int idCarrito, LocalDate fecha, LocalTime hora, Cliente cliente) {

		this.idCarrito = idCarrito;
		this.fecha = fecha;
		this.hora = hora;
		this.listaItem = new ArrayList<ItemCarrito>();
		this.cliente = cliente;
	}

	public int getIdCarrito() {
		return idCarrito;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public List<ItemCarrito> getListaItem() {
		return listaItem;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "CarritoV2 [idCarrito=" + idCarrito + ", fecha=" + fecha + ", hora=" + hora + ", listaItem=" + listaItem
				+ ", cliente=" + cliente + "]";
	}

	public boolean agregarItem(Producto producto, int cantidad) {
		// si producto ya esta en la lista solo aumentar cantidad de producto
		// por defecto cantidad=1
		ItemCarrito it = traerItem(producto);
		boolean x = false;

		if (it != null) {
			// si el producto existe, solo sumar cantidad
			it.setCantidad(it.getCantidad() + cantidad);
			x = true;
		} else {
			// si el producto-item es nuevo, lo agregamos
			int proxId = 0;
			if (listaItem.size() > 0) {
				proxId = listaItem.get(listaItem.size() - 1).getIdItem() + 1;
			}
			it = new ItemCarrito(proxId, producto, cantidad);
			listaItem.add(it);
			x = true;
		}

		return x;
	}

	public boolean eliminarItem(Producto producto, int cantidad) throws Exception {
		// si la cant es la total, se elimina todo el producto, sino solo se resta
		// si el rpoducto no existe lanzar excepcion
		boolean x = false;
		ItemCarrito it = traerItem(producto);
		if (it == null)
			throw new Exception("Error: el item a eliminar no existe");
		else {
			it.setCantidad(it.getCantidad() - cantidad);
			x=true;
		}

		if (it.getCantidad() == 0) {

			listaItem.remove(it);
		}
		return x;

	}

	public ItemCarrito traerItem(Producto producto) {
		int i = 0;
		ItemCarrito aux = null;

		while (i < listaItem.size() && aux == null) {
			if (listaItem.get(i).getProducto().equals(producto)) {
				aux = listaItem.get(i);
			}
			i++;
		}
		return aux;
	}

	public float calcularTotal() {
		float total = 0;
		for (ItemCarrito i : listaItem) {
			total += i.calcularSubtotal();
		}
		return total;
	}

}
