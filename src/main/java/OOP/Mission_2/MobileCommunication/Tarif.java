package OOP.Mission_2.MobileCommunication;

public class Tarif {
    private String name;
    private double price;
    private int amountClient;
    private double payCommunication;
    private double priceMinute;

    public Tarif() {
    }

    public Tarif(String name, double price, int amountClient, double payCommunication, double priceMinute) {
        this.name = name;
        this.price = price;
        this.amountClient = amountClient;
        this.payCommunication = payCommunication;
        this.priceMinute = priceMinute;
    }
    public Tarif(String name, double price) {
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
    public void setAmountClient(int amountClient) {
        this.amountClient = amountClient;
    }
    public int getAmountClient() {
        return amountClient;
    }
    public void setPayCommunication(double payCommunication) {
        this.payCommunication = payCommunication;
    }
    public double getPayCommunication() {
        return payCommunication;
    }

    public void setPriceMinute(double priceMinute) {
        this.priceMinute = priceMinute;
    }
    public double getPriceMinute() {
        return priceMinute;
    }

    @Override
    public String toString() {
        return "Тариф" + " " + name + "  "+"Абон плата =" +" "+ price + " "
                + "Количество клиентов=" + " " + amountClient +" " + "Плата за соединение:" + " "
                + payCommunication+" "+"Стоимость минуты разговора= "+" "+priceMinute;
    }
}
