package chapter8_2;

public class GeneralMember {

	private long id;
	private String name;
	private Lesson lesson;  //レッスンオブジェクト　委譲メソッド
	
	public GeneralMember(long id, String name, Lesson lesson) {
		this.id = id;
		this.name = name;
		this.lesson = lesson;
	}
	public int kai_hi() {
		return 1000;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int ryokin() {
		return lesson.ryokin();
	}
	public String getLessonId() {
		return lesson.getLessonId();
	}
	public String getLessonName() {
		return lesson.getLessonName();
	}
	
	
	
	
}
