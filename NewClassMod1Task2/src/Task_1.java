
import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		int x;
		int y;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		x = input.nextInt();

		System.out.println("Enter the second number: ");
		y = input.nextInt();

		swapNumbers(x, y);

		System.out.println("2 After swapping, x= " + x + " and y= " + y);
	//	Integer x1 = x;
	//	Integer y1 = y;

		int [] numbers = {x, y};

		swapNumbers(numbers);

		System.out.println("4 After swapping, x= " + numbers[0] + " and y= " + numbers[1]);

	}

	public static void swapNumbers(int x, int y) {

		int temp = x;
		x = y;
		y = temp;

		System.out.println("1 After swapping, x= " + x + " and y= " + y);

	}

	public static void swapNumbers(int [] numbers) {
		int temp = numbers[0];
		numbers[0] = numbers[1];
		numbers[1] = temp;
		System.out.println("3 After swapping, x1= " + numbers[0]  + " and y1= " + numbers[1]);
	}

}

// I don't think I understand what I am supposed to be doing here. This was how
// I started then realized I had no idea what the lab was asking for
