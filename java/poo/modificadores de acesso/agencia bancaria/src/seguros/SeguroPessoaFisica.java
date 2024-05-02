package seguros;

import contas.Conta;

public class SeguroPessoaFisica extends Conta{

    public SeguroPessoaFisica(String nome, double saldo) {
        super(nome,saldo);
    }
    public static void main(String[] args) {
        SeguroPessoaFisica cc4 = new SeguroPessoaFisica("Jamile", 3200);
        System.out.println("Cliente: " + cc4.cliente);
        cc4.exibirSaldo();
        
        System.out.println();

        SeguroPessoaFisica cc5 = new SeguroPessoaFisica("João", 2350);
        System.out.println("Cliente: " + cc5.cliente);
        cc5.exibirSaldo();
    }
}
