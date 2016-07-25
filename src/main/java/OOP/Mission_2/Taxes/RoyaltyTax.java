package OOP.Mission_2.Taxes;

public class RoyaltyTax  extends Tax  {
    private final static String name = "Налог с авторского вознаграждения";
    RoyaltyTax( double price, String view){
        super(name, price, view);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
