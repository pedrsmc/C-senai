import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        // Criando as variáveis nescessárias.
        Scanner sc = new Scanner(System.in);
        int[][] listaNumeros = new int[2][4];
        int numerosPares = 0;

        // Solicitando ao usuário que insira números na matriz.
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite um número inteiro: ");
                listaNumeros[i][j] = sc.nextInt();

                // Verificando se o número é par ou não.
                if (listaNumeros[i][j] % 2 == 0) {
                    numerosPares++;
                }
            }
        }
        // Exibindo a quantidade de números pares que foram digitados.
        System.out.println("\nQuantidade de números pares: " + numerosPares + ".\n");

        sc.close();
    }
}
