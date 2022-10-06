package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Dispositivo {
	private int id;
	private String nombre;
	private String codigo;
	private List<Metrica> lstMetricas;
	private Empresa empresa;

	public Dispositivo(int id, String nombre, String codigo, Empresa empresa) throws Exception {
		super();
		this.id = id;
		this.nombre = nombre;
		this.setCodigo(codigo);
		this.empresa = empresa;
		this.lstMetricas = new ArrayList<Metrica>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) throws Exception {
		if(!validarCodigo(codigo)) throw new Exception("Error: Codigo incorrecto");
		this.codigo = codigo;
	}

	

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<Metrica> getLstMetricas() {
		return lstMetricas;
	}

	@Override
	public String toString() {
		return "Dispositivo [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", lstMetricas=" + lstMetricas
				+ ", empresa=" + empresa + "]\n";
	}
	public boolean validarCodigo(String codigo) {
		boolean flag = false;
		if (codigo.length() == 5) {
			int aux = 0;
			for (int i = 1; i < 5; i++) {
				aux += (int) codigo.toCharArray()[i];
			}
			
			if(codigo.startsWith("A")) {
				if(aux%2==0) {
					flag=true;
				}
			} else if (codigo.startsWith("B")) {
				if(aux%2!=0) {
					flag=true;
				}	}
		}
		return flag;
	}
	
	public boolean agregarMetrica(int valor, LocalDate fecha, LocalTime hora) {
		
		Metrica m= new Metrica(valor, fecha, hora);
		
		return lstMetricas.add(m);
	}
	
	public Metrica traerMetrica(LocalDate fecha, LocalTime hora) {
		int i=0;
		Metrica m=null;
		while (i<this.lstMetricas.size() && m==null) {
			if( this.lstMetricas.get(i).getFecha().isEqual(fecha)
					&&  this.lstMetricas.get(i).getHora().compareTo(hora)==0) {
				m= this.lstMetricas.get(i);
			}
		i++;
		}
		return m;
	}
	
	public List<Metrica> traerMetricas(LocalDate desde, LocalDate hasta) {
		
		List<Metrica> lstM= new ArrayList<Metrica>();
		
		for (int i=0; i<this.lstMetricas.size();i++) {
			if(Funciones.estaEnRango(lstMetricas.get(i).getFecha(), desde, hasta)) {
				lstM.add(lstMetricas.get(i));
			}
		}
		
		return lstM;
	}
	
public List<Metrica> traerMetricas(LocalDate desde, LocalDate hasta, int menorAValor) {
		
		List<Metrica> lstM= new ArrayList<Metrica>();
		List<Metrica> aux= this.traerMetricas(desde, hasta);
		
		for (int i=0; i<aux.size();i++) {
			if(aux.get(i).getValor()< menorAValor ) {
				lstM.add(aux.get(i));
			}
		}
		
		return lstM;
	}
}
