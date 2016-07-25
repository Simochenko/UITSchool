package OOP.Mission_2.Сredit;

public class CarCredit extends Credit {
    private final static String name = "Кредит на покупку машины";
    CarCredit(double ammount, String bank, String refinans){
        super(name, ammount, bank, refinans);
    }
    @Override
    public String toString() {
        return super.toString();
    }

}
