package exercise;

public class Triangle {
	
	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double menseki() {
		double s = (a + b + c)/2;
		return Math.sqrt(s * (s - a) * (s-b) * (s-c));
	}
	
	public boolean isTriangle() {
		if((b+c>a) && (a>Math.abs(b-c))) {
			return true;
		}else {
			return false;
		}
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

}
