package abstractfactory.azure;

import abstractfactory.VMInstance;

public class AzureVMInstance implements VMInstance
{

	private AzureVMInstance() {

	}

	static VMInstance createInstance() {
		return new AzureVMInstance();
	}

	@Override
	public void start()
	{
		// start the vm
	}

	@Override
	public void stop()
	{
		// stop the vm
	}

}
