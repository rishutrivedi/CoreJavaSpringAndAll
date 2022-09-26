package designpattern.adapter.thirdparty;

public class Traingle implements GShape {
	// sides
	private final double a;
	private final double b;
	private final double c;

	public Traingle() {
		this(1.0d, 1.0d, 1.0d);
	}

	public Traingle(double d, double e, double f) {
		this.a = d;
		this.b = e;
		this.c = f;
	}

	
	public double area() {
		// Heron's formula
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	
	public double perimeter() {
		
		return a+b+c;
	}

	public void drawShape() {
		System.out.println("Drawing Triangle with area: "+area()+ " and perimerter: "+ perimeter());

	}

}