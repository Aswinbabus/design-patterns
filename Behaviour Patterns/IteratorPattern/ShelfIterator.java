package IteratorPattern;

public interface ShelfIterator
{
	Book nextBook();
	Book prevBook();
	boolean hasNext();
	boolean hasPrev();
}
