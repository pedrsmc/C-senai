import java.util.Scanner;

public class SomaDiagonalPrincipal {
    public static void main(String[] args) {
        int somaDiagonal = 0;
        Scanner sc = new Scanner(System.in);

        // Pedindo a dimensão da matriz
        System.out.print("Digite a dimensão da matriz quadrada: ");
        int dimensao = sc.nextInt();

        // Criando a matriz com a dimensão especificada
        int[][] matriz = new int[dimensao][dimensao];

        // Inserindo numeros na matriz
        for (int i = 0; i < dimensao; i++) {
            System.out.println("\n" + (i + 1) + " coluna:");
            for (int j = 0; j < dimensao; j++) {
                System.out.print("Digite o " + (j + 1) + "º número: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Imprimindo a matriz na tela
        for (int i = 0; i < dimensao; i++) {
            System.out.println();
            for (int j = 0; j < dimensao; j++) {
                System.out.print(matriz[j][i] + " ");
            }
        }

        // Calculando a soma dos elementos na diagonal principal
        for (int i = 0; i < dimensao; i++) {
            somaDiagonal += matriz[i][i];
        }

        // Exibindo a soma dos elementos na diagonal principal
        System.out.println("\n\nA soma dos elementos na diagonal principal é: " + somaDiagonal + "\n");

        sc.close();
    }
}