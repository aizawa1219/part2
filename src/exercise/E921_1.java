package exercise;

public class E921_1 {

	public static void main(String[] args) {
		
		Root r = new Foo();
//		Root r = new Bar();
//		Root r = new Bas();
		
		String msg = switch(r) {
		case Foo foo -> "Foo型です";
		case Bar bar -> "Bar型です";
		case Bas bas -> "Bas型です";
		default      -> "どの型でもありません";
		};
		
		System.out.println(msg);
	}

}
