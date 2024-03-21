public class SomaMatriz {
    public static void main(String[] args) {
        // Primeira matriz 2x2
        int[][] matrizA = {
                { 3, 3 },
                { 2, 2 }
        };

        // Segunda matriz 2x2
        int[][] matrizB = {
                { 3, 3 },
                { 2, 2 }
        };

        // Matriz para armazenar o resultado da soma
        int[][] matrizResultado = new int[2][2];

        // Somando as matrizes
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Exibindo o resultado
        System.out.println("Resultado da soma das matrizes:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
