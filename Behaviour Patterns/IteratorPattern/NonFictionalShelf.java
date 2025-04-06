package IteratorPattern;

public class NonFictionalShelf implements ShelfIterator
{
	private Book[] books;
	private int currBook;

	public NonFictionalShelf(Book[] books)
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
}
