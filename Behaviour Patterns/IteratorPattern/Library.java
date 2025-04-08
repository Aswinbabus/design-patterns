package IteratorPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import IteratorPattern.Iterators.UnifiedIterator;

public class Library
{


	private List<ShelfIterator> totalIterator;
	private final ShelfIterator fictionalShelfIterator;
	private final ShelfIterator nonFictionalShelfIterator;
	private final ShelfIterator sciFictionShelfIterator;

	public Library(ShelfIterator fictionalShelfIterator, ShelfIterator nonFictionalShelfIterator, ShelfIterator sciFictionShelfIterator)
	{
		this.fictionalShelfIterator = fictionalShelfIterator;
		this.nonFictionalShelfIterator = nonFictionalShelfIterator;
		this.sciFictionShelfIterator = sciFictionShelfIterator;
		totalIterator = new ArrayList<>(Arrays.asList(fictionalShelfIterator,nonFictionalShelfIterator,sciFictionShelfIterator));
	}

	public ShelfIterator getFictionalShelf()
	{
		return fictionalShelfIterator;
	}

	public ShelfIterator getNonFictionalShelf()
	{
		return nonFictionalShelfIterator;
	}

	public ShelfIterator getSciFictionShelf()
	{
		return sciFictionShelfIterator;
	}

	public ShelfIterator getUnifiedIterator()
	{
		return new UnifiedIterator(totalIterator);
	}
}
