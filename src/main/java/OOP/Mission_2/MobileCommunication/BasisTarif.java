package OOP.Mission_2.MobileCommunication;

public class BasisTarif  extends Tarif {
    private final static String name = "Базовый";
    BasisTarif( double price, int amountClient, double payCommunication, double priceMinute) {
        super(name,  price,  amountClient, payCommunication,  priceMinute);
    }
    @Override
    public String toString() {
        return super.toString();
    }

}
