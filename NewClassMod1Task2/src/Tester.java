import java.util.Arrays;

public class Tester {
	public static void main(String[] args) {
		int x, y;
		x = 5;
		y = ++x + x++;
		//System.out.println(x);
		//System.out.println(y);

		int [][] coords = new int [10][2];

		for(int indx1 = 0; indx1 < coords.length; indx1++){
			for(int indx2 = 0; indx2 < coords[indx1].length; indx2++){
				coords[indx1][indx2] = (int)(Math.random() * 100);
			}
		}

		for(int [] coordArray1 : coords){
			System.out.print("[");
			for(int coordVal : coordArray1){
				System.out.print(coordVal + " ");
			}
			System.out.println("]");
		}


	}
}
