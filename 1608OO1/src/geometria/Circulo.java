package geometria;

public class Circulo {
	private Punto origen;
	private double radio;
	
	public Circulo(Punto origen, double radio) {
		super();
		this.origen = origen;
		this.radio = radio;
	}

	public Punto getOrigen() {
		return origen;
	}

	public void setOrigen(Punto origen) {
		this.origen = origen;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(Punto punto) {
		this.radio= this.origen.calcularDistancia(punto);
	}

	@Override
	public String toString() {
		return "Circulo [origen=" + origen + ", radio=" + radio + "]";
	}
	
	public boolean equals(Circulo circulo) {
		return this.origen.equals(circulo.getOrigen())&& this.radio == circulo.getRadio() ;	}
	
	
	public double calcularDistancia(Circulo circulo) {
		return this.origen.calcularDistancia(circulo.getOrigen());
	}
	
	public double calcularArea() {
		return Math.PI * (Math.pow(radio, 2));
	}
	
	
}
