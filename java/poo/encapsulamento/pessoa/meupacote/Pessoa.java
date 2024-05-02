package meupacote;

public class Pessoa {
    private String nome;
    private String genero;
    private int idade;

    public String mostrarNome() {
        return nome;
    }

    public void definirNome(String nome) {
        this.nome = nome;
    }

    public String mostrarGenero() {
        return genero;
    }

    public void definirGenero(String genero) {
        this.genero = genero;
    }

    public int mostrarIdade() {
        return idade;
    }
    
    public void definirIdade(int idade) {
        this.idade = idade;
    }
}
