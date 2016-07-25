package OOP.Mission_2.Scale;

import java.util.Scanner;

public class ScaleShow {

    public void ScaleInit() {

        Necklace necklace = createNecklace();
        System.out.println("Общий вес ожерелья  " + " " + necklace.getWeight() + " " + "Общая стоимость" + necklace.getPrice());
        consolIO(necklace);

    }

    public static Necklace createNecklace() {
        Scale diamond = new DiamondScale(9, 15.8, 8, 1);
        Scale ruby = new RubyScale(6, 9.52, 7, 2);
        Scale emerald = new EmeraldScale(9, 19.8, 5, 1);
        Scale amethyst = new AmethystScale(7, 12.4, 6, 2);
        Scale diamond1 = new DiamondScale(8, 6.9, 7, 2);

        Necklace neck = new Necklace();
        neck.addStone(diamond);
        neck.addStone(ruby);
        neck.addStone(emerald);
        neck.addStone(amethyst);
        neck.addStone(diamond1);
        return neck;

    }

    public static void consolIO(Necklace necklace) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Сортировку на  основе   ценности  нажмите   : 1 ");
            System.out.println("1-Драгоценный,2-Полудрагоценный");
            System.out.println("Найти камни по  заданному   диапазону параметров, нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        necklace.sortScale();
                    }
                    break;
                    case 2: {
                        findScale(sc, necklace);
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

    public static void findScale(Scanner sc, Necklace necklace) {
        System.out.println("Введите начальный диапазон прозрачности. ");
        int r1 = Integer.parseInt(sc.next());
        System.out.println("Введите конечный диапазон прозрачности. ");
        int r2 = Integer.parseInt(sc.next());
        necklace.findScale(r1, r2);
    }
}
