package exercise;

public class Rectangle {
	private double height;
	private double width;
	//コンストラクタ
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public double menseki() {
		return (double)(height * width);
	}

}
