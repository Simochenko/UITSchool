package OOP.Mission_2.Transport;

import java.util.Comparator;

public class ComparatorTransport implements Comparator<RailwayTransport> {
    @Override
    public int compare(RailwayTransport r1, RailwayTransport r2) {
        return Double.compare(r1.getLevelComfort(), r2.getLevelComfort());
    }
}
