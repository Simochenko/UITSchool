package OOP.Mission_2.Taxes;

public class AdditionalWorkplaceTax extends  Tax {
    private final static String name = "Налог с дополнительного места работы";
    AdditionalWorkplaceTax( double price, String view){
        super(name, price, view);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
