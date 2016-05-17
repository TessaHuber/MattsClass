package lab4_1;

public class Chair extends Furniture {
	String typeOfChair;

	public Chair(String color,double height,double width,String typeOfChair) {
		super( color, height, width);
		this.typeOfChair = typeOfChair;
	}
	public String getTypeOfChair() {
		return typeOfChair;
	}

	public void setTypeOfChair(String typeOfChair) {
		this.typeOfChair = typeOfChair;
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("chair info");
		System.out.println("color :"+ color);
		System.out.println("width :"+width);
		System.out.println("height :"+ height);
		System.out.println("chair type :"+ typeOfChair);
	}
}
