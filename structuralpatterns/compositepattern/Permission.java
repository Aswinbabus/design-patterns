package compositepattern;

public class Permission
{
	boolean canRead;
	boolean canWrite;
	boolean canDelete;

	public Permission(boolean canDelete, boolean canRead, boolean canWrite)
	{
		this.canDelete = canDelete;
		this.canRead = canRead;
		this.canWrite = canWrite;
	}

	public boolean isCanDelete()
	{
		return canDelete;
	}

	public boolean isCanRead()
	{
		return canRead;
	}

	public boolean isCanWrite()
	{
		return canWrite;
	}

	public boolean hasPermission(PermissionType permissionType) {

		switch (permissionType)  {

			case READ: return isCanRead();
			case WRITE: return isCanWrite();
			case DELETE: return isCanDelete();

		}

		return false;

	}

	@Override
	public String toString()
	{
		return "Permission{" + "canDelete=" + canDelete + ", canRead=" + canRead + ", canWrite=" + canWrite + '}';
	}
}
