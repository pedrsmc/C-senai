package seguros;

import contas.Conta;

public class SeguroPessoaFisica extends Conta {
    public SeguroPessoaFisica() {
    }
    
    public static void main(String[] args) {
        SeguroPessoaFisica cc4 = new SeguroPessoaFisica();
        cc4.setCliente("Jamile");
        cc4.setSaldo(3200);
        
        System.out.println("Cliente: " + cc4.getCliente());
        cc4.exibirSaldo();
        
        System.out.println();

        SeguroPessoaFisica cc5 = new SeguroPessoaFisica();
        cc5.setCliente("Carlos");
        cc5.setSaldo(4900);
        System.out.println("Cliente: " + cc5.getCliente());
        cc5.exibirSaldo();
    }
}