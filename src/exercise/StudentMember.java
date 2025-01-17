package exercise;

import java.time.LocalDate;

public class StudentMember extends Member{
	private LocalDate expDate;

	public StudentMember(long id, String name, LocalDate expDate) {
		super(id, name);
		this.expDate = expDate;
	}
	
	@Override
	public int kai_hi() {  //オーバーライド
		return 500;
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
