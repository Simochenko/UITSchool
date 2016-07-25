package OOP.Mission_2.AirlineCompany;

public class SuAirPlane extends AirPlane {
    private final static String name = "Боинг";
    SuAirPlane(int capacity, double numberGruz, int rangeFlight, int amountFuel) {
        super(name,capacity, numberGruz, rangeFlight, amountFuel);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
