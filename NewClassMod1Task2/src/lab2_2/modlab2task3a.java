package lab2_2;

public class modlab2task3a {
	public static void main(String [] args){
		 for (int i = 0; i<9; i++){
		        for(int h = 0; h<Math.abs(2-i); h++)
		            System.out.print(" ");
		        for(int y = 1; y<=9-2*Math.abs(2-i); y++)
		            System.out.print(y);
		        for (int k = 0; k<Math.abs(2-i); k++)
		            System.out.print(" ");
		        System.out.println();
		    }
		} 

}
