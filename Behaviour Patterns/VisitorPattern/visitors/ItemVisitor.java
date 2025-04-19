package VisitorPattern.visitors;

import VisitorPattern.items.Book;
import VisitorPattern.items.Clothing;
import VisitorPattern.items.Electronic;

public interface ItemVisitor<T>
{

	T visit(Book book);

	T visit(Clothing clothing);

	T visit(Electronic electronics);

}
