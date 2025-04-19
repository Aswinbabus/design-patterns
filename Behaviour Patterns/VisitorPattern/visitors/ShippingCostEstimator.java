package VisitorPattern.visitors;

import VisitorPattern.items.Book;
import VisitorPattern.items.Clothing;
import VisitorPattern.items.Electronic;

public class ShippingCostEstimator implements ItemVisitor<Integer>
{
	@Override
	public Integer visit(Book book)
	{
		return 10;
	}

	@Override
	public Integer visit(Clothing clothing)
	{
		return 25 * clothing.getQuantity();
	}

	@Override
	public Integer visit(Electronic electronics)
	{
		return 50 + 20 * electronics.getQuantity();
	}
}
