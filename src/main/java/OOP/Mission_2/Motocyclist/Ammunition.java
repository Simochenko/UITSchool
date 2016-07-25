package OOP.Mission_2.Motocyclist;

public class Ammunition {

    private String name;
    private double weight;
    private double price;
    private String material;


    public Ammunition() {
    }

    public Ammunition(String name, double weight, double price, String material) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.material = material;
    }
    public Ammunition(String name, double price) {
        this.name = name;
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

    public void setMaterial(String material) {
        this.material= material;
    }

    public String getMaterial() {
        return material;
    }


    @Override
    public String toString() {
        return "Аммуниция:" + " " + name + " " + "Вес =" + weight + " " + "Цена = " + " "
                + price+ " " + "Материал =" +material ;
    }
}
