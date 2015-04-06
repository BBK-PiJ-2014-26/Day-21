import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DateService extends Remote {

	/**
	 * @return the current date and time.
	 * @throws RemoteException.
	 */
	public String date() throws RemoteException;
}
