package test03;

class CRectangle {
	protected int length;
	protected int width;

	public CRectangle(int l, int w) {
		length = l;
		width = w;
	}

	public String toString() {
		String str = "length=" + length + ", width=" + width;
		str += ", area=" + length * width;
		return str;
	}

	public String toString(int a, int b) {
		if (a >= b)
			return super.toString();
		else
			return "Argument Error";
	}
}

public class hw10_20 {
	public static void main(String args[]) {
		CRectangle rect = new CRectangle(2, 6);
		System.out.println(rect.toString());
		System.out.println(rect.toString(8,4));
		System.out.println(rect.toString(3,5));
	}
}

(c) 於 (a) 和 (b) 中所定義的兩個 toString() method 得以同時存在於一個類別內,是
    利用 OOP 裡的「多載」。
