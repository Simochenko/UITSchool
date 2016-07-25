package OOP.Mission_2.Flora;

public class Flower {

    private String name;
    private double price;
    private int levelFresh;
    private int stemLength;

    public Flower() {
    }

    public Flower(String name, double price, int levelFresh, int stemLength) {
        this.name = name;
        this.price = price;
        this.levelFresh = levelFresh;
        this.stemLength = stemLength;
    }

    public Flower(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setLevelFresh(int levelFresh) {
        this.levelFresh = levelFresh;
    }

    public int getLevelFresh() {
        return levelFresh;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public int getStemLength() {
        return stemLength;
    }

    @Override
    public String toString() {
        return "Цветок:" + " " + name + " " + "Цена =" + price + " " + "Уровень свежести=" + " "
                + levelFresh + " " + "Длина стебля =" + stemLength;
    }

}
