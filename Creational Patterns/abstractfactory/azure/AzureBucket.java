package abstractfactory.azure;

import abstractfactory.Bucket;

public class AzureBucket implements Bucket
{

	private AzureBucket() {

	}

	static Bucket createInstance() {
		return new AzureBucket();
	}

	@Override
	public Object get(String key)
	{
		// return the object from the bucket using key
		return null;
	}

	@Override
	public void put(String key, Object value)
	{
		// add the key and object to the bucket
	}
}
