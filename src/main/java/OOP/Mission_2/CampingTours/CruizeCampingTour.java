package OOP.Mission_2.CampingTours;

public class CruizeCampingTour extends CampingTour {
    private final static String name = "Круиз";
    CruizeCampingTour(double ammount, String typeFood, int numberDays, String transfer, String country){
        super(name,ammount,typeFood,numberDays,transfer,country);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
