public abstract class Ticket {
    private int serialNumber;

    public Ticket(){
    serialNumber = getSerialNumber();
    }
    public abstract double getPrice();

    private static int getSerialNumber(){
        return (int)(Math.random()*1000);
    }
    public String toString() {
        return "Number: " + serialNumber + ", Price: " + getPrice();
    }

}
