package OOP.Mission_2.HomeDevice;

import java.util.Scanner;

public class HomeDeviceShow {
    public void HomeDeviceInit() {
        ApartmentDevice flatDevice = createFlatDevice();
        System.out.println("Общая мощность приборов в квартире  " + " " + flatDevice.getPower() + " кВт");
        consolIO(flatDevice);

    }

    public static ApartmentDevice createFlatDevice() {

        HomeDevice microwave = new MicrowaveHomeDevice(2.20, false, 220);
        HomeDevice washer = new WasherHomeDevice(3.5, false, 210);
        HomeDevice fen = new FenHomeDevice(2.5);
        HomeDevice washer1 = new WasherHomeDevice(4.1);
        HomeDevice microwave1 = new MicrowaveHomeDevice(3.8, false, 230);

        fen.setVoltage(220);
        washer1.setVoltage(215);

        fen.switchOn();
        washer1.switchOn();

        ApartmentDevice apartD = new ApartmentDevice();

        apartD.addHomeDevice(microwave);
        apartD.addHomeDevice(washer);
        apartD.addHomeDevice(fen);
        apartD.addHomeDevice(washer1);
        apartD.addHomeDevice(microwave1);
        return apartD;
    }

    public static void consolIO(ApartmentDevice apartmentDevice) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Сортировка   приборов на основе мощности нажмите   : 1 ");
            System.out.println("Найти прибор в квартире с диапазоном   параметров нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        apartmentDevice.sortHomeDevice();;
                    }
                    break;
                    case 2: {
                        findHomeDevice(sc, apartmentDevice);
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

    public static void findHomeDevice(Scanner sc, ApartmentDevice flatDevice) {
        System.out.println("Введите начальный диапазон вольт. ");
        int r1 = Integer.parseInt(sc.next());
        System.out.println("Введите конечный диапазон вольт. ");
        int r2 = Integer.parseInt(sc.next());
        flatDevice.findHomeDevice(r1, r2);
    }
}
