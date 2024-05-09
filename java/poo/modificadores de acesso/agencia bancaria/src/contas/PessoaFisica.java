package contas;

public class PessoaFisica {
    public static void main(String[] args) {
        Conta cc1 = new Conta();
        cc1.setCliente("Leonardo");
        cc1.setSaldo(5000);
       
        cc1.sacar(500);
        cc1.depositar(300);
        
        System.out.println("Cliente: " + cc1.getCliente());
        System.out.println("R$ " + cc1.getSaldo());
        
        Conta cc2 = new Conta();
        cc2.setCliente("Josué");
        cc2.setSaldo(2000);
        
        System.out.println("Cliente: " + cc2.getCliente());
        System.out.println("R$ " + cc2.getSaldo());
        
        Conta cc3 = new Conta();
        cc3.setCliente("Maria");
        cc3.setSaldo(3900);
       
        System.out.println("Cliente: " + cc3.getCliente());
        System.out.println("R$ " + cc3.getSaldo());
        
        System.out.println("\n-----------------------------------");
        System.out.println("Transferência:\n");
        System.out.println("Cliente: " + cc1.getCliente());
        System.out.println("Favorecido: " + cc2.getCliente());
        cc1.transferir(cc2,1500);
        System.out.println("-----------------------------------\n");
        
        
        System.out.println("\n-----------------------------------");
        System.out.println("Relatório Gerencial:\n");
        Conta gerente = new Conta();
        double relatorio = gerente.soma(cc1.getSaldo(), cc2.getSaldo(), cc3.getSaldo());
        System.out.println("Saldo total nas contas: " + relatorio);
        System.out.println("-----------------------------------\n");
    }
}