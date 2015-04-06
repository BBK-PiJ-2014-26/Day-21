import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.*;
import java.rmi.RMISecurityManager;
import java.rmi.Naming;
import java.net.MalformedURLException;
import java.rmi.Remote;
import java.rmi.NotBoundException;

public class EchoClient {
	
	public static void main(String[] args) {
		// 1. If there is no security manager, start one
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		try {
			Remote service = Naming.lookup("//127.0.0.1:7/echo");
			EchoService echoService = (EchoService) service;;
			String receivedEcho = echoService.echo("Hello!");
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		} catch (NotBoundException ex) {
			ex.printStackTrace();
		}
	}

}
