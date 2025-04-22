package abstractfactory.gcp;

import abstractfactory.VMInstance;

public class GcpVMInstance implements VMInstance
{


	private GcpVMInstance() {

	}

	static VMInstance createInstance() {
		return new GcpVMInstance();
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
