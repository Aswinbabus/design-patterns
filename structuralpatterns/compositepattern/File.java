package compositepattern;

import java.util.HashMap;
import java.util.Map;

public class File extends Entity
{


	public File(String fileName)
	{
		super(fileName);
	}

	@Override
	public void printPermissions(String indent)
	{
		if(!super.getPermissions().isEmpty())
		{
			System.out.println("\nFile -  " + super.getName() + " - Permissions");
			super.getPermissions().forEach((userId, permission) -> System.out.println(userId + " - " + permission));
		}
	}
}
