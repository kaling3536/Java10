package test01;

class CShape {
	public double area() {
		return 0;
	}
}

class CCircle extends CShape {
	double radius;

	public CCircle(double r) {
		radius = r;
	}

	public double area() {
		return (3.14 * radius * radius);
	}
}

class CSquare extends CShape {
	double side;

	public CSquare(double s) {
		side = s;
	}

	public double area() {
		return (side * side);
	}
}

class CTriangle extends CShape {
	double base, height;

	public CTriangle(double b, double h) {
		base = b;
		height = h;
	}

	public double area() {
		return (base * height / 2);
	}
}

public class hw10_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle cir1 = new CCircle(1.0);
		CCircle cir2 = new CCircle(2.0);
		CSquare squ1 = new CSquare(1.0);
		CSquare squ2 = new CSquare(2.0);
		CTriangle tri1 = new CTriangle(3, 6);

		CTriangle tri2 = new CTriangle(4, 10);
		double a[] = new double[6];

		System.out.println("circle(1.0)=" + cir1.area());
		System.out.println("circle(2.0)=" + cir2.area());
		System.out.println("square(1.0)=" + squ1.area());
		System.out.println("square(2.0)=" + squ2.area());
		System.out.println("triangle(3,6)=" + tri1.area());
		System.out.println("triangle(4,10)=" + tri2.area());

		a[0] = cir1.area();
		a[1] = cir2.area();
		a[2] = squ1.area();
		a[3] = squ2.area();
		a[4] = tri1.area();
		a[5] = tri2.area();

		System.out.println("The largest area is " + largest(a));
	}

	public static double largest(double a[]) {
		double max = a[0];
		for (int i = 0; i < a.length; i++)
			if (max < a[i])
				max = a[i];
		return max;
	}
}
