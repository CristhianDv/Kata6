package toyproduct.models;

import toyproduct.*;

public class AmericanHelicopterToy implements Toy {
    private int serialNumber;
    private String type;

    public AmericanHelicopterToy(int serialNumber) {
        this.serialNumber = serialNumber;
        this.type = "helicoptero";
    }

    public int getSerialNumber() {
        return serialNumber;
    }
    
    @Override
    public void pack(){
        System.out.println("Packing American Helicopter " + type + " " + serialNumber);
    }
    
    @Override
    public void label(){
        System.out.println("Labelling American Helicopter " + type + " " + serialNumber);
    }
}
