package edu.eci.cvds.entities;

import java.util.Date;
import java.util.List;

/**
 * Clase que representa una materia
 */
public class Book {

	private int id;
	private String name;
	private int price;
	private String language;
	private Date publicationdate;
	private short rating;
	private String format;
	//private List<Review> resenas;

	public Book(int id, String name, int price, String language, Date publicationdate, short rating, String format) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.language = language;
		this.publicationdate = publicationdate;
		this.rating = rating;
		this.format = format;
	}

	public Book() {super();}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Date getPublicationdate() {
		return publicationdate;
	}

	public void setPublicationdate(Date publicationdate) {
		this.publicationdate = publicationdate;
	}

	public short getRating() {
		return rating;
	}

	public void setRating(short rating) {
		this.rating = rating;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public String toString() {
		return "Book{" +
				"id=" + id +
				", name='" + name + '\'' +
				", price=" + price +
				", language='" + language + '\'' +
				", publicationdate=" + publicationdate +
				", rating=" + rating +
				", format='" + format + '\'' +
				'}';
	}
}
