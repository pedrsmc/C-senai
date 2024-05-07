package newpackage;

public class Calculadora {

    public Calculadora() {
    }
    public int soma(int numeroUm, int numeroDois) {
        int resultado;
        
        if (this.validarNumero(numeroUm, numeroDois) != false) {
            resultado = numeroUm + numeroDois;
        } else {
            resultado = -1;
        }
        
        return resultado;
    }
    
    private boolean validarNumero(int numeroUm, int numeroDois) {
        boolean ehPositivo = true;
        
        if (numeroUm < 1 || numeroDois < 1) {
            ehPositivo = false;
        }
        
        return ehPositivo;
    }
}
