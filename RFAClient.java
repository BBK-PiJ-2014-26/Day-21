import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.*;
import java.rmi.RMISecurityManager;
import java.rmi.Naming;
import java.net.MalformedURLException;
import java.rmi.Remote;
import java.rmi.NotBoundException;

public class RFAClient {
	public static void main(String[] args) {
		String s = args[0];
		
		try {
			System.out.println(s);
			Remote service = Naming.lookup("//127.0.0.1:1099/echo");
			RFAService temp = (RFAService) service;
			System.out.println(temp.returnContents(s));
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		} catch (NotBoundException ex) {
			ex.printStackTrace();
		}
	}
}
