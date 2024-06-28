package chapter7_3;

public class Joining {
	private String csv;
	private String delimiter;
	
	public Joining(String csv, String delimiter) {
		this.csv = csv;
		this.delimiter = delimiter;
	}
	public Joining(String delimiter) { //初期値として空文字を入れておく、delimiterは引数で設定。
		this("",delimiter);
	}
	public Joining() { //初期値として既に空文字とコンマを入れておく。
		this("",",");
	}
	

	public void add(String s) {
		csv += csv.isEmpty() ? s : delimiter + s;
	}
	

	public String getCsv() {
		return csv;
	}
}
