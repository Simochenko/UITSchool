package OOP.Mission_2.NewYearGift;

public class ChocolatCandy extends Candy {

    private final static String type = "Шоколадная";

    ChocolatCandy(String name, double price, int sugar, int weight) {
        super(name, price, type, sugar, weight);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
