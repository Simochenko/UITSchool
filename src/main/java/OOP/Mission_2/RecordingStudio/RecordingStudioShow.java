package OOP.Mission_2.RecordingStudio;


import java.util.Scanner;

public class RecordingStudioShow {
    public void RecordingStudioInit() {
        Mounting mounting = createMounting();
        System.out.println("Продолжительность диска  " + " " + mounting.getDuration() + " " + "минут");
        consolIO(mounting);

    }

    public static Mounting createMounting() {

        Composition instrument = new InstrumentComposition(9, 2, 15);
        Composition pop = new PopComposition(10, 3, 20);
        Composition classic = new ClassicComposition(8, 2, 5);
        Composition instrument1 = new InstrumentComposition(5, 3, 9);
        Composition pop1 = new PopComposition(9, 3, 10);

        Mounting mount = new Mounting();
        mount.addComposition(instrument);
        mount.addComposition(pop);
        mount.addComposition(classic);
        mount.addComposition(instrument1);
        mount.addComposition(pop1);
        return mount;
    }

    public static void consolIO(Mounting mounting) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Сортировка по стилю  нажмите   : 1 ");
            System.out.println("Стили.1-Инструментальный,2-Поп, 3-Классика, 4-Ретро");
            System.out.println("Найти композицию , по   длине   треков нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        mounting.sortComposition();
                    }
                    break;
                    case 2: {
                        findComposition(sc, mounting);
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

    public static void findComposition(Scanner sc, Mounting mounting) {
        System.out.println("Введите начальный диапазон длины трека. ");
        int r1 = Integer.parseInt(sc.next());
        System.out.println("Введите конечный длины трека. ");
        int r2 = Integer.parseInt(sc.next());
        mounting.findComposition(r1, r2);
    }

}
