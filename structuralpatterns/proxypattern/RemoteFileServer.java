package proxypattern;

public class RemoteFileServer implements FileService
{

	@Override
	public File getFile(String fileName, User user)
	{

		// fetch the file content from remote server
		File file = new File(fileName);
		file.loadContent("content");
		return file;

	}
}
