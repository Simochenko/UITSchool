package OOP.Mission_2.TaxiStation;

public class BMWCar extends Car {
    private final static String name = "BMW";
    BMWCar(double price, int speed, int amountFuel) {
        super(name,price,speed,amountFuel);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
