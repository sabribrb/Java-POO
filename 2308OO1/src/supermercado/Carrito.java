package supermercado;
import supermercado.ItemCarrito;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;
import supermercado.ItemCarrito;

public class Carrito {
	private int idCarrito;
	private LocalDate fecha;
	private LocalTime hora;
	private List<ItemCarrito> listaItem;
	public Carrito(int idCarrito, LocalDate fecha, LocalTime hora) {
		super();
		this.idCarrito = idCarrito;
		this.fecha = fecha;
		this.hora = hora;
		this.listaItem = new ArrayList<ItemCarrito>();
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
	@Override
	public String toString() {
		return "Carrito [idCarrito=" + idCarrito + ", fecha=" + fecha + ", hora=" + hora + ", \nlistaItem=" + listaItem
				+ "]";
	}
	public boolean agregarItem(Producto producto, int cantidad) {
		//si producto ya esta en la lista solo aumentar cantidad de producto
		//por defecto cantidad=1
		int i=0;
		int encontradoPos=-1;
		
		while( i< listaItem.size() && encontradoPos==-1) {
			if(listaItem.get(i).getProducto()== producto) {
				encontradoPos=i;
			}
			i++;
		}
		int proxId= 0;
		if(listaItem.size()>0) {
			proxId=listaItem.get(listaItem.size()-1).getIdItem() +1;
		}
		ItemCarrito aux= new ItemCarrito(proxId, producto, cantidad);
		
		if(encontradoPos!=-1) {
			//si el producto existe, solo sumar cantidad
			i=listaItem.get(encontradoPos).getCantidad();
			listaItem.get(encontradoPos).setCantidad(i+ cantidad);
		} else {
			//si el producto-item es nuevo, lo agregamos
			listaItem.add(aux);
		}
				
		return true;
	}
	
	public boolean eliminarItem (Producto producto, int cantidad) {
		//si la cant es la total, se elimina todo el producto, sino solo se resta
		//si el rpoducto no existe lanzar excepcion
		int i=0;
		int cantPrevia= 0;
		ItemCarrito it= null;
		
		while(i<this.listaItem.size() && it==null) {
			if(listaItem.get(i).getProducto().equals(producto)) {
				it= listaItem.get(i);
				cantPrevia= it.getCantidad();
				it.setCantidad(cantPrevia -cantidad);
				//siempre que cantPrevia>=cantidadrestada
			}
			i++;
		}
		if((cantPrevia-cantidad)==0) {
			
			listaItem.remove(it);
		}
		return true;
		
	}
	
	public float calcularTotal() {
		float total=0;
		for(ItemCarrito i: listaItem) {
			total+=  i.calcularSubtotal();
		}
		return total ;
	}
	
}
