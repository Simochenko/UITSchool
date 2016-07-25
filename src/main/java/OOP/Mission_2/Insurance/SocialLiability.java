package OOP.Mission_2.Insurance;

public class SocialLiability extends Liability{

    private final static String name = "Социальное";

    SocialLiability(double price, int risk, int amountСontribution, String fullName) {
        super(name, price, risk, amountСontribution, fullName);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
