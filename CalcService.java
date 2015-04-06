import java.rmi.Remote;
import java.rmi.RemoteException;

/**
* An implementation of the echo service.
*/
public interface CalcService extends Remote {

	/**
	* Returns the same string passed as parameter
	* @param x, y a string
	* @return the result
	 */
	public int add(int x, int y) throws RemoteException;
	
	public int sub(int x, int y)  throws RemoteException;
	
	public int div(int x, int y) throws RemoteException;
	
	public int multiply(int x, int y) throws RemoteException;
}
