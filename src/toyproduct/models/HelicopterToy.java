package toyproduct.models;

import toyproduct.Toy;

public class HelicopterToy implements Toy {
    private int serialNumber;
    private String type;

    public HelicopterToy(int serialNumber) {
        this.serialNumber = serialNumber;
        this.type = "helicoptero";
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
