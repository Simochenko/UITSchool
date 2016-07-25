package OOP.Mission_2.Insurance;

public class VoluntaryLiability  extends Liability {

    private final static String name = "Добровольное";

    VoluntaryLiability(double price, int risk, int amountСontribution, String fullName) {
        super(name, price, risk, amountСontribution, fullName);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
