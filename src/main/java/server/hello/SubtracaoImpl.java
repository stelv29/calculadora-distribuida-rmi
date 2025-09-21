package server.hello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import common.hello.ISubtracao;

public class SubtracaoImpl extends UnicastRemoteObject implements ISubtracao {

    public SubtracaoImpl() throws RemoteException {
        super();
    }

    @Override
    public double subtrair(double a, double b) throws RemoteException {
        System.out.println("Servidor de Subtração: Recebido pedido para subtrair " + a + " e " + b);
        return a - b;
    }
}