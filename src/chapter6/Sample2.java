package chapter6;

public class Sample2 {

	public static void main(String[] args) {
		
		Tax tax = new Tax(100, "田中宏", 300000, 100000);
		tax.setKoujo(120000);
		
		System.out.println("控除額=" + tax.getKoujo());
		
		System.out.println(tax);  //今の時点では表示されない。toString()メソッドを作成していないから。
	}

}
