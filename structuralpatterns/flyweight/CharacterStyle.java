package flyweight;

import java.util.Objects;

public class CharacterStyle
{

	private final String fontFamily;
	private final int fontSize;
	private final String color;
	private final boolean bold, italic;

	public CharacterStyle(boolean bold, String fontFamily, int fontSize, String color, boolean italic)
	{
		this.bold = bold;
		this.fontFamily = fontFamily;
		this.fontSize = fontSize;
		this.color = color;
		this.italic = italic;
	}

	public void apply(char character, int x, int y) {
		// draw character at (x, y) using this style
	}

	public boolean isBold()
	{
		return bold;
	}

	public String getColor()
	{
		return color;
	}

	public String getFontFamily()
	{
		return fontFamily;
	}

	public int getFontSize()
	{
		return fontSize;
	}

	public boolean isItalic()
	{
		return italic;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(fontFamily,fontSize,color,bold,italic);
	}
}
