package lab2_2;

public class mod2lab2task3c {
	public static void main(String [] args){

		/**
		 * These should be using arrays, not just print strings, this can be easily converted though, where you have sysouts, set the value of the array[t][k] to the value, then print the arrays out
		 */
		for (int t = 0; t <= 10; t++) {
            for (int k = 0; k < 10; k++) {
            System.out.print(" ");
            if (t == k) {
                System.out.print("*");
            }
            if(k == 9-t){
                System.out.print("*");
            }
        }
    System.out.println();}

}


}
