package lab3_1task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lab3_1T2 {
	public static void main(String[] args) {
		int high = 0, low=0;
		Scanner in = new Scanner(System.in);
		ArrayList<Integer>numbers=new ArrayList<Integer>();
		for (int i=1;i<11;i++){
		System.out.println("please enter a number #"+i+":");
		int numberin=in.nextInt();
		numbers.add(numberin);
		 
		}
		System.out.println(numbers);
		
		Object obj = Collections.min(numbers);
		    System.out.println("Minimum Element of Java ArrayList is : " + obj);
		    Object obj2 = Collections.max(numbers);
		    System.out.println("maximum Element of Java ArrayList is : " + obj2);
		
	
	
	
	
			
			
		}}

