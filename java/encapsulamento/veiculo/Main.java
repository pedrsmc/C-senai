package teste.veiculo;

import java.util.Scanner;
import teste.veiculo.Veiculo;

public class Main {

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o ano do veículo: ");
        veiculo.SetAno(sc.nextInt());
        System.out.print("Digite a marca do veículo: ");
        veiculo.SetMarca(sc.next());
        System.out.print("Digite o modelo do veículo: ");
        veiculo.SetModelo(sc.next());
        System.out.print("Digite o preço do veículo: ");
        veiculo.SetPreco(sc.nextDouble());
        
        System.out.println("\n");
        System.out.println("Ano: " + veiculo.GetAno());
        System.out.println("Marca: " + veiculo.GetMarca());
        System.out.println("Modelo: " + veiculo.GetModelo());
        System.out.printf("Preço: %.2f", veiculo.GetPreco());
    }
}
