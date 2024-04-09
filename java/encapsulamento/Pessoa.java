public class Pessoa {
    private String nome;
    private String genero;
    private int idade;

    public Pessoa() {
        this.nome = "Leonardo";
        this.genero = "Masculino";
        this.idade = 25;
    }

    public String mostrarNome() {
        return this.nome;
    }

    public void definirNome(String nome) {
        this.nome = nome;
    }
    public String mostrarGenero() {
        return genero;
    }

    public void definirGenero(String nome) {
        this.nome = genero;
    }

    public int mostrarIdade() {
        return idade;
    }
    
    public void definirIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        System.out.println(pessoa.mostrarNome());
        System.out.println(pessoa.mostrarGenero());
        System.out.println(pessoa.mostrarIdade());
    }
}
