public class IdentidadeMatriz {
    public static void main(String[] args) {
        // Criando e inicializando a matriz identidade.
        int[][] identityMatrix = new int[3][3];
    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    identityMatrix[i][j] = 1;
                } else {
                    identityMatrix[i][j] = 0;
                }
            }
        }

        // Imprimindo a matriz identidade.
        System.out.println("Matriz Identidade " + 3 + "x" + 3 + ":");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(identityMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
