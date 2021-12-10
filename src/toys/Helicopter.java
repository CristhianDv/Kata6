package toys;
public class Helicopter {
    private int serialNumber;
    private String type;

    public Helicopter(int serialNumber) {
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
