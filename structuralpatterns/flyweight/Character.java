package flyweight;

public class Character
{

	private CharacterStyle characterStyle;
	private char character;
	private int x,y;

	public Character(char character,boolean bold, String fontFamily, int fontSize, String color, boolean italic, int x, int y)
	{
		this.characterStyle = CharacterStyleFactory.getCharacterStyle(fontFamily, fontSize, color, bold, italic);
		this.character = character;
		this.x = x;
		this.y = y;
	}

	public char getCharacter()
	{
		return character;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public void setX(int x)
	{
		this.x = x;
	}

	public void setY(int y)
	{
		this.y = y;
	}

	public CharacterStyle getCharacterStyle()
	{
		return characterStyle;
	}

	public void apply() {
		this.characterStyle.apply(getCharacter(),getX(),getY());
	}
}
