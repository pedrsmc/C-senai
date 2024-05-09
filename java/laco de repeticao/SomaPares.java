import java.util.Scanner;

public class SomaPares {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int soma = 0, num;

        do {
            System.out.println("Digite um número inteiro positivo: ");
            num = sc.nextInt();

            if (num % 2 == 0) {
                soma += num;
            }
            
        } while (num >= 1);

        System.out.println("Soma do números páres: " + soma);
    }
}