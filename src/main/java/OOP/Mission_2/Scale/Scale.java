package OOP.Mission_2.Scale;

public class Scale { private String name;
    private double weight;
    private double price;
    private int transparency;
    private int value;


    public Scale() {
    }

    public Scale(String name, double weight, double price, int transparency, int value) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.transparency = transparency;
        this.value = value;
    }

    public Scale(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;

    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }

    public int getTransparency() {
        return transparency;
    }
    public void setValue(int value) {
        this.transparency = value;
    }

    public int getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Камень:" + " " + name + " " + "Вес =" + weight + " " + "Цена = " + " "
                + price+ " " + "Прозрачность =" +transparency + " " + "Ценность =" +value ;
    }
}
