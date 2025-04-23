package proxypattern;

public class CacheFileServerProxy implements FileService
{

	private final FileCache fileCache;
	private final FileService fileService;

	public CacheFileServerProxy() {
		this.fileService = new RemoteFileServer();
		this.fileCache = new FileCache();
	}

	@Override
	public File getFile(String fileName, User user)
	{
		File file = fileCache.getFile(fileName);

		if(file == null) {
			file = fileService.getFile(fileName,user);
			fileCache.cacheFile(fileName, file);
		}

		return file;
	}
}
