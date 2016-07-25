package OOP.Mission_2.TaxiStation;


public class MercedesCar  extends Car {
    private final static String name = "Мерседес";
    MercedesCar(double price, int speed, int amountFuel) {
        super(name,price,speed,amountFuel);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
