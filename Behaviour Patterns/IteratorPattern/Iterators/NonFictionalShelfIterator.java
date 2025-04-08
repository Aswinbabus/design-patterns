package IteratorPattern.Iterators;

import IteratorPattern.Book;
import IteratorPattern.ShelfIterator;

public class NonFictionalShelfIterator implements ShelfIterator
{
	private Book[] books;
	private int currBook;

	public NonFictionalShelfIterator(Book[] books)
	{
		this.books = books;
		currBook = 0;
	}

	@Override
	public Book nextBook()
	{
		if(books != null && currBook + 1 < books.length) {

			currBook++;
			return books[currBook];

		}

		return null;
	}

	@Override
	public Book prevBook()
	{

		if(books != null && currBook - 1 >= 0) {

			currBook--;
			return books[currBook];

		}

		return null;

	}

	@Override
	public boolean hasNext()
	{
		return currBook < books.length - 1;
	}

	@Override
	public boolean hasPrev()
	{
		return currBook > 0;
	}
}
