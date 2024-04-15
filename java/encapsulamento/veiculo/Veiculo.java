package teste.veiculo;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    public Veiculo() {
    }

    public String GetMarca() {
        return this.marca;
    }

    public void SetMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    public String GetModelo() {
        return this.modelo;
    }

    public void SetModelo(String novoModelo) {
        this.modelo = novoModelo;
    }

    public int GetAno() {
        return this.ano;
    }

    public void SetAno(int novoAno) {
        this.ano = novoAno;
    }

    public double GetPreco() {
        return this.preco;
    }

    public void SetPreco(double novoPreco) {
        this.preco = novoPreco;
    }
}
