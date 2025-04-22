package abstractfactory;

public interface CloudProviderFactory
{

	VMInstance createVMInstance();
	Bucket createBucket();

}
