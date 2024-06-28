package chapter8_3;

import java.time.LocalDate;

import chapter8_1.GeneralMember;

public class Sample2 {

	public static void main(String[] args) {
		
		GeneralMember gem = new StudentMember(100, "田中宏", LocalDate.of(2026, 3, 31));
		
		System.out.println("id=" + gem.getId());
		System.out.println("name=" + gem.getName());
		System.out.println("会費=" + gem.kai_hi()); //オーバーライドメソッド
		
//		System.out.println("期限日か=" + gem.isExpired());
//		System.out.println("期限日 =" + gem.getExpDate());
	}

}
