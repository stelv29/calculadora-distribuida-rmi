package common.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ISubtracao extends Remote {
    double subtrair(double a, double b) throws RemoteException;
}