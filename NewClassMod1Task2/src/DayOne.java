import java.util.Date;

public class DayOne {

	public static void main(String[] args) {
		GeometricObject go1 = new Rectangle(10, 20.0);
		GeometricObject go2 = new Circle(10.0);

		printArea(go1);
		printArea(go2);

		printPerimeters(go1, go1, go1, go1, go1);
	}

	public static void printArea(GeometricObject go) {
		System.out.println(go.getArea());
	}

	public static void printPerimeters(GeometricObject ... geometricObjects) {
		for(GeometricObject go : geometricObjects) {
			System.out.println(go.getPerimeter());
		}
	}
}
