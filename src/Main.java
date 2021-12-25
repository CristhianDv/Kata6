import business.ToyBusiness;
import factories.regionalfactories.AmericanCarToyFactory;
import factories.regionalfactories.AsianHelicopterToyFactory;
import java.util.ArrayList;
import toyproduct.*;
import toyproduct.models.*;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ToyBusiness business = new ToyBusiness();
        business.add("car", new AmericanCarToyFactory());
        business.add("helicopter", new AsianHelicopterToyFactory());
        ArrayList<Toy> toys = new ArrayList<>();
        
        Scanner escaner = new Scanner(System.in);
        String line = "";
        while (!line.equals("exit")) {
            line = escaner.nextLine();
            switch (line) {
                case "car":
                case "helicopter":
                    toys.add(business.produceToy(line));
                    System.out.println("Juguetes fabricados S/N " + toys.stream().map(c -> c.toString()).collect(Collectors.joining(", ")));
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
