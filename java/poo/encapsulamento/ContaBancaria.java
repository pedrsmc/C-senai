package encapsulamento;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0.0;
    }

    public double verificarSaldo() {
        return saldo;
    }
    
    public void depositar(double saldo) {
        this.saldo += saldo;
    }

    public void sacar(double saldo) {
        this.saldo -= saldo;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.depositar(100);
        conta.sacar(50);

        System.out.println(conta.verificarSaldo());
    }
}
