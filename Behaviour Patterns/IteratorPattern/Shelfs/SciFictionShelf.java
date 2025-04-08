package IteratorPattern.Shelfs;

import java.util.LinkedList;
import java.util.List;

import IteratorPattern.Book;
import IteratorPattern.Iterators.SciFictionShelfIterator;
import IteratorPattern.Shelf;
import IteratorPattern.ShelfIterator;

public class SciFictionShelf implements Shelf
{

	private LinkedList<Book> bookList;


	public SciFictionShelf(List<Book> bookList)
	{
		this.bookList = new LinkedList<>(bookList);
	}

	@Override
	public void addBook(Book book)
	{
		bookList.add(book);
	}

	@Override
	public void removeBook(int bookId)
	{
       // logic to remove book
	}

	@Override
	public ShelfIterator getShelfIterator()
	{
		return new SciFictionShelfIterator(bookList);
	}
}
