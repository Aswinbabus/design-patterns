package compositepattern;

import java.util.List;
import java.util.Map;

public class Folder extends Entity
{

	List<Entity> entities;

	public Folder(String folderName,List<Entity> entities)
	{
		super(folderName);
		this.entities = entities;
	}

	@Override
	public void grantPermission(String userId, Permission permission)
	{
		entities.forEach(entity -> entity.grantPermission(userId,permission));
	}

	@Override
	public void revokePermission(String userId, Permission permission)
	{
	     entities.forEach(entity -> entity.revokePermission(userId,permission));
	}

	@Override
	public void printPermissions(String indent)
	{
		System.out.println("Folder -  " + super.getName() + " - Permissions");
		entities.forEach(entity -> entity.printPermissions(indent));

	}
}
