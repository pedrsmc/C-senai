package contas;

public class PessoaFisica {
    public static void main(String[] args) {
        Conta cc1 = new Conta();
        cc1.cliente = "Leonardo";
        cc1.saldo = 5000;
       
        cc1.sacar(500);
        cc1.depositar(300);
        
        System.out.println("Cliente: " + cc1.cliente);
        System.out.println("R$ " + cc1.saldo);
        
        Conta cc2 = new Conta();
        cc2.cliente = "Josué";
        cc2.saldo = 3500;
        
        System.out.println("Cliente: " + cc2.cliente);
        System.out.println("R$ " + cc2.saldo);
        
        Conta cc3 = new Conta();
        cc3.cliente = "Maria";
        cc3.saldo = 2500;
       
        System.out.println("Cliente: " + cc3.cliente);
        System.out.println("R$ " + cc3.saldo);
        
        System.out.println("\n-----------------------------------");
        System.out.println("Transferência:\n");
        System.out.println("Cliente: " + cc1.cliente);
        System.out.println("Favorecido: " + cc2.cliente);
        cc1.transferir(cc2,1500);
        System.out.println("-----------------------------------\n");
        
        
        System.out.println("\n-----------------------------------");
        System.out.println("Relatório Gerencial:\n");
        Conta gerente = new Conta();
        double relatorio = gerente.soma(cc1.saldo, cc2.saldo);
        System.out.println("Saldo total nas contas: " + relatorio);
        System.out.println("-----------------------------------\n");
    }
}