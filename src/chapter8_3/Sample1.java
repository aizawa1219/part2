package chapter8_3;  //chapter8_1からコピー

import java.time.LocalDate;

public class Sample1 {

	public static void main(String[] args) {
		
		var expDate = LocalDate.of(2026, 3, 31);
		var st = new StudentMember(100, "田中宏", expDate);
		
		System.out.println("id=" + st.getId());
		System.out.println("name=" + st.getName());
		System.out.println("会費=" + st.kai_hi()); //オーバーライドメソッド
		
		System.out.println("期限日か=" + st.isExpired());
		System.out.println("期限日 =" + st.getExpDate());
		
		//セッターを使えるかどうかの確認
//		st.setName("相澤");
//		System.out.println("name=" + st.getName());
	}

}
