package IteratorPattern.Iterators;

import java.util.LinkedList;
import java.util.ListIterator;

import IteratorPattern.Book;
import IteratorPattern.ShelfIterator;

public class SciFictionShelfIterator implements ShelfIterator
{

	private LinkedList<Book> bookList;
	private ListIterator<Book> currBook;

	public SciFictionShelfIterator(LinkedList<Book> bookList)
	{
		this.bookList = bookList;
		currBook = bookList.listIterator();
	}

	@Override
	public Book nextBook()
	{
		if(bookList != null && currBook.hasNext()) {
			return currBook.next();
		}

		return null;
	}

	@Override
	public Book prevBook()
	{
		if(bookList != null && currBook.hasPrevious()) {
			return currBook.previous();
		}

		return null;
	}

	@Override
	public boolean hasNext()
	{
		return currBook.hasNext();
	}

	@Override
	public boolean hasPrev()
	{
		return currBook.hasPrevious();
	}
}
