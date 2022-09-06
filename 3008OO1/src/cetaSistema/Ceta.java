package cetaSistema;

import cetaSistema.*;
import java.time.LocalDate;
public class Ceta {
	private int idCeta;
	private LocalDate fecha;
	private Contribuyente vendedor;
	private Contribuyente comprador;
	private double valorDeTransferencia;
	private boolean firmaComprador;
	private Rodado rodado; 
	
	
	public Ceta(int idCeta, LocalDate fecha, Contribuyente vendedor, Contribuyente comprador,
			double valorDeTransferencia, boolean firmaComprador, Rodado rodado) {
		super();
		this.idCeta = idCeta;
		this.fecha = fecha;
		this.vendedor = vendedor;
		this.comprador = comprador;
		this.valorDeTransferencia = valorDeTransferencia;
		this.firmaComprador = firmaComprador;
		this.rodado= rodado;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Contribuyente getVendedor() {
		return vendedor;
	}
	public void setVendedor(Contribuyente vendedor) {
		this.vendedor = vendedor;
	}
	public Contribuyente getComprador() {
		return comprador;
	}
	public void setComprador(Contribuyente comprador) {
		this.comprador = comprador;
	}
	public double getValorDeTransferencia() {
		return valorDeTransferencia;
	}
	public void setValorDeTransferencia(double valorDeTransferencia) {
		this.valorDeTransferencia = valorDeTransferencia;
	}
	public boolean isFirmaComprador() {
		return firmaComprador;
	}
	public void setFirmaComprador(boolean firmaComprador) {
		this.firmaComprador = firmaComprador;
	}
	public int getIdCeta() {
		return idCeta;
	}
	public Rodado getRodado() {
		return rodado;
	}
	public void setRodado(Rodado rodado) {
		this.rodado = rodado;
	}
	
	
	
}