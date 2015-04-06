import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.*;
import java.rmi.RMISecurityManager;
import java.rmi.Naming;
import java.net.MalformedURLException;
import java.rmi.Remote;
import java.rmi.NotBoundException;

public class DateClient {
	public static void main(String[] args) {
		try {
			Remote service = Naming.lookup("//127.0.0.1:1099/echo");
			DateService currentDate = (DateService) service;
			System.out.println(currentDate.date());
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		} catch (NotBoundException ex) {
			ex.printStackTrace();
		}
	}
}
