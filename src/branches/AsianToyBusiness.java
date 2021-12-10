package branches;

import business.ToyBusiness;
import toyproduct.Toy;
import toyproduct.models.AsianCarToy;
import toyproduct.models.AsianHelicopterToy;

public class AsianToyBusiness extends ToyBusiness {

    @Override
    public Toy createToy(String type) {
        switch (type) {
            case "coche":
                AsianCarToy coche = new AsianCarToy(serialNumberGenerator.next());
                coche.pack();
                coche.label();
                return coche;
            case "helicoptero":
                AsianHelicopterToy helicoptero = new AsianHelicopterToy(serialNumberGenerator.next());
                helicoptero.pack();
                helicoptero.label();
                return helicoptero;
            default:
                System.out.println("No existe ese tipo de juguete");
        }
        return null;
    }

}
