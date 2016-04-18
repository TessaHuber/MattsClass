package edu.itttech.ms.quiz2;

import java.util.List;

public class Books {

	private String title;
	private String genre;
	private String ISBN;
	private int pubYear;
	private double price;

	private List<Author> authors;

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Title: %s%nGenre: %s%nISBN: %s%nPublish Year: %d%nPrice: %.2f%n", title, genre, ISBN, pubYear, price));
		for(Author a: authors){
			sb.append(a.toString());
		}

		return sb.toString();}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getPubYear() {
		return pubYear;
	}

	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

}
