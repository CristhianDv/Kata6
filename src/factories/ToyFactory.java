package factories;

import toyproduct.Toy;

public abstract class ToyFactory {
    
    public Toy produceToy(int serialNumber) {
        Toy juguete = this.createToy(serialNumber);
        juguete.pack();
        juguete.label();
        return juguete;
    }
    
    protected abstract Toy createToy(int serialNumber);
}
