import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.Calendar;
import java.util.Locale;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Implements the RFAService interface.
 */
public class RFAServer extends UnicastRemoteObject implements RFAService {
	
	public RFAServer() throws RemoteException {
		super();
	}
	
	public String returnContents(String address) {
		File f = new File(address);
		String result = "";
		if (f.exists()) {
			
			try {
				BufferedReader r = new BufferedReader(new FileReader(f));
				String line =  r.readLine();
				while (line !=null) {
					result = result + " " + line + "\n";
					line = r.readLine();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}
}
