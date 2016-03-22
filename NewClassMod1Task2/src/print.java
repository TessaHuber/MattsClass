import java.util.Scanner;


public class print {
	public static void main(String[] args) {
		Course C = new Course();
		
		Scanner scanner= new Scanner(System.in);
		double regnumber;
		System.out.println("please Enter student regestraion number:");
		regnumber=scanner.nextDouble();
		C.setRegnumber(regnumber); 
		System.out.println("please enter department name:");
		String dptname = scanner.nextLine();
		C.setDptname(dptname);
		System.out.println("please enter student Permanet address:");
		String address = scanner.nextLine();
		C.setAddress(address);
		System.out.println("please enter student email:");
		String emailID = scanner.nextLine();
		C.setEmailID(emailID);
		System.out.println("please enter student contact phone number:");
		int phonenumber = scanner.nextInt();
		C.setPhonenumber(phonenumber);
		print(C);

	}

	public static void print(Course c) {
		System.out.println("Student Regestration Number:"+ c.getRegnumber());
		System.out.println("Department Name:"+c.getDptname() );
		System.out.println("Student address:"+c.getAddress() );
		System.out.println("Student Email:"+c.getEmailID() );
		System.out.println("Student phone number:"+c.getPhonenumber() );
	}

	

	
	}

