package OOP.Mission_2.TaxiStation;

import java.util.Scanner;

public class TaxiStationShow {
    public void TaxiStationInit() {

        TaxiStation taxiStation = createTaxiStation();
        System.out.println("Стоимость автопарка  " + " " + taxiStation.getPrice() + " " + "грн");
        consolIO(taxiStation);

    }

    public static TaxiStation createTaxiStation() {

        Car BMW = new BMWCar(945000.00, 260, 8);
        Car lanos = new LanosCar(200000.00, 180, 6);
        Car mercedes = new MercedesCar(800000.00, 290, 7);
        Car BMW1 = new BMWCar(1450000.00, 300, 8);
        Car lanos1 = new LanosCar(205000.00, 180, 6);


        TaxiStation taxiStation = new TaxiStation();
        taxiStation.addCar(BMW);
        taxiStation.addCar(lanos);
        taxiStation.addCar(mercedes);
        taxiStation.addCar(BMW1);
        taxiStation.addCar(lanos1);
        return taxiStation;
    }

    public static void consolIO(TaxiStation taxiPark) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Сортировка   по   расходу   топлива нажмите   : 1 ");
            System.out.println("Найти автомобиль по заданному   диапазону   параметров   скорости нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        taxiPark.sortCar();
                    }
                    break;
                    case 2: {
                        findCar(sc, taxiPark);
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

    public static void findCar(Scanner sc, TaxiStation taxiStation) {
        System.out.println("Введите начальный диапазон скорости. ");
        int r1 = Integer.parseInt(sc.next());
        System.out.println("Введите конечный диапазон скорости. ");
        int r2 = Integer.parseInt(sc.next());
        taxiStation.findCar(r1, r2);
    }
}
