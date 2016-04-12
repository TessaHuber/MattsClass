package lab2_1;

public class task3 {
	public static void main(String [] args){
		String str1=new String("Java");
		String str2=new String("Java");
		if(str1==str2) {
		System.out.println("str1 and str2 are equal");
		} else{
		System.out.println("str1 and str2 are NOT equal");//this is true
		}

		String str3=new String("Java");
		String str4=new String("Java");
		if(str3.equals(str4)) {
		System.out.println("str3.equals(str4) is TRUE");//this is true
		} else{
		System.out.println("str3.equals(str4) is FALSE");
		}

		
	}
}
