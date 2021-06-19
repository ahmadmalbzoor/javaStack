public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
       return "Iphone "+getVersionNumber()+ " says " + getRingTone();
    }
    @Override
    public String unlock() {
        // your code here
        return "Unlocking via facial recogntion";
    }
    @Override
    public void displayInfo() {
        System.out.println("Iphone "+getVersionNumber()+"from "+getCarrier());
    }
}