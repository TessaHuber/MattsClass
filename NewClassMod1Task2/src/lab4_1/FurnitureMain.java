package lab4_1;

import java.util.Scanner;

public class FurnitureMain {
	public static void main(String[] args) {
      System.out.print("pick one \n");
      System.out.print("#1 chair\n");
      System.out.print("#2 book shelf");
      System.out.print("\n enter the number you want :");
      Scanner s = new Scanner(System.in);
      int c = s.nextInt();
      String color,type;
      double height,width;
      Furniture f = null;
      int no;
      switch(c){
      case 1 : 
    	  System.out.print("what color chair :");
    	  color = s.next();
    	  System.out.print("\n chair width :");
    	  width = s.nextDouble();
    	  System.out.print("\nchair height :");
    	  height = s.nextDouble();
    	  System.out.print("\n type of chair :");
    	  type = s.next();
    	  f = new Chair(color,height,width,type);
    	  f.display();
    	  break;
      case 2 :
    	  System.out.print("what color book shelf :");
    	  color = s.next();
    	  System.out.print("\nbook shelf width :");
    	  width = s.nextDouble();
    	  System.out.print("\nbookshelf height :");
    	  height = s.nextDouble();
    	  System.out.print("\nnumber of book shelf :");
    	  no = s.nextInt();
    	  f= new BookShelf(color,height,width,no);
    	  f.display();
    	  break;
      default : System.out.println("that was not one of the choices what are you doing with yout life");
      }
     
	}
}

