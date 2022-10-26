package test;

class Cqqq {
	public int num1;
	public int num2;

	public Cqqq() {
		num1 = 1;
		num2 = 1;
	}
}

class Cwww extends Cqqq {
	public Cwww() {
		super();
	}

	public void show() {
		System.out.println("num1=" + num1 + ", num2=" + num2);
	}
}

public class hw10_13 {
	public static void main(String args[]) {
		Cwww b1 = new Cwww();
		b1.show();
	}
}

