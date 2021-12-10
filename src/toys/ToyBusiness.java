package toys;
public class ToyBusiness {
    public SerialNumberGenerator serialNumberGenerator;

    public ToyBusiness() {
        this.serialNumberGenerator = new SerialNumberGenerator();
    }
    
    public Car createCar(){
        Car coche = new Car(serialNumberGenerator.next());
        coche.pack();
        coche.label();
        return coche;
    }
    
    public Helicopter createHelicopter(){
        Helicopter helicoptero = new Helicopter(serialNumberGenerator.next());
        helicoptero.pack();
        helicoptero.label();
        return helicoptero;
    }
}
