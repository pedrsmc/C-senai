package entities;

public class Veiculo {
    // Atributos privados da classe Veiculo
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    // Construtor padrão da classe Veiculo
    public Veiculo() {
    }

    // Métodos Get e Set para o atributo 'marca'
    public String GetMarca() {
        return this.marca;
    }

    public void SetMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    // Métodos Get e Set para o atributo 'modelo'
    public String GetModelo() {
        return this.modelo;
    }

    public void SetModelo(String novoModelo) {
        this.modelo = novoModelo;
    }

    // Métodos Get e Set para o atributo 'ano'
    public int GetAno() {
        return this.ano;
    }

    public void SetAno(int novoAno) {
        this.ano = novoAno;
    }

    // Métodos Get e Set para o atributo 'preco'
    public double GetPreco() {
        return this.preco;
    }

    public void SetPreco(double novoPreco) {
        this.preco = novoPreco;
    }
}
