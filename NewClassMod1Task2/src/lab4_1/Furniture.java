package lab4_1;
public abstract class Furniture {
	String color;
	double height;
	double width;

	public Furniture() {
		// TODO Auto-generated constructor stub
	}
	public Furniture(String color, double height, double width) {
		// TODO Auto-generated constructor stub
		this.color = color;
		this.height = height;
		this.width = width;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	abstract void display();

}

