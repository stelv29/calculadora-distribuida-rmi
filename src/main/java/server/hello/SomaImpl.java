package server.hello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import common.hello.ISoma; 


public class SomaImpl extends UnicastRemoteObject implements ISoma {

    
    public SomaImpl() throws RemoteException {
        super();
    }

    
    @Override
    public double somar(double a, double b) throws RemoteException {
        System.out.println("Servidor de Soma: Recebido pedido para somar " + a + " e " + b);
        return a + b;
    }
}