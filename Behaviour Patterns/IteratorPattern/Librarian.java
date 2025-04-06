package IteratorPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Librarian
{

	public static void main(String[] args)
	{

		Book book1 = new Book("book1","author1",2000);
		Book book2 = new Book("book1","author1",2000);
		Book book3 = new Book("book1","author1",2000);
		Book book4 = new Book("book1","author1",2000);

		List list = Arrays.asList(book1,book2,book3,book4);

		FictionalShelf fictionalShelf = new FictionalShelf(list);
		NonFictionalShelf nonFictionalShelf = new NonFictionalShelf(new Book[]{book1,book2,book3});
		SciFictionShelf sciFictionShelf = new SciFictionShelf(new LinkedList<>(list));

		Library library = new Library(fictionalShelf,nonFictionalShelf,sciFictionShelf);

		assert library.getFictionalShelf().nextBook() == book2;
		assert library.getFictionalShelf().prevBook() == book1;

		assert library.getNonFictionalShelf().nextBook() == book2;
		assert library.getNonFictionalShelf().prevBook() == book1;

		assert library.getSciFictionShelf().nextBook() == book1;
		assert library.getSciFictionShelf().prevBook() == book1;


	}

}
