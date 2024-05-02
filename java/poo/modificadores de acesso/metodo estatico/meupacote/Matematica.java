package meupacote;

public class Matematica {

    public static void imprimirParidade(int numero) {
        boolean ehPar = ehPar(numero);

        if (ehPar == true) {
            System.out.println("O número informado é par!");
        } else {
            System.out.println("O número informado é ímpar!");
        }
    }

    private static boolean ehPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        imprimirParidade(6);
    }
}
