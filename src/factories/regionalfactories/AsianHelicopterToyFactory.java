
package factories.regionalfactories;

import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AsianHelicopterToy;

public class AsianHelicopterToyFactory extends ToyFactory {
    @Override
    public Toy createToy(int serialNumber) {
        return new AsianHelicopterToy(serialNumber);
    }

}
