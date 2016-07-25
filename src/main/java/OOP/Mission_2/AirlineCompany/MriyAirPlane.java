package OOP.Mission_2.AirlineCompany;

public class MriyAirPlane extends  AirPlane {
    private final static String name = "Мрия";
    MriyAirPlane(int capacity, double numberGruz, int rangeFlight, int amountFuel) {
        super(name,capacity, numberGruz, rangeFlight, amountFuel);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
