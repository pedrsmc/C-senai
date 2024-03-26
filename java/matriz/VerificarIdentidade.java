import java.util.Scanner;

public class VerificarIdentidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean matrizIdentidade = true;

        // Solicitando as dimensoes da matriz ao usuario
        System.out.print("Digite a dimensão da matriz: ");
        int dimensao = sc.nextInt();
        
        // Criando a matriz
        int[][] matriz = new int[dimensao][dimensao];

        // Inserindo numeros na matriz
        for (int i = 0; i < dimensao; i++) {
            System.out.println("\n" + (i + 1) + " coluna:");
            for (int j = 0; j < dimensao; j++) {
                System.out.print("Digite o " + (j + 1) + "º número: ");
                matriz[i][j] = sc.nextInt();

                if ((i == j && matriz[i][j] != 1) || (i != j && matriz[i][j] != 0)) {
                    matrizIdentidade = false;
                }
            }
        }

        // Imprimindo a matriz na tela
        for (int i = 0; i < dimensao; i++) {
            System.out.println();
            for (int j = 0; j < dimensao; j++) {
                System.out.print(matriz[j][i] + " ");
            }
        }

        // Informando ao usuario se a matriz é identidade ou não
        if (matrizIdentidade) {
            System.out.println("\n\nEsta matriz, é uma matriz identidade.\n");
        } else {
            System.out.println("\n\nEssa matriz NÃO é uma matriz identidade.\n");
        }

        sc.close();
    }
}
