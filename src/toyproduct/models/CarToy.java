package toyproduct.models;

import toyproduct.Toy;

public class CarToy implements Toy {
    private final int serialNumber;
    private String type;

    public CarToy(int serialNumber) {
        this.serialNumber = serialNumber;
        this.type = "coche";
    }

    public int getSerialNumber() {
        return serialNumber;
    }
    
    public void pack(){
        System.out.println("Packing " + type + " " + serialNumber);
    }
    
    public void label(){
        System.out.println("Labelling " + type + " " + serialNumber);
    }
}
