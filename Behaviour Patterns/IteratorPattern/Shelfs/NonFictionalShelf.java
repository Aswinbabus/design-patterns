package IteratorPattern.Shelfs;

import java.util.Arrays;
import java.util.List;

import IteratorPattern.Book;
import IteratorPattern.Iterators.NonFictionalShelfIterator;
import IteratorPattern.Shelf;
import IteratorPattern.ShelfIterator;

public class NonFictionalShelf implements Shelf
{

	private Book[] books;

	public NonFictionalShelf(List<Book> bookList) {
		if(!bookList.isEmpty()){
			books = new Book[bookList.size()];
			for(int i = 0;i<bookList.size();i++) {
				books[i] = bookList.get(i);
			}
		}
	}

	@Override
	public void addBook(Book book)
	{
		 // iterate and add logic
	}

	@Override
	public void removeBook(int bookId)
	{

		 // iterate remoke at given index
	}

	@Override
	public ShelfIterator getShelfIterator()
	{
		return new NonFictionalShelfIterator(books);
	}
}
