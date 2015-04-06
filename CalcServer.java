import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.Calendar;
import java.util.Locale;

/**
 * Implements the CalcService interface.
 */
public class CalcServer extends UnicastRemoteObject implements CalcService {
	
	public CalcServer() throws RemoteException {
		super();
	}
	
	public int add(int x, int y) {
		return x + y;
	}
	
	public int sub(int x, int y) {
		return x - y;
	}
	
	public int div(int x, int y) {
		return x / y;
	}
	
	public int multiply(int x, int y) {
		return x * y;
	}
}
