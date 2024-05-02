package program;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Veiculo; // Importação da classe Veiculo

public class App {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Veiculo> carros = new ArrayList<>(); // Lista para armazenar os veículos
    static Veiculo veiculo = new Veiculo(); // Instância de um objeto Veiculo

    public static void main(String[] args) {
        int opcao;

        // Loop que continua até que o número 3 seja digitado
        do {
            // Exibição do menu
            System.out.println("1. Cadastrar veículo.");
            System.out.println("2. Mostrar veículos cadastrados.");
            System.out.println("3. Sair do programa.");
            System.out.print("Olá, selecione uma das opções abaixo de acordo com sua necessidade: ");
            opcao = sc.nextInt();

            System.out.println();

            // Switch case para determinar a ação com base na opção selecionada
            switch (opcao) {
                case 1:
                    cadastrarVeiculos(); // Chama a função para cadastrar veículos
                    break;
                case 2:
                    // Verifica se há veículos cadastrados antes de mostrar
                    if (carros.isEmpty()) {
                        System.out.println("Não há veículos cadastrados...\n");
                    } else {
                        mostrarVeiculos(); // Chama a função para mostrar os veículos cadastrados
                    }
                    break;
                case 3:
                    System.out.println("Saindo...\n");
                    break;
                default:
                    System.out.println("Por favor digite o número de uma das opções exibidas.\n");
                    break;
            }
        } while (opcao != 3);

        sc.close(); // Fecha o scanner após sair do loop
    }

    // Função para cadastrar veículos
    public static void cadastrarVeiculos() {
        System.out.println("========================= CADASTRO DE VEÍCULOS =========================");
        System.out.print("Digite a marca do veículo: ");
        veiculo.SetMarca(sc.next());
        System.out.print("Digite o modelo do veículo: ");
        veiculo.SetModelo(sc.next());
        System.out.print("Digite o ano do veículo: ");
        veiculo.SetAno(sc.nextInt());
        System.out.print("Digite o preço do veículo: ");
        veiculo.SetPreco(sc.nextDouble());
        System.out.println("========================================================================\n");

        carros.add(veiculo); // Adiciona o veículo à lista de carros
    }

    // Função para mostrar os veículos cadastrados
    public static void mostrarVeiculos() {
        int indice = 0;

        System.out.println("========================= MOSTRANDO VEÍCULOS ===========================");
        for (Veiculo veiculo : carros) {
            System.out.println((indice + 1) + "° veículo:\n");

            System.out.println("Marca: " + veiculo.GetMarca());
            System.out.println("Modelo: " + veiculo.GetModelo());
            System.out.println("Ano: " + veiculo.GetAno());
            System.out.println("Preço: R$ " + veiculo.GetPreco());

            System.out.println();
            indice++;
        }
        System.out.println("========================================================================\n");
    }
}
