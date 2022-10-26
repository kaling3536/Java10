package test;

class Cddd {
	private int num;

	public void display() {
		System.out.println("printed from Cddd class");
	}
}

class Cccc extends Cddd {
	public void display() {
		System.out.println("printed from Cccc class");
	}
}

public class hw10_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cddd cc = new Cccc();
		cc.display();
	}

}

