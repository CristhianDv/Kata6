package toyproduct.models;

import toyproduct.*;

public class AmericanCarToy implements Toy {
    private final int serialNumber;
    private String type;

    public AmericanCarToy(int serialNumber) {
        this.serialNumber = serialNumber;
        this.type = "coche";
    }

    public int getSerialNumber() {
        return serialNumber;
    }
    
    
    @Override
    public void pack(){
        System.out.println("Packing American Car " + type + " " + serialNumber);
    }
    
    @Override
    public void label(){
        System.out.println("Labelling American Car " + type + " " + serialNumber);
    }
}
