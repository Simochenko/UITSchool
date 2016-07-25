package OOP.Mission_2.CampingTours;

import java.util.Comparator;

public class ComparatorCampingTour implements Comparator<CampingTour> {
    @Override
    public int compare(CampingTour tourPackage1, CampingTour tourPackage2) {
        return Double.compare(tourPackage1.getAmmount(),tourPackage2.getAmmount());

    }
}
