package OOP.Mission_2.Taxes;

public class MainPlaceWorkTax extends Tax {
    private final static String name = "Налог с основного места работы";
    MainPlaceWorkTax( double price, String view){
        super(name, price, view);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
