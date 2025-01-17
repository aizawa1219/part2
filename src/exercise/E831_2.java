package exercise;

import java.time.LocalDate;
import java.util.List;

public class E831_2 {

	public static void main(String[] args) {
		
		List<Member> list = List.of(
				new GeneralMember(200, "木村一郎"),
				new StudentMember(100, "田中宏", LocalDate.of(2026,  3, 31)),
				new SeniorMember(150, "鈴木浩二", LocalDate.of(1960,  3, 31))
				);
		
		int total = 0;
		for(Member member : list) {
			total += member.kai_hi();
		}
		System.out.println("合計=" + total);
	}

}
