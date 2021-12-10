package toys;
public class Car {
    private final int serialNumber;
    private String type;

    public Car(int serialNumber) {
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
