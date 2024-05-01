package encapsulamento;

import java.util.ArrayList;
import java.util.Arrays;

public class Aluno {
    // Criando os atributos do objeto
    private String nome;
    private String matricula;
    private ArrayList<Double> notas = new ArrayList<>();
    private double media;

    public Aluno() {
        // Estabelecendo valores padrão
        this.nome = "João";
        this.matricula = "123456";
        this.notas.addAll(Arrays.asList(0.0, 0.0, 0.0, 0.0));
        this.media = 0.0;
    }

    public void adicionarNotas(double[] novasNotas) {
        // Função que recebe 4 novas notas, substituindo as notas antigas
        for (int i = 0; i < notas.size(); i++) {
            notas.set(i, novasNotas[i]);
        }
    }

    public void removerNotas(int indice) {
        // Função que reseta a nota escolhida através do índice
        notas.set(indice - 1, 0.0);
    }

    public Double calcularMedia() {
        // Função que calcula a média das notas
        double soma = 0.0;

        for (int i = 0; i < notas.size(); i++) {
            soma += notas.get(i);
        }
        double media = soma / notas.size();
        this.media = media;

        return this.media;
    }

    public void verificarSituacao() {
        double media = this.media;
        // Função que verifica a situação do aluno com base em sua média
        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    public static void main(String[] args) {
        // Inicializando as variáveis.
        double[] notas = { 9.2, 2.3, 5.4, 7.2 };
        Aluno aluno = new Aluno();

        // Adicionando novas notas.
        aluno.adicionarNotas(notas);
        // aluno.removerNotas(2);

        // Imprimindo as informações para o usuário
        System.out.println("Nome = " + aluno.nome);
        System.out.println("Matrícula = " + aluno.matricula);
        System.out.println("Notas = " + aluno.notas);
        System.out.printf("Média = %.1f\n", aluno.calcularMedia());
        aluno.verificarSituacao();
    }

}
