package test;

class Caa {
	private int num;

	public Caa() {
		this(2);          // 呼叫 Caaa(int n)建構元
	}

	public Caa(int n) {
		num = n;
	}

	public int get() {
		return num;
	}

	class Cbbb extends Caa {
		public void show() {
			System.out.println("num=" + get());
		}
	}
}

public class hw10_5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbbb bb = new Cbbb();
		bb.show();
	}

}

