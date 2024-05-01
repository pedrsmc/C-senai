package poo;

public class Lamborghini {
    
    public static void main(String[] args) {
        Carro lamborghini = new Carro(2024, "Amarelo");

        System.out.println("Carro: Lamborghini");
        System.out.println("Ano: " + lamborghini.ano);
        System.out.println("Cor: " + lamborghini.cor);

        lamborghini.ligar();
        lamborghini.acelerar();
        lamborghini.desligar();
    }
}
