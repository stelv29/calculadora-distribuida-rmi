package client.hello;

import java.rmi.Naming;

import common.hello.ICalculadora;

public class Client {
    public static void main(String[] args) {
        try {
            // Procura pelo serviço "CalculadoraService" no RMI Registry do localhost
            ICalculadora calculadora = (ICalculadora) Naming.lookup("rmi://localhost/CalculadoraService");

            // Define alguns números para testar
            double a = 20;
            double b = 4;

            System.out.println("A conectar ao Servidor Calculadora...");
            
            // Chama os métodos remotos como se fossem locais
            double resultadoSoma = calculadora.somar(a, b);
            System.out.println("Resultado da Soma (" + a + " + " + b + "): " + resultadoSoma);

            double resultadoSubtracao = calculadora.subtrair(a, b);
            System.out.println("Resultado da Subtração (" + a + " - " + b + "): " + resultadoSubtracao);

            double resultadoMultiplicacao = calculadora.multiplicar(a, b);
            System.out.println("Resultado da Multiplicação (" + a + " * " + b + "): " + resultadoMultiplicacao);

            double resultadoDivisao = calculadora.dividir(a, b);
            System.out.println("Resultado da Divisão (" + a + " / " + b + "): " + resultadoDivisao);

        } catch (Exception e) {
            System.err.println("Erro no Cliente: " + e.toString());
            e.printStackTrace();
        }
    }
}
