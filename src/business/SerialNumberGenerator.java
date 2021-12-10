package business;
public class SerialNumberGenerator {
    private int serialNumber;

    public SerialNumberGenerator() {
        this.serialNumber = 0;
    }
    
    public int next() {
        return serialNumber++;
    }
}
