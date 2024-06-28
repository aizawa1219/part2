package chapter7_7;

import chapter6.Tax;

public class Sample2 {

	public static void main(String[] args) {
		Tax tax = new Tax(100, "田中宏", 300000, 100000);
		sub(tax);
		System.out.println(tax);
	}
	
	public static void sub(Tax mytax) {
		mytax.setNumber(200);
}

}
