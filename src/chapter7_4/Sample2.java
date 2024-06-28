package chapter7_4;

public class Sample2 {
	
	public static void main(String[] args) {
		//コンストラクタで初期化しないフィールドの値
		NoConstructor nc = new NoConstructor();
		System.out.println(nc.getNumber());
		System.out.println(nc.getStr());
	}

}
