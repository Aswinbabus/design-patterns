package abstractfactory;

import abstractfactory.azure.AzureFactory;

public class Client
{

	public static void main(String[] args)
	{

		CloudProviderFactory azure = new AzureFactory();

		System.out.println(azure.createBucket());
		System.out.println(azure.createBucket());

		System.out.println(azure.createVMInstance());


	}
}
