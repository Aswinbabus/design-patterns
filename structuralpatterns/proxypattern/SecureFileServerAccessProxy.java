package proxypattern;

import java.time.LocalTime;

public class SecureFileServerAccessProxy implements FileService
{

	private final FileService fileService;
	private final AccessLogger accessLogger;

	public SecureFileServerAccessProxy() {
		fileService = new CacheFileServerProxy();
		accessLogger = new AccessLogger();
	}

	@Override
	public File getFile(String fileName, User user)
	{

		File file = null;
		if(authenticateUser(user)) {

			file = fileService.getFile(fileName,user);
			accessLogger.log(user, LocalTime.now(),file);

		}
		else {
			System.out.println("Unauthorized User");
		}

		return file;

	}

	private boolean authenticateUser(User user)
	{

		return user.isHasAccessToFileServer();

	}

}
