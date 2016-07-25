package OOP.Mission_2.Transport;

public class LuksRailwayTransport extends RailwayTransport {
    private final static String name = "Люкс";
    LuksRailwayTransport(int numberSeats, int numberBagage,int levelComfort) {
        super(name, numberSeats, numberBagage,levelComfort);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
