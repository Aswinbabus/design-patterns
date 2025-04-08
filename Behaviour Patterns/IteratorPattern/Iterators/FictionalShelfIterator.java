package IteratorPattern.Iterators;

import java.util.List;

import IteratorPattern.Book;
import IteratorPattern.ShelfIterator;

public class FictionalShelfIterator implements ShelfIterator
{
	private final List<Book> bookList;
    private int currBook;

	public FictionalShelfIterator(List<Book> bookList)
	{
		this.bookList = bookList;
		currBook = 0;
	}

	@Override
	public Book nextBook()
	{
		if(bookList != null && currBook + 1 < bookList.size()) {
			currBook++;
			return bookList.get(currBook);
		}

		return null;
	}

	@Override
	public Book prevBook()
	{

		if(bookList != null && currBook - 1 >= 0) {
			currBook--;
			return bookList.get(currBook);
		}

		return null;

	}

	@Override
	public boolean hasNext()
	{
		return currBook < bookList.size() - 1;
	}

	@Override
	public boolean hasPrev()
	{
		return currBook > 0;
	}
}
