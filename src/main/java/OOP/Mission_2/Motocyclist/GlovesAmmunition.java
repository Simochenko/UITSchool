package OOP.Mission_2.Motocyclist;

public class GlovesAmmunition extends Ammunition {
    private final static String name = "Перчатки";
    GlovesAmmunition(double weight, double price, String material) {
        super(name, weight,price,material);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
