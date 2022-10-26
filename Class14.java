package test;

class Cxxx {
	public int num1;
	public int num2;

	public Cxxx(int a, int b) {
		num1 = a;
		num2 = b;
	}
}

class Cyyy extends Cxxx {
	public Cyyy(int a, int b) {
		super(a, b);
	}

	public void show() {
		System.out.println("num1=" + num1 + ", num2=" + num2);
	}
}

public class hw10_14 {
	public static void main(String args[]) {
		Cyyy b2 = new Cyyy(3, 9);
		b2.show();
	}
}
