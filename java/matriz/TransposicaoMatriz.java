import java.util.Scanner;

public class TransposicaoMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitando as dimensoes da matriz ao usuario
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = sc.nextInt();
        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = sc.nextInt();

        // Criando a matriz
        int[][] matriz = new int[colunas][linhas];

        // Inserindo numeros na matriz
        for (int i = 0; i < colunas; i++) {
            System.out.println("\n" + (i + 1) + " coluna:");
            for (int j = 0; j < linhas; j++) {
                System.out.print("Digite o " + (j + 1) + "º número: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Imprimindo a matriz na tela
        for (int i = 0; i < linhas; i++) {
            System.out.println();
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[j][i] + " ");
            }
        }

        System.out.println("\n");

        // Imprimindo a matriz transposta
        System.out.println("Matriz transposta: ");
        for (int i = 0; i < colunas; i++) {
            System.out.println();
            for (int j = 0; j < linhas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println("\n");
        sc.close();
    }
}
