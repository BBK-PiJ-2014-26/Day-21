import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.*;
import java.rmi.RMISecurityManager;
import java.rmi.Naming;
import java.net.MalformedURLException;
import java.rmi.Remote;
import java.rmi.NotBoundException;

public class CalcClient {
	public static void main(String[] args) {
		Integer x = Integer.valueOf(args[0]);
		Integer y = Integer.valueOf(args[1]);
		try {
			Remote service = Naming.lookup("//127.0.0.1:1099/echo");
			CalcService temp = (CalcService) service;
			System.out.println("Add equals " + temp.add(x.intValue(), y.intValue()));
			System.out.println("Subtract equals " + temp.sub(x.intValue(), y.intValue()));
			System.out.println("Divide equals " + temp.div(x.intValue(), y.intValue()));
			System.out.println("Multiply equals " + temp.multiply(x.intValue(), y.intValue()));
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		} catch (NotBoundException ex) {
			ex.printStackTrace();
		}
	}
}
