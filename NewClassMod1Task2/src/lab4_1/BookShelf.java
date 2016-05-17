package lab4_1;

public class BookShelf extends Furniture {
	int noOfShelves;

	
	public BookShelf(String color,double height,double width,int noOfShelves) {
		super( color, height, width);
		this.noOfShelves = noOfShelves;
	}
	public int getNoOfShelves() {
		return noOfShelves;
	}

	public void setNoOfShelves(int noOfShelves) {
		this.noOfShelves = noOfShelves;
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("bookshelf info:");
		System.out.println("color :"+ color);
		System.out.println("width :"+width);
		System.out.println("height :"+ height);
		System.out.println("# of shelves :"+ noOfShelves);
	}
}

