package contas;

import java.util.Random;

public class Conta {
    private String cliente;
    private double saldo;

    protected Conta() {
        Random agencia = new Random();
        System.out.println("Agência: " + agencia.nextInt(10000));
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public String getCliente() {
        return this.cliente;
    }

    protected void exibirSaldo() {
        System.out.printf("Saldo: %.2f\n", this.saldo);
    }
    
    void sacar(double valor) {
        saldo -= valor;
    }
    
    void depositar(double valor) {
        saldo += valor;
    }
    
    void transferir(Conta destino, double valor) {
        this.sacar(valor);
        destino.depositar(valor);
    }
    
    double soma (double cc1, double cc2, double cc3) {
        double total = cc1 + cc2 + cc3;
        
        return total;
    }

}