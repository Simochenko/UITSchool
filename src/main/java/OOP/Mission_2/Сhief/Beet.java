package OOP.Mission_2.Сhief;

public class Beet extends Vegetable {

    private final static String name = "Буряк";

    Beet(double protein, double carbohydrates, double caloricValue, double carotin) {
        super(name, protein, carbohydrates, caloricValue,  carotin);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
