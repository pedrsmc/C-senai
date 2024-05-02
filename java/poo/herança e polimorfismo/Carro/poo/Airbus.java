package poo;

public class Airbus {
    
    public static void main(String[] args) {
        Aviao airbus = new Aviao(2020, "Branco", 1.87);

        System.out.println("Envergadura: " + airbus.envergadura);
        airbus.acelerar();
        airbus.aterrizar();
    }
}
