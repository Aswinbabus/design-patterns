package abstractfactory.azure;

import abstractfactory.Bucket;
import abstractfactory.CloudProviderFactory;
import abstractfactory.VMInstance;

public class AzureFactory implements CloudProviderFactory
{

	@Override
	public Bucket createBucket()
	{
		return AzureBucket.createInstance();
	}

	@Override
	public VMInstance createVMInstance()
	{
		return AzureVMInstance.createInstance();
	}
}
