package OOP.Mission_3.Peellable;

public class Potatoes extends Vegetable {

    private final static String name = "Картофель";

    public Potatoes(double weight,String color,String maturity,String condition,boolean cleaning) {
        super(name, weight, color, maturity,condition,cleaning);
    }
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public void peell(){
        super.peell();
    }
}
