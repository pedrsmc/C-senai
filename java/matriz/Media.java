import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        // Criando as variáveis nescessárias.
        Scanner sc = new Scanner(System.in);
        double[][] listaNotas = new double[2][4];
        double media, soma = 0;
        int j;

        // Solicitando ao usuário que insira notas na matriz.
        for (int i = 0; i < 2; i++) {
            soma = 0;

            for (j = 0; j < 4; j++) {
                System.out.printf("Digite a %d° nota do %d° aluno: ", (j + 1), (i + 1));
                listaNotas[i][j] = sc.nextDouble();

                // Somando as notas.
                soma += listaNotas[i][j];
            }
            // Recebendo a média.
            media = soma / j;

            // Exibindo a média do aluno.
            System.out.printf("\nMédia: %.1f\n\n", media);  
        }

        sc.close();
    }
}
