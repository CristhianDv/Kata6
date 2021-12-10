import java.util.Scanner;
import toys.*;
public class Main {
    public static void main(String[] args) {
        ToyBusiness fabrica = new ToyBusiness();
        while (true) {
            Scanner escaner = new Scanner(System.in);
            
            switch (escaner.nextLine()) {
                case "car":
                    Car coche = fabrica.createCar();
                    System.out.println("Cochecito S/N " + coche.getSerialNumber());
                    break;
                case "helicopter":
                    Helicopter helicoptero = fabrica.createHelicopter();
                    System.out.println("Helicoptero S/N " + helicoptero.getSerialNumber());
                    break;
                case "exit":
                    System.out.println("Exiting ...");
                    System.exit(0);
                default:
                    System.out.println("Comando desconocido");
            }
        }
        
    }
}
