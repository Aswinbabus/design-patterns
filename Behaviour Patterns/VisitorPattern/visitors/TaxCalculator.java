package VisitorPattern.visitors;

import VisitorPattern.items.Book;
import VisitorPattern.items.Clothing;
import VisitorPattern.items.Electronic;

public class TaxCalculator implements ItemVisitor<Double>
{
	@Override
	public Double visit(Book book)
	{
		return 0.0;
	}

	@Override
	public Double visit(Clothing clothing)
	{
		return clothing.getPrice() * 5 / 100;
	}

	@Override
	public Double visit(Electronic electronics)
	{
		return electronics.getPrice() * 18 / 100;
	}
}
