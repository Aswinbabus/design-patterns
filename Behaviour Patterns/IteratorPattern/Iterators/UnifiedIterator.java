package IteratorPattern.Iterators;

import java.util.List;

import IteratorPattern.Book;
import IteratorPattern.ShelfIterator;

public class UnifiedIterator implements ShelfIterator
{

	private final List<ShelfIterator> iteratorList;
	int currIterator = 0;

	public UnifiedIterator(List<ShelfIterator> iteratorList) {
		this.iteratorList = iteratorList;
	}
	@Override
	public Book nextBook()
	{
		if(!iteratorList.get(currIterator).hasNext()) {
			currIterator++;
			nextBook();
		}

		return iteratorList.get(currIterator).nextBook();
	}

	@Override
	public Book prevBook()
	{
		if(!iteratorList.get(currIterator).hasPrev()) {
			currIterator++;
			nextBook();
		}

		return iteratorList.get(currIterator).prevBook();
	}

	@Override
	public boolean hasNext()
	{
		return currIterator != iteratorList.size() - 1 || iteratorList.get(currIterator).hasNext();
	}

	@Override
	public boolean hasPrev()
	{
		return currIterator != iteratorList.size() - 1 || iteratorList.get(currIterator).hasPrev();
	}
}
