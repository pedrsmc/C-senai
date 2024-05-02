package poo;

public class Aviao extends Carro {
    double envergadura;

    public Aviao(int ano, String cor, double envergadura) {
        super(ano, cor);
        this.envergadura = envergadura;
    }

    void aterrizar(){
         System.out.println("-------__________");
    }

    void acelerar(){
         System.out.println("________--------");
    }
}
