package server.hello;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import common.hello.ICalculadora;
import common.hello.IDivisao;
import common.hello.IMultiplicacao;
import common.hello.ISoma;
import common.hello.ISubtracao;

public class CalculadoraImpl extends UnicastRemoteObject implements ICalculadora {

    private ISoma somaService;
    private ISubtracao subtracaoService;
    private IMultiplicacao multiplicacaoService;
    private IDivisao divisaoService;

    public CalculadoraImpl() throws RemoteException {
        super();
        try {
            somaService = (ISoma) Naming.lookup("rmi://localhost/SomaService");
            subtracaoService = (ISubtracao) Naming.lookup("rmi://localhost/SubtracaoService");
            multiplicacaoService = (IMultiplicacao) Naming.lookup("rmi://localhost/MultiplicacaoService");
            divisaoService = (IDivisao) Naming.lookup("rmi://localhost/DivisaoService");
        } catch (Exception e) {
            System.err.println("Erro ao localizar os serviços de cálculo: " + e.toString());
            e.printStackTrace();
        }
    }

    @Override
    public double somar(double a, double b) throws RemoteException {
        return somaService.somar(a, b);
    }

    @Override
    public double subtrair(double a, double b) throws RemoteException {
        return subtracaoService.subtrair(a, b);
    }

    @Override
    public double multiplicar(double a, double b) throws RemoteException {
        return multiplicacaoService.multiplicar(a, b);
    }

    @Override
    public double dividir(double a, double b) throws RemoteException {
        return divisaoService.dividir(a, b);
    }
}