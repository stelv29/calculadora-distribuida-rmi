package server.hello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import common.hello.IMultiplicacao;

public class MultiplicacaoImpl extends UnicastRemoteObject implements IMultiplicacao {

    public MultiplicacaoImpl() throws RemoteException {
        super();
    }

    @Override
    public double multiplicar(double a, double b) throws RemoteException {
        System.out.println("Servidor de Multiplicação: Recebido pedido para multiplicar " + a + " e " + b);
        return a * b;
    }
}