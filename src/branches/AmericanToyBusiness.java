package branches;

import business.ToyBusiness;
import toyproduct.Toy;
import toyproduct.models.AmericanCarToy;
import toyproduct.models.AmericanHelicopterToy;

public class AmericanToyBusiness extends ToyBusiness {

    @Override
    public Toy createToy(String type) {
        switch (type) {
            case "coche":
                AmericanCarToy coche = new AmericanCarToy(serialNumberGenerator.next());
                coche.pack();
                coche.label();
                return coche;
            case "helicoptero":
                AmericanHelicopterToy helicoptero = new AmericanHelicopterToy(serialNumberGenerator.next());
                helicoptero.pack();
                helicoptero.label();
                return helicoptero;
            default:
                System.out.println("No existe ese tipo de juguete");
        }
        return null;
    }

}
