package Lab5_1;

import java.util.Arrays;
import java.util.List;

public class Lab5_1 {
	public static void main(String[] args) {
		
		 List<Integer> numbers = Arrays.asList(1, 82, 43, 4,15, 75, 6, 7, 8, 9, 10,51,90);
	 		System.out.println("all numbers ");
		 		System.out.println(numbers);
		 		System.out.println("even ");

		 		numbers.stream()
		           .filter(value -> value % 2 == 0)
		           .forEach(System.out::println);
		 		System.out.println(" odd");
		 		numbers.stream()
		           .filter(value -> value % 2 != 0)
		           .forEach(System.out::println);
		 		System.out.println("divisable by 6 ");
		 		numbers.stream()
		           .filter(value -> value % 6 == 0)
		           .forEach(System.out::println);
		 		System.out.println("less than 12 ");
		 		numbers.stream()
		           .filter(value -> value < 12)
		           .forEach(System.out::println);
		 		System.out.println("more than 50");
		 		numbers.stream()
		           .filter(value -> value > 50)
		           .forEach(System.out::println);
	}
	
	
	}

		

