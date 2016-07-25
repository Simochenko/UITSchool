package OOP.Mission_2.CampingTours;

public class MedicationCampingTour extends CampingTour {
    private final static String name = "Лечение";
    MedicationCampingTour(double ammount, String typeFood, int numberDays, String transfer, String country){
        super(name,ammount,typeFood,numberDays,transfer,country);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
