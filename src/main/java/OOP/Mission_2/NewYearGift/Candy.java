package OOP.Mission_2.NewYearGift;

public class Candy {
    private String name;
    private double price;
    private String type;
    private int sugar;
    private int weight;


    public Candy() {
    }

    public Candy(String name, double price, String type, int sugar, int weight) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.sugar = sugar;
        this.weight = weight;
    }

    public Candy(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Конфета:" + " " + name + " " + "Цена =" + price + " " + "Тип = " + " "
                + type + " " + "Содержание сахара =" + sugar + " " + "Вес=" + " " + weight;
    }
}
