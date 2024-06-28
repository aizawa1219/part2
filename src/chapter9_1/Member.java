package chapter9_1;

public abstract class Member { //抽象クラス宣言
	
	private long id;
	private String name;
	
	protected Member(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	protected abstract int kai_hi();//抽象メソッド

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
