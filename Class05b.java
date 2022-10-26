package test03;

class Caaa {
	private int num;

	public Caaa(int n) {
		num = n;
	}

	public int get() {
		return num;
	}
}

class Cbbb extends Caaa {
	public Cbbb() {
		super(2);
	}

	public void show() {
		System.out.println("num=" + get());
	}
}

public class hw10_5b {
	public static void main(String args[]) {
		Cbbb bb = new Cbbb();
		bb.show();
	}
}
