import java.util.Date;

public class GeometricObject {


	private String color;
	private boolean filled;
	private Date dateCreated;

	public GeometricObject() {
		dateCreated = new Date();
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "[" + color + " : " + filled + " : " + dateCreated + "]";
	}

	public double getArea() {
		return 0;
	}

	public double getPerimeter() {
		return 0;
	}
}
