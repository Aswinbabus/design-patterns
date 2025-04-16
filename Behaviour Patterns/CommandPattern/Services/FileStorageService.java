package CommandPattern.Services;

import java.util.Random;

public class FileStorageService
{

	public int storeFile(String content) {
		// store the file
		return new Random().nextInt(500000);
	}

	public boolean removeFile(int fileUID) {
		// remove the file
		return true;
	}

}
