package OOP.Mission_2.Account;

public class DepozitAccount extends Account {

    private final static String name = "Депозитный счет";

    DepozitAccount(double ammount, int status, double balans) {
        super(name, ammount, status, balans);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
