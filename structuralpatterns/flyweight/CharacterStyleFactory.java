package flyweight;

import java.util.HashMap;
import java.util.Map;

import facadepattern.DeploymentFacade;

public class CharacterStyleFactory
{

	private static Map<String,CharacterStyle> characterStyleMap = new HashMap<>();
    private static String DELIMITER = "|";

	private CharacterStyleFactory() {}

	public static CharacterStyle getCharacterStyle(String fontFamily,int fontSize,String color,boolean bold,boolean italic) {

		String key = buildKey(fontFamily, fontSize, color, bold, italic);
		if(!characterStyleMap.containsKey(key)) {
			characterStyleMap.put(key, new CharacterStyle(bold, fontFamily, fontSize, color, italic));
		}

		return characterStyleMap.get(key);


	}

	public static String buildKey(String fontFamily,int fontSize,String color,boolean bold,boolean italic) {

		return fontFamily + DELIMITER + fontSize + DELIMITER + color + DELIMITER + bold + DELIMITER + italic;

	}


}
