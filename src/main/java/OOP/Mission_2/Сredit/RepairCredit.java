package OOP.Mission_2.Сredit;

public class RepairCredit extends Credit {
    private final static String name = "Кредит на ремонт квартиры";
    RepairCredit(double ammount, String bank, String refinans){
        super(name, ammount, bank, refinans);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
