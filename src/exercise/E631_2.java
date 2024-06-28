package exercise;

public class E631_2 {

	public static void main(String[] args) {
		Triangle area = new Triangle(2.5, 3.0, 5.1);
		
		System.out.printf("面積=%.2f%n", area.menseki());
		System.out.printf("(a,b,c)=(%.1f, %.1f, %.1f)",area.getA(), area.getB(), area.getC());
		System.out.println(area.isTriangle());
	}

}
