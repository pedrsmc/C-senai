import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Primeira matriz 3x3
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Matriz para armazenar o resultado da multiplaçao
        int[][] matrizResultado = new int[3][3];

        System.out.print("Digite um número inteiro positivo: ");
        int numeroDigitado = sc.nextInt();

        // Multiplicando as matrizes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizResultado[i][j] = matriz[i][j] * numeroDigitado;
            }
        }

        // Exibindo o resultado
        System.out.println("Resultado da multiplicação das matrizes:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
