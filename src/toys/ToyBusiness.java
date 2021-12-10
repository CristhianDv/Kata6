package toys;

import toyproduct.Toy;
import toyproduct.models.HelicopterToy;
import toyproduct.models.CarToy;

public class ToyBusiness {
    public SerialNumberGenerator serialNumberGenerator;

    public ToyBusiness() {
        this.serialNumberGenerator = new SerialNumberGenerator();
    }
    
    public Toy createToy(String type){
        switch (type) {
            case "coche":
                CarToy coche = new CarToy(serialNumberGenerator.next());
                coche.pack();
                coche.label();
                return coche;
            case "helicoptero":
                HelicopterToy helicoptero = new HelicopterToy(serialNumberGenerator.next());
                helicoptero.pack();
                helicoptero.label();
                return helicoptero;
            default:
                System.out.println("No existe ese tipo de juguete");
        }
        return null;
    }
}
