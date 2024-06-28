package chapter8_1;

import java.time.LocalDate;

public class LocalDateExamples {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();  //今の日付を作成
		LocalDate day = LocalDate.of(2022,  12, 1 ); //特定の日付を作成
		
		if(today.isAfter(day)) { //日付の比較
			System.out.println(today + "は" + day + "よりも後の日付");
		}else {
			System.out.println(today+"は" + day + "よりも前の日付");
		}
	}

}
