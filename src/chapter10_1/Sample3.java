package chapter10_1;

import java.time.LocalDate;
import java.util.List;

public class Sample3 {

	public static void main(String[] args) {
		
		//要素がAttendable型の不変リスト
		var list = List.of(
				new Student(10, "田中博", "tanaka@mail.jp", 2, LocalDate.of(2000, 1,1)),
				new AuditingStudent(20, "木村健", "kimura@mail.jp", 3, 112),
				new Student(12, "森下樹", "morishita@mail.jp", 2, LocalDate.of(2004, 7,1))
				);
		//インタフェースのメソッドを実行
		for(Attendable art : list) {
			art.readAttendance();
		}
	}

}
