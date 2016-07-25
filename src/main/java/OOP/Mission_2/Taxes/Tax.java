package OOP.Mission_2.Taxes;

public class Tax {
    private String name;
    private double price;
    private String view;


    public Tax() {
    }
    public Tax(String name, double price, String view) {
        this.name = name;
        this.price = price;
        this.view = view;
    }
    public  Tax(String name, double price) {
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
    public void setView(String view) {
        this.view = view;
    }
    public String getView() {
        return view;
    }

    @Override
    public String toString() {
        return "Налог" + " " + name + "  "+"Сумма =" +" "+ price + " "
                +"грн."+" "+"Вид Налога=" + " " + view ;
    }
}
