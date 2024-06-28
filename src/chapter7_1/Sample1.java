package chapter7_1;

public class Sample1 {

	public static void main(String[] args) {
		
		Joining j = new Joining("", ",");
		j.add("apple");
		j.add("banana");
		j.add("peach");
		System.out.println(j.getCsv());
	}

}
