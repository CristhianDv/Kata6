import toyproduct.models.HelicopterToy;
import toyproduct.models.CarToy;
import java.util.Scanner;
import toyproduct.Toy;
import toys.*;
public class Main {
    public static void main(String[] args) {
        ToyBusiness fabrica = new ToyBusiness();
        while (true) {
            Scanner escaner = new Scanner(System.in);
            
            switch (escaner.nextLine()) {
                case "car":
                    Toy coche = fabrica.createToy("coche");
                    CarToy cocheFinal = (CarToy) coche;
                    System.out.println("Cochecito S/N " + cocheFinal.getSerialNumber());
                    break;
                case "helicopter":
                    Toy helicoptero = fabrica.createToy("helicoptero");
                    HelicopterToy helicopteroFinal = (HelicopterToy) helicoptero;
                    System.out.println("Helicoptero S/N " + helicopteroFinal.getSerialNumber());
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
