import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {
    public String Reverse (String ch) throws  RemoteException;
    public char MinChar(String ch) throws  RemoteException;
    public String CaseChanger(String ch) throws  RemoteException;
}
