package abstractfactory.gcp;

import java.util.HashMap;

import abstractfactory.Bucket;

public class GcpBucket implements Bucket
{

	private GcpBucket() {

	}

	static Bucket createInstance() {
		return new GcpBucket();
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
