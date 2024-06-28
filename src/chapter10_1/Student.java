package chapter10_1;

import java.time.LocalDate;

public class Student extends User implements Attendable, Versionable{ //実装宣言
	
	private LocalDate expDate;  //IDの有効期限日

	public Student(int id, String name, String mail, int role, LocalDate expDate) {
		super(id, name, mail, role);
		this.expDate = expDate;
	}
	
	public boolean isExpired() {   //有効期限内かどうか（true/false）
		LocalDate today = LocalDate.now();
		return today.isAfter(expDate);
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	@Override
	public void writeAttendance() {
		System.out.println("出席報告を完了しました");
	}

	@Override
	public void readAttendance() {
		System.out.println("出席情報を読み込みました");
	}

	@Override
	public String version() {
		return "Student ver 1.0";
	}
	
	
}
