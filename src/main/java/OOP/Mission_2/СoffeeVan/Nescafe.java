package OOP.Mission_2.СoffeeVan;

public class Nescafe extends  Coffee {
    private final static String name = "Нескафе";
    Nescafe(String sort, String condition, int weight, double price, String quality,int weightUp) {
        super(name, sort, condition, weight, price, quality,weightUp);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
