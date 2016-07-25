package OOP.Mission_2.TaxiStation;

public class Car {
    private String name;
    private double price;
    private int speed;
    private int amountFuel;

    public Car() {
    }
    public Car(String name, double price, int speed, int amountFuel) {
        this.name = name;
        this.price = price;
        this.speed = speed;
        this.amountFuel = amountFuel;
    }
    public Car(String name, double price) {
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
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public void setAmountFuel(int amountFuel) {
        this.amountFuel = amountFuel;
    }
    public int getAmountFuel() {
        return amountFuel;
    }

    @Override
    public String toString() {
        return "Авто" + " " + name + "  "+"Цена =" +" "+ price + " "
                + "Скорость=" + " " + speed + "км/ч "+" " + "Расход топлива:" + " "
                + amountFuel+" "+"л"+" "+"на 100 км ";
    }
}
