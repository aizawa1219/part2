package exercise;

import java.time.LocalDate;

public class SeniorMember extends Member {
	
	private LocalDate birthday;

	//super()はスーパークラスのコンストラクタの呼び出し
	public SeniorMember(long id, String name, LocalDate birthday) {
		super(id, name);
		this.birthday = birthday;
	}
	
	@Override
	public int kai_hi() {  //オーバーライド
		return 700;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
	
}
