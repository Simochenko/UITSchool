package OOP.Mission_2.GameRoom;

public class Car  extends Toy {
    private final static String name = "Машина";
    Car(double price, String size, int ageGroup, double weight, String quality, String material){
        super(name, price, size, ageGroup, weight, quality, material);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

