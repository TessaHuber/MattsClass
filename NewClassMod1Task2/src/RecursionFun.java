
public class RecursionFun {
	public static void main(String[] args) {

		int [] numbers = new int[100];
		for(int i = 0; i < 100; i++) {
			numbers[i] = (int)(Math.random() * 100);
		}

		printNumbers(numbers, 0);

		Circle circle = new Circle(5);
		System.out.println(circle);
		updateCircle(circle);
		System.out.println(circle);
	}

	public static void printNumbers(final int [] numbers, final int index) {
		if(index + 1 < numbers.length)
		{
			printNumbers(numbers, index + 1);
			System.out.println(index + " : " + numbers[index]);
		}
	}

	public static void updateCircle(final Circle c) {
		c.setColor("blue");
		c.setColor("red");
	}
}
