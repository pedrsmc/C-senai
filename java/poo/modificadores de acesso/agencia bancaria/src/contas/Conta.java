package contas;

import java.util.Random;

public class Conta {
    protected String cliente;
    protected double saldo;

    protected Conta(String nome, double saldo) {
        this.cliente = nome;
        this.saldo = saldo;
        
        Random agencia = new Random();
        System.out.println("Agência: " + agencia.nextInt(10000));
    }

    protected void exibirSaldo() {
        System.out.printf("Saldo: %.2f\n", this.saldo);
    }

}