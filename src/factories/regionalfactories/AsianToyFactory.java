package factories.regionalfactories;

import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AsianCarToy;
import toyproduct.models.AsianHelicopterToy;

public class AsianToyFactory extends ToyFactory {

    @Override
    public Toy createToy(String type) {
        switch(type) {
            case "coche":
                AsianCarToy coche = new AsianCarToy(this.generator.next());
                return coche;
            case "helicoptero":
                AsianHelicopterToy helicoptero = new AsianHelicopterToy(this.generator.next());
                return helicoptero;
            default:
                return null;
        }
    }

}
