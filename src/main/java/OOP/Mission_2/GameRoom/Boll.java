package OOP.Mission_2.GameRoom;

public class Boll extends Toy {
    private final static String name = "Мяч";
    Boll(double price, String size, int ageGroup, double weight, String quality, String material){
        super(name, price, size, ageGroup, weight, quality, material);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
