package cetaSistema;

import java.util.regex.*;

public class Rodado {
	private int idRodado;
	private String dominio;
	private int modelo;
	private String marca;

	public Rodado(int idRodado, String dominio, int modelo, String marca) throws Exception {

		this.idRodado = idRodado;
		this.setDominio(dominio);
		this.modelo = modelo;
		this.marca = marca;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) throws Exception {
		if (!this.validarDominio(dominio))
			throw new Exception("Error: Dominio invalido");
		this.dominio = dominio;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getIdRodado() {
		return idRodado;
	}

	public boolean validarDominio(String dominio) {
		return dominio.matches("([A-Z]{2}[0-9]{3}[A-Z]{2})||[A-Z]{3}[0-9]{3}");
		
	}

}