package supermercado;

import supermercado.Producto;
import java.util.List;
import java.util.ArrayList;

public class Supermercado {
	private List<Producto> gondola;

	public Supermercado() {
		super();
		this.gondola = new ArrayList<Producto>();
	}

	public List<Producto> getGondola() {
		return gondola;
	}

	@Override
	public String toString() {
		return "Supermercado [gondola=" + gondola + "]";
	}

	public boolean agregarProducto(String producto, float precio) {
		int i = 0;
		if (this.gondola.size() > 0) {
			i = gondola.get(gondola.size() - 1).getIdProducto() + 1;
		}
		Producto p = new Producto(i, producto, precio);
		return gondola.add(p);
	}

	public Producto traerProducto(int idProducto) {
		Producto p = null;
		int i = 0;
		while (i < gondola.size() && p == null) {
			if (gondola.get(i).getIdProducto() == idProducto) {
				p = gondola.get(i);
			}
			i++;
		}
		return p;
	}

	public boolean modificarProducto(int idProducto, String producto, float precio) {
		Producto p = this.traerProducto(idProducto);
		// if p==null levantar excepcion
		p.setProducto(producto);
		p.setPrecio(precio);
		return true;
	}

	public boolean eliminarProducto(int idProducto) {
		//si no existe el objeto o existe en algún carrito levantar la excepción
		Producto p = this.traerProducto(idProducto);
		return gondola.remove(p);
	}

}
