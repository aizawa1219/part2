package chapter9_1;

import java.time.LocalDate;

public class StudentMember extends Member{
	private LocalDate expDate;

	public StudentMember(long id, String name, LocalDate expDate) {
		super(id, name);
		this.expDate = expDate;
	}
	
	@Override
	public int kai_hi() {  //オーバーライド
		return isExpired() ? 1000 : 700;//学生会員の期限が過ぎていれば1000円、過ぎていなければ700円
	}
	
	public boolean isExpired() {
		LocalDate today = LocalDate.now();
		return today.isAfter(expDate);
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}
	
	
	
}
