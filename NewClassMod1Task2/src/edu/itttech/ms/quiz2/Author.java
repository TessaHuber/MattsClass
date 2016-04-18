package edu.itttech.ms.quiz2;

import java.util.Date;

public class Author extends Person{

	 private Date deathDate;

	 @Override
		public String toString() {

			return super.toString()+String.format("Death Date: %s%n", deathDate.toString());
		}

	public Date getDeathDate() {
		return deathDate;
	}

	public void setDeathDate(Date deathDate) {
		this.deathDate = deathDate;
	}

}
