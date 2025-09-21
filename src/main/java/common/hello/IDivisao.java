package common.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IDivisao extends Remote {
    double dividir(double a, double b) throws RemoteException;
}