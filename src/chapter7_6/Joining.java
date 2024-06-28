package chapter7_6;

public class Joining {
	private String str;
	private String delimiter;
	
	public Joining(String csv, String delimiter) {
		this.str = csv;
		this.delimiter = delimiter;
	}

	public String add(String s) {
		str += str.isEmpty() ? s : delimiter + s;
		return str;
	}

	public String getCsv() {
		return str;
	}
	
	public static void main(String[] args) {
		Joining j = new Joining("",",");
		
		j.add("apple");
		j.add("banana");
		j.add("peach");
		System.out.println(j.getCsv());
	}
}
