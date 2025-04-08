package IteratorPattern;

public interface Shelf
{

	void addBook(Book book);

	void removeBook(int bookId);

	ShelfIterator getShelfIterator();

	
}
