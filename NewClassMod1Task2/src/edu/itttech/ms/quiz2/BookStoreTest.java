package edu.itttech.ms.quiz2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BookStoreTest {
	public static SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

	public static void main(String[] args) {
		int selection = -1;
		List<Books> books = new ArrayList<>();
		List<Customer> customers = new ArrayList<>();
		List<Employee> employees = new ArrayList<>();
		BookStore bookstore = new BookStore();
		// try with resources for auto closing
		try (Scanner scanner = new Scanner(System.in);) {
			while (selection != 0) {
				System.out.println("Please make a selection: ");

				System.out.println("1 = New Customer");
				System.out.println("2 = New Employee");
				System.out.println("3 = New Book");
				System.out.println("0 = Print contents");
				selection = scanner.nextInt();
				scanner.nextLine();

				switch (selection) {
				case 0:

					break;
				case 1:
					Customer c = new Customer();
					createNewCus(c, scanner);
					customers.add(c);
					break;
				case 2:
					Employee e = new Employee();
					createNewEmp(e, scanner);
					employees.add(e);
					break;
				case 3:
					Books b = new Books();
					createNewBook(b, scanner);
					books.add(b);
					break;

				}
			}
		}
		bookstore.setBooks(books);
		bookstore.setCustomers(customers);
		bookstore.setEmployees(employees);

		printBookStore(bookstore);
	}

	public static void createNewEmp(Employee emp, Scanner scanner) {
		String input = null;

		while (null == input || input.isEmpty()) {
			System.out.println("Please enter Employee First Name");
			input = scanner.nextLine();
		}
		emp.setFirstName(input);

		input = null;
		while (null == input || input.isEmpty()) {
			System.out.println("Please enter Employee Last Name");
			input = scanner.nextLine();
		}
		emp.setLastName(input);
		emp.setDob(getDate("Please enter Employee Date of Birth", scanner));

		input = null;
		while (null == input || input.isEmpty()) {
			System.out.println("Please enter Employee Address");
			input = scanner.nextLine();
		}
		emp.setAddress(input);

		input = null;
		while (null == input || input.isEmpty()) {
			System.out.println("Please enter Employee Position");
			input = scanner.nextLine();
		}
		emp.setPosition(input);

	}

	public static void createNewCus(Customer cus, Scanner scanner) {
		String input = null;
		while (null == input || input.isEmpty()) {
			System.out.println("Please enter Customer First Name");
			input = scanner.nextLine();
		}
		cus.setFirstName(input);

		input = null;
		while (null == input || input.isEmpty()) {
			System.out.println("Please enter Customer Last Name");
			input = scanner.nextLine();
		}
		cus.setLastName(input);
		cus.setDob(getDate("Please enter Customer Date of Birth", scanner));

		input = null;
		while (null == input || input.isEmpty()) {
			System.out.println("Please enter Customer Address");
			input = scanner.nextLine();
		}
		cus.setAddress(input);

	}

	public static void createNewBook(Books book, Scanner scanner) {
		String input = null;

		while (null == input || input.isEmpty()) {
			System.out.println("Please enter Book Title");
			input = scanner.nextLine();
		}
		book.setTitle(input);

		input = null;
		while (null == input || input.isEmpty()) {
			System.out.println("Please enter Book Genre");
			input = scanner.nextLine();
		}
		book.setGenre(input);

		input = null;
		while (null == input || input.isEmpty()) {
			System.out.println("Please enter Book ISBN");
			input = scanner.nextLine();
		}
		book.setISBN(input);

		input = null;
		while (null == input || input.isEmpty()) {
			System.out.println("Please enter Book Published Year");
			input = scanner.nextLine();
		}
		book.setPubYear(Integer.parseInt(input));

		input = null;
		while (null == input || input.isEmpty()) {
			System.out.println("Please enter Book Price");
			input = scanner.nextLine();
		}
		book.setPrice(Double.parseDouble(input));

		Author author = new Author();
		createNewAuthor(author, scanner);

		List<Author> authors = new ArrayList<>();
		authors.add(author);
		book.setAuthors(authors);

	}

	public static void createNewAuthor(Author author, Scanner scanner) {
		String input = null;

		while (null == input || input.isEmpty()) {
			System.out.println("Please enter Author First Name");
			input = scanner.nextLine();
		}
		author.setFirstName(input);

		input = null;
		while (null == input || input.isEmpty()) {
			System.out.println("Please enter Author Last Name");
			input = scanner.nextLine();
		}
		author.setLastName(input);
		author.setDob(getDate("Please enter Author Date of Birth", scanner));
		author.setDeathDate(getDate("Please enter Author Date of Death", scanner));
	}

	public static void printBookStore(BookStore bs) {
		bs.getCustomers().forEach(System.out::println);
		bs.getEmployees().forEach(System.out::println);
		bs.getBooks().forEach(System.out::println);

	}

	public static Date getDate(String prompt, Scanner scanner) {
		System.out.println(prompt);
		String input = scanner.nextLine();
		try {
			return sdf.parse(input);
		} catch (ParseException e) {
			System.out.println("Please use mm/dd/yyyy format");
			return getDate(prompt, scanner);
		}
	}
}
