package OOP.Mission_2.AirlineCompany;

import java.util.Scanner;

public class AirCompanyShow {
    public void AirCompantInit() {
        AirCompany airCompany = createAirCompany();
        System.out.println("Общая вместимость  " + " " + airCompany.getCapacity() + " " + "и грузоподьемность" + " " + airCompany.getNumberGruz() + " " + "тонн ");
        consolIO(airCompany);

    }

    public static AirCompany createAirCompany() {
        AirPlane boeing = new SuAirPlane(150, 15.2, 1000, 300);
        AirPlane airBus = new MriyAirPlane(200, 25.2, 3500, 1500);
        AirPlane antonov = new MigAirPlane(90, 11.2, 1000, 430);
        AirPlane boeing1 = new SuAirPlane(105, 15.2, 1500, 330);
        AirPlane airBus1 = new MriyAirPlane(160, 27.2, 3000, 560);

        //создаем авиакомпанию
        AirCompany airCompany = new AirCompany();

        airCompany.addAirPlane(boeing);
        airCompany.addAirPlane(airBus);
        airCompany.addAirPlane(boeing1);
        airCompany.addAirPlane(airBus1);
        return airCompany;
    }

    public static void consolIO(AirCompany airCompany) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Сортировку   самолетов  по дальности   полета  нажмите   : 1 ");
            System.out.println("Сортировка по потреблению горючего нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        airCompany.sortAirPlane();
                    }
                    break;
                    case 2: {
                        findAirPlaneDiapazon(sc, airCompany);
                    }
                    break;
                    default: {
                        end = true;
                    }
                }
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

    public static void findAirPlaneDiapazon(Scanner sc, AirCompany airCompany) {
        System.out.println("Введите начальный диапазон потребления горючего. ");
        int r1 = Integer.parseInt(sc.next());
        System.out.println("Введите конечный диапазон потребления горючего. ");
        int r2 = Integer.parseInt(sc.next());
        airCompany.findAirPlane(r1, r2);
    }

}
