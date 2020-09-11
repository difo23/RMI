// the Naming class (fir doing the remiregistry lookup) is in the java.rmi package
import java.rmi.*;

public class MyRemoteClient 
{
	public static void main (String[] args)
	{
		new MyRemoteClient().go();
	}

	public void go()
	{
		try
		{
			//(MyRemote)it comes out of the registry as type Object, so don't forget the cast
			MyRemote service= (MyRemote) Naming.lookup("rmi://127.0.0.1/Remote_Hello");
			// you need the IP address or hostname, And the name used to bind/rebind the service
			String s= service.sayHello();
			//it looks just like a regular old method call? (Except it must acknowledge the RemoteException)
			System.out.println(s);
		} 
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}