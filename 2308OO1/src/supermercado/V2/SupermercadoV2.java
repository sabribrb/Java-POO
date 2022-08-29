package supermercado.V2;

import supermercado.Producto;
import supermercado.V2.CarritoV2;
import supermercado.V2.Cliente;

import java.time.*;
import java.util.List;
import java.util.ArrayList;

public class SupermercadoV2 {
	private List<Producto> gondola;
	private List<Cliente> lstCliente;
	private List<CarritoV2> lstCarrito;

	public SupermercadoV2() {
		super();
		this.gondola = new ArrayList<Producto>();
		this.lstCliente = new ArrayList<Cliente>();
		this.lstCarrito = new ArrayList<CarritoV2>();
	}

	public List<Producto> getGondola() {
		return gondola;
	}

	public List<Cliente> getLstCliente() {
		return lstCliente;
	}

	public List<CarritoV2> getLstCarrito() {
		return lstCarrito;
	}

	@Override
	public String toString() {
		return "SupermercadoV2 [gondola=" + gondola + ",\n lstCliente=" + lstCliente + "\n, lstCarrito=" + lstCarrito + "]";
	}

	public boolean agregarProducto(String producto, float precio) {
		int i =1;
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
		// si no existe el objeto o existe en algún carrito levantar la excepción
		Producto p = this.traerProducto(idProducto);
		return gondola.remove(p);
	}

	public boolean agregarCliente(String cliente, long dni, String direccion) {
		int i = 1;
		if (this.lstCliente.size() > 0) {
			i = lstCliente.get(lstCliente.size() - 1).getIdCliente() + 1;
		}
		Cliente aux= new Cliente(i, cliente, dni, direccion);
		return this.lstCliente.add(aux);
	}
	
	public Cliente traerCliente(int idCliente) {
		int i=0;
		Cliente traer=null;
		while(i<this.lstCliente.size() && traer==null) {
			if(lstCliente.get(i).getIdCliente()== idCliente) {
				traer=this.lstCliente.get(i);
			}
			i++;
		}
		return traer;
	}
	public boolean eliminarCliente(int idCliente) {
		Cliente aux= this.traerCliente(idCliente);
		//si el cliente no existe, traerá null, ddeberia levantar excepcion
		return this.lstCliente.remove(aux);
	}
	
	public boolean agregarCarrito(LocalDate fecha, LocalTime hora,  Cliente cliente) {
		//si el carrito existe, levantar excepcion
		int i = 1;
		if (this.lstCarrito.size() > 0) {
			i = lstCarrito.get(lstCarrito.size() - 1).getIdCarrito()  + 1;
		}
		CarritoV2 c= new CarritoV2(i, fecha, hora, cliente);
		return lstCarrito.add(c);
	}
	
	public CarritoV2 traerCarrito(int idCarrito){
		int i=0;
		CarritoV2 c= null;
		while(i<this.lstCarrito.size() && c==null) {
			if(this.lstCarrito.get(i).getIdCarrito()== idCarrito) {
				c= this.lstCarrito.get(i);
			}
			i++;
		}
		return c;
	}
	public boolean eliminarCarrito(int idCarrito) {
		CarritoV2 aux= traerCarrito(idCarrito);
		return this.lstCarrito.remove(aux);
	}
	
	
}
