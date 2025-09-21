package common.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMultiplicacao extends Remote {
    double multiplicar(double a, double b) throws RemoteException;
}