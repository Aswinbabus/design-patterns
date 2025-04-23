package proxypattern;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FileCache
{
	private Map<String,File> fileCache;
	private final int CACHE_LIMIT = 100;
	public FileCache() {
		fileCache = new LinkedHashMap<>();
	}

	void cacheFile(String name,File file) {

		if(fileCache.size() >= CACHE_LIMIT) {

			// remove the oldest file from the cache
			String oldestFileName = fileCache.keySet().iterator().next();
			fileCache.remove(oldestFileName);
		}

		fileCache.put(name,file);
	}

	File getFile(String name) {
		return fileCache.get(name);
	}



}
