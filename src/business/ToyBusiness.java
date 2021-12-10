package business;

import toyproduct.*;

public abstract class ToyBusiness {
    public SerialNumberGenerator serialNumberGenerator;

    public ToyBusiness() {
        this.serialNumberGenerator = new SerialNumberGenerator();
    }
    
    public abstract Toy createToy(String type);
}
