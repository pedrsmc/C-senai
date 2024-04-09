import java.util.Scanner;

public class MediaPorLinhas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma, j;

        System.out.print("Digite o número de linhas da matriz: ");
        int numLinhas = sc.nextInt();

        int[][] matriz = new int[numLinhas][];

        // Preenchendo a matriz
        for (int i = 0; i < numLinhas; i++) {
            soma = 0;

            System.out.print("Digite a quantidade de elementos da " + (i + 1) + "º linha: ");
            int numElementos = sc.nextInt();
            
            matriz[i] = new int[numElementos];

            for (j = 0; j < numElementos; j++) {
                System.out.print("Digite o " + (j + 1) + "º elemento da linha: ");
                matriz[i][j] = sc.nextInt();

               soma += matriz[i][j];
            }
            double media = soma / j;
            
            System.out.printf("Média da linha: %.1f\n\n", media);
        }
        sc.close();
    }
}
