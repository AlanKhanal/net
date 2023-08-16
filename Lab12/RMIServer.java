import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer extends UnicastRemoteObject implements RMIServerIntf {
    public static final String MESSAGE = "Hello World";
    public RMIServer() throws RemoteException {
    super(0); // required to avoid the &#39;rmic&#39; step, see below
    }
    public String getMessage() {
    return MESSAGE;
    }
    public static void main(String args[]) throws Exception {
    System.out.println("RMI server started");
    try {
        //special exception handler for registry creation

        LocateRegistry.createRegistry(1099);
        System.out.println("java RMI registry created.");
        } catch (RemoteException e) {
        // do nothing, error means registry already exists
        System.out.println("java RMI registry already exists.");
        }
        //Instantiate RmiServer
        RMIServer obj = new RMIServer();
        // Bind this object instance to the name &quot;RmiServer&quot;
        Naming.rebind("//localhost/RMIServer", obj);
        System.out.println("PeerServer bound in registry");
    }
}