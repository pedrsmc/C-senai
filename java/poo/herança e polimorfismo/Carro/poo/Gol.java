package poo;

public class Gol {
    public static void main(String[] args) {
        Carro gol = new Carro(2003, "Vermelho");

        System.out.println("Carro: Gol");
        System.out.println("Ano: " + gol.ano);
        System.out.println("Cor: " + gol.cor);

        gol.ligar();
        gol.acelerar();
        gol.desligar();
    }
}
