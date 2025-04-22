package VisitorPattern.visitors;

import VisitorPattern.items.Book;
import VisitorPattern.items.Clothing;
import VisitorPattern.items.Electronic;

public class DiscountCalculator implements ItemVisitor<Double>
{

	@Override
	public Double visit(Book book)
	{
		if(book.getQuantity() > 2) {
			return book.getPrice() * 20 / 100;
		}

		return 0.0;
	}

	@Override
	public Double visit(Electronic electronic)
	{
		if(electronic.getPrice() > 5000) {
			return electronic.getPrice() * 5 / 100;
		}

		return 0.0;
	}

	@Override
	public Double visit(Clothing clothing)
	{
		if(clothing.getQuantity() > 5) {
			return clothing.getPrice() * 20 / 100;
		}

		return 0.0;
	}

}
