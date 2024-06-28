package exercise;

import chapter6.Tax;

public class E621_1 {

	public static void main(String[] args) {
		
		Tax tax1 = new Tax(110, "木村一郎", 300000, 90000);
		Tax tax2 = new Tax(120, "鈴木浩二", 250000, 120000);
		Tax tax3 = new Tax(130, "斎藤渉", 400000, 180000);
		
		System.out.println(tax1.zeigaku());
		System.out.println(tax2.zeigaku());
		System.out.println(tax3.zeigaku());
	}

}
