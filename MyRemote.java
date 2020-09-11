import java.rmi.*;

//An interface can't implement anything, but it can extend other interface.
public interface MyRemote extends Remote
{
	public String sayHello() throws RemoteException;

}