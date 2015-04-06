import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.*;
import java.rmi.RMISecurityManager;
import java.rmi.Naming;
import java.net.MalformedURLException;

public class RFALauncher {
	
	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1099);
			RFAServer server = new RFAServer();
			String registryHost = "//localhost/";
			String serviceName = "echo";
			Naming.rebind(registryHost + serviceName, server);
			System.out.println("Server is ready.");
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		}
	}
}
