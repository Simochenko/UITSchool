package OOP.Mission_2.Taxes;

public class BenefitsChildrenTax  extends Tax {
    private final static String name = "Льготы на детей";
    BenefitsChildrenTax( double price, String view){
        super(name, price, view);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
