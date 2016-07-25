package OOP.Mission_2.Taxes;

public class TransferTax  extends Tax {
    private final static String name = "Налог с перевода из за границы";
    TransferTax( double price, String view){
        super(name, price, view);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
