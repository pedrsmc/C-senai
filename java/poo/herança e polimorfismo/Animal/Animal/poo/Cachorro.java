package poo;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    public void emitirSom() {
        System.out.println("Au Au!");
    }

    public static void main(String[] args) {
        Cachorro cao = new Cachorro("Bulldog");
        Animal animal = new Animal("Cachorro");

        cao.emitirSom();
    }
}
