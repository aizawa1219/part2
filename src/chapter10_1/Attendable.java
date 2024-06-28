package chapter10_1;

public interface Attendable {
	void writeAttendance(); //出席をデータベースに記録する
	void readAttendance(); //データベースから出席データを読み出す
}
