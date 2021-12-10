import java.util.Scanner;
import toys.*;
public class Main {
    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        
        while (true) {
            Scanner escaner = new Scanner(System.in);
            
            switch (escaner.nextLine()) {
                case "car":
                    Car cochecito = new Car(generator.next(), "Toyota");
                    cochecito.pack();
                    cochecito.label();
                    System.out.println("Cochecito S/N " + cochecito.getSerialNumber());
                    break;
                case "helicopter":
                    Helicopter helicoptero = new Helicopter(generator.next(), "XD");
                    helicoptero.pack();
                    helicoptero.label();
                    System.out.println("Helicoptero S/N " + helicoptero.getSerialNumber());
                    break;
                case "exit":
                    System.exit(0);
                default:
                    System.out.println("Comando desconocido");
            }
        }
        
    }
}
