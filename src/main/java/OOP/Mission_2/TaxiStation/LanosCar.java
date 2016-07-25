package OOP.Mission_2.TaxiStation;

public class LanosCar extends   Car {
    private final static String name = "Ланос";
    LanosCar(double price, int speed, int amountFuel) {
        super(name,price,speed,amountFuel);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
