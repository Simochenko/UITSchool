package OOP.Mission_2.RecordingStudio;

import java.util.Comparator;

public class ComparatorRecordingStudio implements Comparator<Composition> {

    @Override
    public int compare(Composition c1, Composition c2) {
        return Integer.compare(c1.getStyle(), c2.getStyle());
    }
}
