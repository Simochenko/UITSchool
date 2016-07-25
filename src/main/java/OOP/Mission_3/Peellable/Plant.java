package OOP.Mission_3.Peellable;

public class Plant {

    private String name;
    private String type;
    private double weight;
    private String color;
    private String maturity;
    private String condition;
    private boolean cleaning = false;


    public Plant() {
    }

    public Plant(String name, String type, double weight, String color, String maturity, String condition, boolean cleaning) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.color = color;
        this.maturity = maturity;
        this.condition = condition;
        this.cleaning = cleaning;
    }

    public String getType() {
        return type;
    }

    ;

    public String getName() {
        return name;
    }

    ;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public String getMaturity() {
        return maturity;
    }

    public String getCondition() {
        return condition;
    }

    public boolean getCleaning() {
        return cleaning;
    }

    public void setCleaning(boolean cleaning) {
        this.cleaning = cleaning;
    }

    @Override
    public String toString() {
        return getName() + " " + getType() + " " + "Весом =" + getWeight() + " "
                + "Цвет " + " " + getColor() + " " + "Зрелость=" + " " + getMaturity() + " "
                + "Состояние " + " " + getCondition();
    }
}
