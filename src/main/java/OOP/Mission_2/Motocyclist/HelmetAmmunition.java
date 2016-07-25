package OOP.Mission_2.Motocyclist;

public class HelmetAmmunition extends Ammunition {
    private final static String name = "Шлем";
    HelmetAmmunition(double weight, double price, String material) {
        super(name, weight,price,material);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
