package OOP.Mission_2.Insurance;

import java.util.Comparator;

public class ComparatorContract  implements Comparator<Liability> {

    @Override
    public int compare(Liability commitment1, Liability commitment2) {
        return Integer.compare(commitment2.getRisk(), commitment1.getRisk());
    }
}
