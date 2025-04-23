package flyweight;



public class Editor
{


	public static void main(String[] args)
	{

		Character a = new Character('a',true,"Ariel",34,"red",true,3,4);
		Character b = new Character('b',true,"Ariel",34,"red",true,3,4);
		Character c = new Character('c',false,"Ariel",34,"red",true,3,4);
		Character d = new Character('d',false,"Ariel",35,"red",true,3,4);

		System.out.println(a.getCharacterStyle().equals(b.getCharacterStyle()));
		System.out.println(c.getCharacterStyle().equals(d.getCharacterStyle()));

	}

}



