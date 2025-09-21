
package common.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ISoma extends Remote {
    double somar(double a, double b) throws RemoteException;
}