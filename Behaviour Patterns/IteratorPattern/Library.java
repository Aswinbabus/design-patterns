package IteratorPattern;

public class Library
{

	private FictionalShelf fictionalShelf;
	private NonFictionalShelf nonFictionalShelf;
	private SciFictionShelf sciFictionShelf;

	public Library(FictionalShelf fictionalShelf, NonFictionalShelf nonFictionalShelf, SciFictionShelf sciFictionShelf)
	{
		this.fictionalShelf = fictionalShelf;
		this.nonFictionalShelf = nonFictionalShelf;
		this.sciFictionShelf = sciFictionShelf;
	}

	public FictionalShelf getFictionalShelf()
	{
		return fictionalShelf;
	}

	public NonFictionalShelf getNonFictionalShelf()
	{
		return nonFictionalShelf;
	}

	public SciFictionShelf getSciFictionShelf()
	{
		return sciFictionShelf;
	}
}
