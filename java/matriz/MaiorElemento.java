import java.util.Scanner;

public class MaiorElemento {
    public static void main(String[] args) {
        // Criando as variáveis nescessárias.
        Scanner sc = new Scanner(System.in);
        int[][] listaNumeros = new int[2][4];
        int maiorNumero = 0;

        // Solicitando ao usuário que insira números na matriz.
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite um número inteiro: ");
                listaNumeros[i][j] = sc.nextInt();

                // Verificando o maior número.
                if (listaNumeros[i][j] > maiorNumero) {
                    maiorNumero = listaNumeros[i][j];
                }
            }
        }
        // Exibindo o maior número na tela.
        System.out.println("\nO maior número é " + maiorNumero + ".\n");

        sc.close();
    }
}
