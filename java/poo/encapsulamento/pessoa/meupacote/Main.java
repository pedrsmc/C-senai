package meupacote;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.definirNome("Leonardo");
        pessoa.definirGenero("Masculino");
        pessoa.definirIdade(25);

        System.out.println(pessoa.mostrarNome());
        System.out.println(pessoa.mostrarGenero());
        System.out.println(pessoa.mostrarIdade());
    }
}
