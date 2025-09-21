package server.hello;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import common.hello.IMultiplicacao;

public class MultiplicacaoServer {
    public static void main(String[] args) {
        try {
            IMultiplicacao servico = new MultiplicacaoImpl();
            String nomeServico = "MultiplicacaoService";

            try {
                LocateRegistry.createRegistry(1099);
                System.out.println("RMI Registry foi criado na porta 1099.");
            } catch (java.rmi.server.ExportException e) {
                System.out.println("RMI Registry já está a correr.");
            }

            Naming.rebind(nomeServico, servico);

            System.out.println("Servidor " + nomeServico + " está pronto e registado.");

        } catch (Exception e) {
            System.err.println("Erro geral no Servidor: " + e.toString());
            e.printStackTrace();
        }
    }
}