package OOP.Mission_2.Scale;

import java.util.Comparator;

public class ComparatorScale implements Comparator<Scale> {
    @Override
    public int compare(Scale s1, Scale s2) {
        return Integer.compare(s1.getValue(), s2.getValue());
    }
}
