package OOP.Mission_2.Taxes;

public class DispositionPropertyTax extends Tax {
    private final static String name = "Налог с продажи имущества";
    DispositionPropertyTax( double price, String view){
        super(name, price, view);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
