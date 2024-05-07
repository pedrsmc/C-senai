package newpackage;

import newpackage.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        int resultado = calculadora.soma(5, 2);
        
        if (resultado != -1) {
            System.out.println("Resultado = " + resultado);
        } else {
            System.out.println("Por favor, informe apenas números inteiros positivos.");
        }
    }
}