package exercise;

import chapter8_2.GeneralMember;
import chapter8_2.Lesson;

public class E821_1 {

	public static void main(String[] args) {
		
		Lesson lesson = new Lesson("G101", "ゴルフ");
		GeneralMember gm = new GeneralMember(100,"田中宏", lesson);
		
		System.out.println("会員氏名=" + gm.getName());
		System.out.println("受講しているレッスン=" + gm.getLessonName());
		System.out.println("レッスン料金=" + gm.ryokin());
	}

}
