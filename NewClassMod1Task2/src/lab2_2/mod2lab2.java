package lab2_2;
	import java.util.Scanner;
		import java.util.Arrays;
public class mod2lab2 {

	

		
			public static void main(String [] args){
			String userin;
				
				System.out.println("pick one, a dog a cat or a cow");
				Scanner scanner= new Scanner(System.in);
				userin=scanner.next();
				String array[] = {"dog","cat","cow"};
				if (userin=="cat"&& Arrays.asList(array).contains("cat"))
					System.out.println("your answer was Cat!");
				else if (userin=="dog"&& Arrays.asList(array).contains("dog"))
					System.out.println("your answer was Dog!");
				else if (userin=="cow"&& Arrays.asList(array).contains("cow"))
					System.out.println("your answer was Cow!");
				else System.out.println("you did not answer with one of the selected");
				
				
				
			}
		}


