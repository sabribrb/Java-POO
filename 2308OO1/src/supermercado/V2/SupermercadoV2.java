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

	public boolean agregarProducto(String producto, float precio) throws Exception {
		
		//excepcion si ya existe el producto
		if (traerProducto(producto)!=null ) throw new Exception("Error: el producto ya existe en el supermercado");
		
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
	
	public Producto traerProducto(String producto) {
		Producto p = null;
		int i = 0;
		while (i < gondola.size() && p == null) {
			if (gondola.get(i).getProducto().contains(producto)) {
				p = gondola.get(i);
			}
			i++;
		}
		return p;
	}

	public boolean modificarProducto(int idProducto, String producto, float precio) throws Exception {
		Producto p = this.traerProducto(idProducto);
		if (p==null) throw new Exception("Error: el objeto a modificar no existe");
		p.setProducto(producto);
		p.setPrecio(precio);
		return true;
	}

	public boolean eliminarProducto(int idProducto) throws Exception {
		// si no existe el objeto o existe en algún carrito levantar la excepción
		
		Producto p = this.traerProducto(idProducto);
		if (p==null) throw new Exception("Error: el objeto a eliminar no existe");
		return gondola.remove(p);
	}

	public boolean agregarCliente(String cliente, long dni, String direccion) throws Exception {
		if(traerCliente(cliente)!=null) throw new Exception("Error: el Cliente ya existe en la BD");
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
	
	public Cliente traerCliente(String cliente) {
		int i=0;
		Cliente traer=null;
		while(i<this.lstCliente.size() && traer==null) {
			if(lstCliente.get(i).getCliente().contains(cliente)) {
				traer=this.lstCliente.get(i);
			}
			i++;
		}
		return traer;
	}
	public boolean eliminarCliente(int idCliente) throws Exception {
		Cliente aux= this.traerCliente(idCliente);
		//si el cliente tiene un carrito a su nombre, deberia levantar excepcion
		if(aux==null) throw new Exception("Error: el cliente a eliminar no existe");
		return this.lstCliente.remove(aux);
	}
	
	public boolean agregarCarrito(LocalDate fecha, LocalTime hora,  Cliente cliente) throws Exception {
		if(traerCarrito(cliente)!=null) throw new Exception("Error: el Cliente ya tiene un carrito");
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
	
	public CarritoV2 traerCarrito(Cliente cliente){
		int i=0;
		CarritoV2 c= null;
		while(i<this.lstCarrito.size() && c==null) {
			if(this.lstCarrito.get(i).getCliente().equals(cliente)) {
				c= this.lstCarrito.get(i);
			}
			i++;
		}
		return c;
	}
	public boolean eliminarCarrito(int idCarrito) throws Exception {
		CarritoV2 aux= traerCarrito(idCarrito);
		if(aux==null) throw new Exception("Error: el carrito a eliminar no existe");
		return this.lstCarrito.remove(aux);
	}
	

	
}
