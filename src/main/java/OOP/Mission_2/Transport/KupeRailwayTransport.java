package OOP.Mission_2.Transport;

public class KupeRailwayTransport extends RailwayTransport {
    private final static String name = "Купе";
    KupeRailwayTransport(int numberSeats, int numberBagage,int levelComfort) {
        super(name, numberSeats, numberBagage,levelComfort);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
