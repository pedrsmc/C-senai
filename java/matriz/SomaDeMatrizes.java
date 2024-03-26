import java.util.Scanner;

public class SomaDeMatrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitando a dimensao das matrizes
        System.out.print("Digite o número de colunas das matrizes: ");
        int colunas = sc.nextInt();
        System.out.print("Digite o número de linhas das matrizes: ");
        int linhas = sc.nextInt();

        // Criando as matrizes
        int[][] matriz1 = new int[colunas][linhas];
        int[][] matriz2 = new int[colunas][linhas];
        int[][] somaMatrizes = new int[colunas][linhas];

        // Solicitando do usuário o numeros da primeira matriz
        for (int i = 0; i < colunas; i++) {
            System.out.println("\n" + (i + 1) + "º coluna:");
            for (int j = 0; j < linhas; j++) {
                System.out.print("Informe o " + (j + 1) + "º número da coluna: ");
                matriz1[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nAgora da 2º matriz...");

        // Solicitando do usuário o numeros da segunda matriz
        for (int i = 0; i < colunas; i++) {
            System.out.println("\n" + (i + 1) + "º coluna:");
            for (int j = 0; j < linhas; j++) {
                System.out.print("Informe o " + (j + 1) + "º número da coluna: ");
                matriz2[i][j] = sc.nextInt();
            }
        }

        // Somando as matrizes
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                somaMatrizes[i][j] = matriz2[i][j] + matriz1[i][j];
            }
        }

        System.out.println("\nExibindo a soma das matrizes...");

        // Imprimindo na tela a soma para o usuario
        for (int i = 0; i < linhas; i++) {
            System.out.println();
            for (int j = 0; j < colunas; j++) {
                System.out.print(somaMatrizes[j][i] + " ");
            }
        }
        System.out.println("\n");
        
        sc.close();
    }
}
