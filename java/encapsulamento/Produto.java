public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto() {
        this.nome = "Refrigerante";
        this.preco = 7.50;
        this.quantidadeEstoque = 100;
    }

    public void adicionarEstoque(int quantidadeProduto) {
        this.quantidadeEstoque += quantidadeProduto;
    }

    public void removerEstoque(int quantidadeProduto) {
        this.quantidadeEstoque -= quantidadeProduto;
    }

    public void atualizarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.printf("Preço: %.2f\n", this.preco);
        System.out.println("Quantidade: " + this.quantidadeEstoque);
    }

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.adicionarEstoque(10);
        produto.removerEstoque(5);
        produto.atualizarPreco(9.90);
        produto.mostrarDados();
    }

}
