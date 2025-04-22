package abstractfactory.gcp;

import abstractfactory.Bucket;
import abstractfactory.CloudProviderFactory;
import abstractfactory.VMInstance;

public class GcpFactory implements CloudProviderFactory
{

	@Override
	public Bucket createBucket()
	{
		return GcpBucket.createInstance();
	}

	@Override
	public VMInstance createVMInstance()
	{
		return GcpVMInstance.createInstance();
	}
}
