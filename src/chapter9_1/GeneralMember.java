package chapter9_1;

public class GeneralMember extends Member {
	
	//スーパークラスのコンストラクタを実行する
	public GeneralMember(long id, String name) {
		super(id, name);
	}

	@Override
	public int kai_hi() {  //オーバーライド
		return 1000;
	}
	
}
