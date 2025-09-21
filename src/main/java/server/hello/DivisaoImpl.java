package server.hello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import common.hello.IDivisao;

public class DivisaoImpl extends UnicastRemoteObject implements IDivisao {

    public DivisaoImpl() throws RemoteException {
        super();
    }

    @Override
    public double dividir(double a, double b) throws RemoteException {
        System.out.println("Servidor de Divisão: Recebido pedido para dividir " + a + " e " + b);
        // Adicionando uma verificação para evitar divisão por zero
        if (b == 0) {
            throw new RemoteException("Não é possível dividir por zero.");
        }
        return a / b;
    }
}