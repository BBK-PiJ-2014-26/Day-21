import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.Calendar;
import java.util.Locale;

/**
 * Implements the DateService interface.
 */
public class DateServer extends UnicastRemoteObject implements DateService {
	
	public DateServer() throws RemoteException {
		super();
	}
	
	public String date() throws RemoteException {
		Calendar date = Calendar.getInstance();
		Date now = date.getTime();
		String result = now.toString();
		return result;
	}
}
