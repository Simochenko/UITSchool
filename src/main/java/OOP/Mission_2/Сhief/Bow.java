package OOP.Mission_2.Сhief;

public class Bow extends Vegetable {

    private final static String name = "Лук";

    Bow(double protein, double carbohydrates, double caloricValue, double carotin) {
        super(name, protein, carbohydrates, caloricValue,  carotin);
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
