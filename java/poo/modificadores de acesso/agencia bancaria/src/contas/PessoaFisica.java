package contas;

public class PessoaFisica {
    public static void main(String[] args) {
        Conta cc1 = new Conta("Leonardo", 1250);
        System.out.println("Cliente: " + cc1.cliente);
        cc1.exibirSaldo();
        
        System.out.println();
        
        Conta cc2 = new Conta("Sofia", 4550);
        System.out.println("Cliente: " + cc2.cliente);
        cc2.exibirSaldo();
        
        System.out.println();
        
        Conta cc3 = new Conta("Pedro", 3200);
        System.out.println("Cliente: " + cc3.cliente);
        cc3.exibirSaldo();
    }
}
