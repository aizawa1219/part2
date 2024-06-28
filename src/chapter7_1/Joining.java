package chapter7_1;

public class Joining {
	private String csv;
	private String delimiter;
	
	public Joining(String csv, String delimiter) {
		this.csv = csv;
		this.delimiter = delimiter;
	}

	public void add(String s) {
		csv += csv.isEmpty() ? s : delimiter + s;
	}

	public String getCsv() {
		return csv;
	}

}
