package chapter9_1;

import java.time.LocalDate;

public class Sample4 {

	public static void main(String[] args) {
		
//		Member member = new GeneralMember(200, "木村一郎");
		
		Member member = new StudentMember(100, "田中宏", LocalDate.of(2026,  3, 31));
		
//		Member member = new SeniorMember(150, "鈴木浩二", LocalDate.of(1960,  3, 31));
		
		//結果を変数msgに代入する
		String msg = switch(member) {
		case GeneralMember gem -> "一般会員です";
		case StudentMember stm -> "学生会員です　期限日=" + stm.getExpDate();
		case SeniorMember  sem -> "シニア会員です　年齢=" + sem.age();
		default 			   -> "会員ではありません";
		};
		
		System.out.println(msg);
	}

}
