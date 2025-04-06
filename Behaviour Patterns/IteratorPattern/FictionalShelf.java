package IteratorPattern;

import java.util.List;

public class FictionalShelf implements ShelfIterator
{
	private final List<Book> bookList;
    private int currBook;

	public FictionalShelf(List<Book> bookList)
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
}
