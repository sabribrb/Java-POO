package geometria;

public class Punto {
	// atributos
	private double x;
	private double y;

//constructor
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

//métodos getter y setter
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

//re-definición de métodos de la clase 

	public double calcularDistancia(Punto punto) {

		return Math.sqrt(Math.pow(this.getX() - punto.getX(), 2) + Math.pow(this.getY() - punto.getY(), 2));

	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	public boolean equals(Punto p) {
		return p.getX() == this.getX() && p.getY() == this.getY();
	}
}
