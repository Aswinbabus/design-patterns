package IteratorPattern.Shelfs;

import java.util.List;

import IteratorPattern.Book;
import IteratorPattern.Iterators.FictionalShelfIterator;
import IteratorPattern.Shelf;
import IteratorPattern.ShelfIterator;

public class FictionalShelf implements Shelf
{

	private List<Book> bookList;

	public FictionalShelf(List<Book> bookList)
	{
		this.bookList = bookList;
	}

	@Override
	public void addBook(Book book)
	{
         bookList.add(book);
	}

	@Override
	public void removeBook(int bookId)
	{
        // iterate and remove logic
	}

	@Override
	public ShelfIterator getShelfIterator()
	{
		return new FictionalShelfIterator(bookList);
	}
}
