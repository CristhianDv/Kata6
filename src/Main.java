import business.ToyBusiness;
import factories.regionalfactories.AmericanToyFactory;
import factories.regionalfactories.AsianToyFactory;
import toyproduct.*;
import toyproduct.models.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Fábrica americana
        //ToyBusiness fabricaAmericana = new ToyBusiness(new AmericanToyFactory());
        // Fábrica asiática
        ToyBusiness fabricaAsiatica = new ToyBusiness(new AsianToyFactory());
        while (true) {
            Scanner escaner = new Scanner(System.in);
            
            switch (escaner.nextLine()) {
                case "car":
                    Toy coche = fabricaAsiatica.produceToy("coche");
                    AsianCarToy cocheFinal = (AsianCarToy) coche;
                    System.out.println("Coche S/N " + cocheFinal.getSerialNumber());
                    break;
                case "helicopter":
                    Toy helicoptero = fabricaAsiatica.produceToy("helicoptero");
                    AsianHelicopterToy helicopteroFinal = (AsianHelicopterToy) helicoptero;
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
