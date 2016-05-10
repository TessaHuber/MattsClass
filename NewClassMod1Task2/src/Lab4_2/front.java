package Lab4_2;

import java.util.Scanner;

public class front {

	public static void main(String[] args) {

		Calc math = new Calc();
		Scanner in = new Scanner(System.in);

		System.out.print("Please Enter Your First Number:");
		int num1 = in.nextInt();

		System.out.print("Please Enter Your  Second Number:");
		int num2= in.nextInt();

		System.out.print("Plese Select One of the following +,x,-,/ :");
		String operation= in.next();

		if (operation.equals("+")){
				System.out.println(math.Add(num1, num2));
		}
		else if (operation.equals("-")){
				System.out.println(math.Subtract(num1, num2));
		}
		else if (operation.equals("x")){
				System.out.println(math.Multiply(num1, num2));
		}
		else if (operation.equals("/")){
				System.out.println(math.Divide(num1, num2));
		}
		else{
				System.out.println("The operation is not valid.");
		}
}


}
