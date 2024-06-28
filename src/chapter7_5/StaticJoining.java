package chapter7_5;

public class StaticJoining {
	private static String csv;
	private static String delimiter;
	
	public static void init(String _csv, String _delimiter) {
		csv = _csv;
		delimiter = _delimiter;
	}

	public static String add(String s) { //staticの後のStringは戻り値の型
		csv += csv.isEmpty() ? s : delimiter + s;
		return csv;
	}

	public static String getCsv() {
		return csv;
	}
}
