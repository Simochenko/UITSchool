package OOP.Mission_2.MobileCommunication;

import java.util.Comparator;

public class ComparatorTarif  implements Comparator<Tarif> {
    @Override
    public int compare(Tarif tarif1, Tarif tarif2) {
        return Double.compare(tarif1.getPrice(),tarif2.getPrice());
    }
}
