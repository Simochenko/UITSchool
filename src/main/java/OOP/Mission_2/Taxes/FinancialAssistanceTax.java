package OOP.Mission_2.Taxes;

public class FinancialAssistanceTax extends Tax {
    private final static String name = "Налог с материальной помощи";
    FinancialAssistanceTax( double price, String view){
        super(name, price, view);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
