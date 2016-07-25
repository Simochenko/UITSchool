package OOP.Mission_2.GameRoom;

public class Toy {
    private String name;
    private double price;
    private String size;
    private int ageGroup;
    private double weight;
    private String quality;
    private String material;

    public Toy() {
    }

    public Toy(String name, double price, String size, int ageGroup, double weight, String quality, String material) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.ageGroup = ageGroup;
        this.weight = weight;
        this.quality = quality;
        this.material = material;
    }
    public Toy(String name, double price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
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
    public void setSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }
    public void setAgeGroup(int ageGroup) {
        this.ageGroup = ageGroup;
    }
    public int getAgeGroup() {
        return ageGroup;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public void setQuality(String quality) {
        this.quality = quality;
    }
    public String getQuality() {
        return quality;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }
    @Override
    public String toString() {
        return "Игрушка" + " " + name + "  "+"Цена =" +" "+ price + " "
                +"грн."+" "+"Размер=" + " " + size +" " + "Для возрастной группы:" + " "
                + ageGroup+" "+"лет"+" "+"Вес= "+" "+weight+" "+"Качество= "+" "+quality+" "
                +"Материал изготовления="+" "+material;
    }
}
