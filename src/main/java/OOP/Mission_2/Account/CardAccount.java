package OOP.Mission_2.Account;

public class CardAccount extends Account {

    private final static String name = "Карточный счет";

    CardAccount(double ammount, int status, double balans) {
        super(name, ammount, status, balans);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
