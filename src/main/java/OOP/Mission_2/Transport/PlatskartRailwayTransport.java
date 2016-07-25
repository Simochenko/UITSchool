package OOP.Mission_2.Transport;

public class PlatskartRailwayTransport extends   RailwayTransport {
    private final static String name = "Платцкарт";
    PlatskartRailwayTransport(int numberSeats, int numberBagage,int levelComfort) {
        super(name, numberSeats, numberBagage,levelComfort);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
