import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        // Criando as variáveis nescessárias.
        Scanner sc = new Scanner(System.in);
        int[][] listaNumeros = new int[2][4];
        int soma = 0;

        // Solicitando ao usuário que insira números na matriz.
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite um número inteiro: ");
                listaNumeros[i][j] = sc.nextInt();

                // Somando os números.
                soma += listaNumeros[i][j];
            }
        }
        // Exibindo a soma total.
        System.out.println("\nSoma total dos números: " + soma + ".\n");

        sc.close();
    }
}
