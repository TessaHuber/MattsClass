
public class Circle extends GeometricObject {
	private double radius;

	public Circle(double radius) {
		super();
		this.setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.pow(radius * Math.PI, 2);
	}

	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	public double getDiameter() {
		return 2 * radius;
	}
}
