package modelo;

import java.util.ArrayList;
import java.util.List;

public class SistemaSaludDispositivos {
	private List<Dispositivo> lstDispositivos;
	private List<Empresa> lstEmpresas;
	public SistemaSaludDispositivos() {
		this.lstDispositivos= new ArrayList<Dispositivo>();
		this.lstEmpresas= new ArrayList<Empresa>();
	}
	
	public boolean agregarEmpresa(String nombre) {
		int id= 1;
		if(!this.lstEmpresas.isEmpty()) {
			id= lstEmpresas.get(lstEmpresas.size()-1).getId() +1;
			//calculamos el id para el objeto a agregar considerando el ultimo id agregado
		}
		Empresa e= new Empresa(id, nombre);
		return lstEmpresas.add(e);
		
	}
	
	public Empresa traerEmpresa(String nombre) {
		int i=0;
		Empresa e= null;
		while(i<this.lstEmpresas.size() && e==null) {
			if(this.lstEmpresas.get(i).getNombre().equalsIgnoreCase(nombre)) {
				e=this.lstEmpresas.get(i);
			}
			i++;
		}
		return e;
	}
	
	public boolean agregarDispositivo(String nombre, String codigo, Empresa empresa) throws Exception {
		
		int id= 1;
		if(!this.lstDispositivos.isEmpty()) {
			id= lstDispositivos.get(lstDispositivos.size()-1).getId() +1;
			//calculamos el id para el objeto a agregar considerando el ultimo id agregado
		}
		Dispositivo d= new Dispositivo(id, nombre, codigo, empresa);
		//la excepcion se encuentra dentro del setCodigo, en la clase Dispositivo
		return lstDispositivos.add(d);
	}
	
	public Dispositivo traerDispositivo(String codigo) {
		int i=0;
		Dispositivo d= null;
		while(i<this.lstDispositivos.size() && d==null) {
			if(this.lstDispositivos.get(i).getCodigo().equalsIgnoreCase(codigo)) {
				d=this.lstDispositivos.get(i);
			}
			i++;
		}
		return d;
	}

	@Override
	public String toString() {
		return "SistemaSaludDispositivos [lstDispositivos=" + lstDispositivos + "\n, lstEmpresas=" + lstEmpresas + "]";
	}

	public List<Dispositivo> getLstDispositivos() {
		return lstDispositivos;
	}

	public List<Empresa> getLstEmpresas() {
		return lstEmpresas;
	}
	
	
	
	
	
	
}
