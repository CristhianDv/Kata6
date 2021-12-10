package toyproduct.models;

import toyproduct.*;

public class AsianCarToy implements Toy {
    private final int serialNumber;
    private String type;

    public AsianCarToy(int serialNumber) {
        this.serialNumber = serialNumber;
        this.type = "coche";
    }

    public int getSerialNumber() {
        return serialNumber;
    }
    
    
    @Override
    public void pack(){
        System.out.println("Packing Asian Car " + type + " " + serialNumber);
    }
    
    @Override
    public void label(){
        System.out.println("Labelling Asian Car " + type + " " + serialNumber);
    }
}
