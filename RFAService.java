import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * RFA stands for Remote File Access.
 */
public interface RFAService extends Remote {

	public String returnContents(String address) throws RemoteException;

}
