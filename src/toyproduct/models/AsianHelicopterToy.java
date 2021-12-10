package toyproduct.models;

import toyproduct.*;

public class AsianHelicopterToy implements Toy {
    private int serialNumber;
    private String type;

    public AsianHelicopterToy(int serialNumber) {
        this.serialNumber = serialNumber;
        this.type = "helicoptero";
    }

    public int getSerialNumber() {
        return serialNumber;
    }
    
    @Override
    public void pack(){
        System.out.println("Packing Asian Helicopter " + type + " " + serialNumber);
    }
    
    @Override
    public void label(){
        System.out.println("Labelling Asian Helicopter " + type + " " + serialNumber);
    }
}
