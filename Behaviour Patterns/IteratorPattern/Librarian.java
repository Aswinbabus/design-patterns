package IteratorPattern;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import IteratorPattern.Iterators.FictionalShelfIterator;
import IteratorPattern.Iterators.NonFictionalShelfIterator;
import IteratorPattern.Iterators.SciFictionShelfIterator;
import IteratorPattern.Shelfs.FictionalShelf;
import IteratorPattern.Shelfs.NonFictionalShelf;
import IteratorPattern.Shelfs.SciFictionShelf;

public class Librarian
{

	public static void main(String[] args)
	{

		Book book1 = new Book(1,"name1","book1","author1",2000);
		Book book2 = new Book(2,"name1","book1","author1",2000);
		Book book3 = new Book(3,"name1","book1","author1",2000);
		Book book4 = new Book(4,"name1","book1","author1",2000);

		List list = Arrays.asList(book1,book2,book3,book4);

		FictionalShelf fictionalShelf = new FictionalShelf(list);
		NonFictionalShelf nonFictionalShelf = new NonFictionalShelf(list);
		SciFictionShelf sciFictionShel = new SciFictionShelf(list);

		Library library = new Library(fictionalShelf.getShelfIterator(), nonFictionalShelf.getShelfIterator(), sciFictionShel.getShelfIterator());

		assert library.getFictionalShelf().nextBook() == book2;
		assert library.getFictionalShelf().prevBook() == book1;

		assert library.getNonFictionalShelf().nextBook() == book2;
		assert library.getNonFictionalShelf().prevBook() == book1;

		assert library.getSciFictionShelf().nextBook() == book1;
		assert library.getSciFictionShelf().prevBook() == book1;


	}

}
