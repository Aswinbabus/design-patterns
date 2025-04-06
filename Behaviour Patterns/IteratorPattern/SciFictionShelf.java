package IteratorPattern;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class SciFictionShelf implements ShelfIterator
{

	private LinkedList<Book> bookList;
	private ListIterator<Book> currBook;

	public SciFictionShelf(LinkedList<Book> bookList)
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
}
