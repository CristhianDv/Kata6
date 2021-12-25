package factories;

import toyproduct.Toy;

public abstract class ToyFactory {
    
    protected final SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public Toy produceToy(String type) {
        Toy juguete = this.createToy(type);
        juguete.pack();
        juguete.label();
        return juguete;
    }
    
    protected abstract Toy createToy(String type);
}
