package entidades;

public class Retangulo {

	public double l1, l2;

	public double area() {
		return l1 * l2;
	}

	public double perimetro() {
		return 2 * (l1 + l2);
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(l1, 2) + Math.pow(l2, 2));
	}

}
