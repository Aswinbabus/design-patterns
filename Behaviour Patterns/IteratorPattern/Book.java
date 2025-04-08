package IteratorPattern;

import java.time.Year;

public class Book
{
	private int bookId;
	private String name;
	private String title;
	private String author;
	private int year;

	public Book(int bookId,String name,String title, String author, int year)
	{
		this.bookId = bookId;
		this.name = name;
		this.title = title;
		this.author = author;
		this.year = year;
	}

	public String getTitle()
	{
		return title;
	}

	public String getAuthor()
	{
		return author;
	}

	public int getYear()
	{
		return year;
	}

	public int getBookId()
	{
		return bookId;
	}

	public String getName()
	{
		return name;
	}

	@Override
	public String toString()
	{
		return "Book{" + "bookId=" + bookId + ", name='" + name + '\'' + ", title='" + title + '\'' + ", author='" + author + '\'' + ", year=" + year + '}';
	}
}
