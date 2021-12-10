import branches.*;
import business.ToyBusiness;
import toyproduct.*;
import toyproduct.models.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Fábrica americana
        ToyBusiness fabrica = new AmericanToyBusiness();
        while (true) {
            Scanner escaner = new Scanner(System.in);
            
            switch (escaner.nextLine()) {
                case "car":
                    Toy coche = fabrica.createToy("coche");
                    AmericanCarToy cocheFinal = (AmericanCarToy) coche;
                    System.out.println("Coche S/N " + cocheFinal.getSerialNumber());
                    break;
                case "helicopter":
                    Toy helicoptero = fabrica.createToy("helicoptero");
                    AmericanHelicopterToy helicopteroFinal = (AmericanHelicopterToy) helicoptero;
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
