import java.util.Scanner;
import toys.*;
public class Main {
    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        
        while (true) {
            Scanner escaner = new Scanner(System.in);
            if (escaner.nextLine().equals("exit")){
                break;
            }
            Car cochecito = new Car(generator.next());
            cochecito.pack();
            cochecito.label();
            System.out.println("Cochecito S/N " + cochecito.getSerialNumber());
        }
        
    }
}
