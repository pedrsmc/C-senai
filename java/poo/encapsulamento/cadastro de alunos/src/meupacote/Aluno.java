package meupacote;

import java.util.ArrayList;

public class Aluno {
    // Criando os atributos da classe
    private String nome;
    private String matricula;
    private ArrayList<Double> notas = new ArrayList<>();
    private double media;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNotas(double[] notas) {
        // Limpa a lista de notas existente
        this.notas.clear();

        // Adiciona as novas notas
        for (int i = 0; i < notas.length; i++) {
            this.notas.add(notas[i]);
        }
    }

    public ArrayList getNotas() {
        return notas;
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
}
