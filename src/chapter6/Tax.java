package chapter6;

import java.util.Objects;

public class Tax {
	private int number;
	private String name;
	private int shotoku;
	private int koujo;
	//コンストラクタ
	public Tax(int number, String name, int shotoku, int koujo) {
		this.number = number;
		this.name = name;
		this.shotoku = shotoku;
		this.koujo = koujo;
	}

	public int zeigaku() {
		return (int)((shotoku - koujo)*0.1);
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public int getShotoku() {
		return shotoku;
	}

	public int getKoujo() {
		return koujo;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setShotoku(int shotoku) {
		this.shotoku = shotoku;
	}

	public void setKoujo(int koujo) {
		this.koujo = koujo;
	}
	
	@Override
	public String toString() {
		return "Tax [number=" + number + ", name=" + name + ", shotoku=" + shotoku + ", koujo=" + koujo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tax other = (Tax) obj;
		return number == other.number;
	}

}
