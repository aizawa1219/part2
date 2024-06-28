package chapter9_1;

import java.time.LocalDate;

public class Sample3 {

	public static void main(String[] args) {
		
//		Member member = new GeneralMember(200, "木村一郎");
		
		Member member = new StudentMember(100, "田中宏", LocalDate.of(2026,  3, 31));
		
//		Member member = new SeniorMember(150, "鈴木浩二", LocalDate.of(1960,  3, 31));
		
		if(member instanceof StudentMember stm) {
			System.out.println("期限日=" + stm.getExpDate());
		}
	}

}
