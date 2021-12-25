package factories.regionalfactories;

import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AmericanCarToy;
import toyproduct.models.AmericanHelicopterToy;

public class AmericanToyFactory extends ToyFactory {

    @Override
    public Toy createToy(String type) {
        switch(type) {
            case "coche":
                AmericanCarToy coche = new AmericanCarToy(this.generator.next());
                return coche;
            case "helicoptero":
                AmericanHelicopterToy helicoptero = new AmericanHelicopterToy(this.generator.next());
                return helicoptero;
            default:
                return null;
        }
    }

}
