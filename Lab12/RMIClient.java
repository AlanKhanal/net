import java.rmi.Naming;

public class RMIClient {
    public static void main(String args[]) throws Exception {
    RMIServerIntf obj = (RMIServerIntf)Naming.lookup("//localhost/RMIServer");
    System.out.println(obj.getMessage());
    }
}