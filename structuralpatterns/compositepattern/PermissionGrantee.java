package compositepattern;

public interface PermissionGrantee {
	void grantPermission(String userId, Permission permission);
	void revokePermission(String userId, Permission permission);
	void printPermissions(String indent);
	boolean hasPermission(String userId,PermissionType permissionType);
}