public class Paridade {
    public static void main(String[] args) {
        // Criando os contadores.
        int contadorPar = 0, contadorImpar = 0;

        // Criando a primeira matriz.
        int[][] matrizA = {
                { 3, 2 },
                { 3, 4 }
        };

        // Criando a segunda matriz.
        int[][] matrizB = {
                { 5, 6 },
                { 7, 8 }
        };

        // Verificando quais números são par ou impar.
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (matrizA[i][j] % 2 == 0 || matrizB[i][j] % 2 == 0) {
                    contadorPar++;
                } else {
                    contadorImpar++;
                }
            }
        }

        // Imprimindo na tela o qual a maior quantidade de números.
        if (contadorPar > contadorImpar) {
            System.out.println("\nA quantidade de números pares é maior.");
        } else {
            System.out.println("\nA quantidade de números ímpares é maior.");
        }

    }
}
