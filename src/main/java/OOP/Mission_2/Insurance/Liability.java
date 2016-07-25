package OOP.Mission_2.Insurance;

public class Liability {
    private String name;
    private double price;
    private int risk;
    private int amountСontribution;
    private String fullName;


    public Liability() {
    }

    public Liability(String name, double price, int risk, int amountСontribution, String fullName) {
        this.name = name;
        this.price = price;
        this.risk = risk;
        this.amountСontribution = amountСontribution;
        this.fullName = fullName;
    }

    public Liability(String name, double price, String fullName) {
        this.name = name;
        this.price = price;
        this.fullName = fullName;
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

    public void setRisk(int risk) {
        this.risk = risk;
    }

    public int getRisk() {
        return risk;
    }

    public void setAmountСontribution(int amountСontribution) {
        this.amountСontribution = amountСontribution;
    }

    public int getAmountСontribution() {
        return amountСontribution;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Стаховое обязательство" + " " + name + "  " + "Цена =" + " " + price + " "
                + "Степень риска=" + " " + risk + " " + "Размер страхового взноса:" + " "
                + amountСontribution + " " + "Страховщик= " + " " + fullName;
    }
}
