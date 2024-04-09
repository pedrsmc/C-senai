import java.util.Scanner;

public class SomaPorLinhas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;

        System.out.print("Digite o número de linhas da matriz: ");
        int numLinhas = sc.nextInt();

        int[][] matriz = new int[numLinhas][];

        for (int i = 0; i < numLinhas; i++) {
            System.out.print("Digite a quantidade de elementos da " + (i + 1) + "º linha: ");
            int numElementos = sc.nextInt();

            matriz[i] = new int[numElementos];

            for (int j = 0; j < numElementos; j++) {
                System.out.print("Digite o " + (j + 1) + "º elemento da linha: ");
                matriz[i][j] = sc.nextInt();
                c++;	
            }
        }
        System.out.printf("\nQuantidade total de elementos: %d\n\n", c);

        sc.close();
    }
}
