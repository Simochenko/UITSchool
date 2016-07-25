package OOP.Mission_2.CampingTours;

import java.util.Scanner;

public class CampingTourShow {
    public static Proposition createProposition() {
        CampingTour shopping = new ShoppingCampingTour(8000.00, "Без питания", 1, "Поезд", "Франция");
        CampingTour shopping1 = new ShoppingCampingTour(1000.00, "Завтрак", 2, "Поезд", "Германия");
        CampingTour сruize = new CruizeCampingTour(100000.00, "Все включено", 14, "Автобус", "Европа");
        CampingTour сruize1 = new CruizeCampingTour(100045.30, "Завтрак", 12, "Поезд", "Европа");
        CampingTour relax = new RelaxationCampingTour(2500.00, "Все включено", 14, "Авиа", "Египет");
        CampingTour relax1 = new RelaxationCampingTour(3500.00, "Все включено", 12, "Авиа", "Турция");
        CampingTour excursion = new ExcursionCampingTour(1000.00, "Без питания", 1, "Автобус", "Украина");
        CampingTour excursion1 = new ExcursionCampingTour(800.00, "Без питания", 3, "Автобус", "Украина");
        CampingTour medication = new MedicationCampingTour(10000.00, "Все включено", 10, "Автобус", "Украина");
        CampingTour medication1 = new MedicationCampingTour(15000.00, "Все включено", 7, "Автобус", "Украина");


        Proposition proposition = new Proposition();
        proposition.addCampingTour(relax);
        proposition.addCampingTour(relax1);
        proposition.addCampingTour(excursion);
        proposition.addCampingTour(excursion1);
        proposition.addCampingTour(medication);
        proposition.addCampingTour(medication1);
        proposition.addCampingTour(shopping);
        proposition.addCampingTour(shopping1);
        proposition.addCampingTour(сruize);
        proposition.addCampingTour(сruize1);
        return proposition;
    }

    public static void consolIO(Proposition proposition) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Для формирования предложения туристическим путевкам выберите пункт ниже:  ");

            try {
                findCampingToursTransfer(sc, proposition);
            } catch (Exception e) {
                end = true;
            }
            System.out.println("Желаете продолжить: 1 -Да,0-Нет ");
            int contunue = Integer.parseInt(sc.next());
            if (contunue == 1) {
                end = false;
            } else {
                end = true;
            }
        }

    }

    public static void findCampingToursTransfer(Scanner sc, Proposition proposition) {
        System.out.println("Для отбора по типу транспорта Введите тип транспорта - 1-Авиа,2-Автобус,3-Поезд");
        int r1 = Integer.parseInt(sc.next());
        System.out.println("\"Для отбора по типу дней Введите количество дней");
        int r2 = Integer.parseInt(sc.next());
        System.out.println("\"Для отбора по типу питания введите тип питания:1-Все включено,2-Завтрак,3-Без питания");
        int r3 = Integer.parseInt(sc.next());
        proposition.findCampingTourTransfer(r1, r2, r3);
    }

    public void CampingTourInit() {
        Proposition proposition = createProposition();
        System.out.println("Сортировка путевок по цене ");
        proposition.sortCampingTour();
        consolIO(proposition);
    }
}
