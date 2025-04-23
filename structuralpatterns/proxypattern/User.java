package proxypattern;

public class User
{
	private final String userId;
    private final boolean hasAccessToFileServer;

	public User(String userId,boolean hasAccessToFileServer)
	{
		this.userId = userId;
		this.hasAccessToFileServer = hasAccessToFileServer;
	}

	public String getUserId()
	{
		return userId;
	}

	public boolean isHasAccessToFileServer()
	{
		return hasAccessToFileServer;
	}

	@Override
	public String toString()
	{
		return "User{" + "userId='" + userId + '\'' + ", hasAccessToFileServer=" + hasAccessToFileServer + '}';
	}
}
