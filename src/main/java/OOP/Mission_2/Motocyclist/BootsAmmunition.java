package OOP.Mission_2.Motocyclist;

public class BootsAmmunition  extends  Ammunition {
    private final static String name = "Сапоги";
    BootsAmmunition(double weight, double price, String material) {
        super(name, weight,price,material);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
