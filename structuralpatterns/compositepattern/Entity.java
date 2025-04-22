package compositepattern;

import java.util.HashMap;
import java.util.Map;

public abstract class Entity implements PermissionGrantee
{

	private final String name;
	private final Map<String,Permission> userPermissions;


	public Entity(String name)
	{
		this.name = name;
		userPermissions = new HashMap<>();
	}

	@Override
	public void grantPermission(String userId, Permission permission)
	{
		userPermissions.put(userId,permission);
	}

	@Override
	public void revokePermission(String userId, Permission permission)
	{
        userPermissions.remove(userId);
	}

	public Map<String,Permission> getPermissions() {
		return this.userPermissions;
	}

	@Override
	public boolean hasPermission(String userId, PermissionType permissionType)
	{
		Permission permission = userPermissions.get(userId);
		if(permission != null)
		{
			return permission.hasPermission(permissionType);
		}
		return false;
	}

	public String getName() {
		return name;
	}
}
