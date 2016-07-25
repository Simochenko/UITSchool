package OOP.Mission_2.Сhief;

import java.util.Scanner;

public class ChiefShow {
    public void ChiefInit() {
        Salad salad = createSalad();
        System.out.println("Калорийность салата  " + " " + salad.getСaloricValue() + " " + "кКл");
        consolIO(salad);

    }

    public static Salad createSalad() {
        Vegetable Bow = new Bow(3.50, 2.40, 3.35, 6.15);
        Vegetable Peas = new Peas(4.85, 3.65, 4.32, 7.52);
        Vegetable Beet = new Beet(2.65, 2.23, 3.44, 8.95);
        Vegetable Beet1 = new Beet(7.56, 3.56, 3.23, 9.35);
        Vegetable Peas1 = new Peas(3.25, 4.70, 5.62, 3.35);

        Salad salad = new Salad();
        salad.addVegetable(Bow);
        salad.addVegetable(Peas);
        salad.addVegetable(Beet);
        salad.addVegetable(Beet1);
        salad.addVegetable(Peas1);
        return salad;
    }

    public static void consolIO(Salad salad) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Сортировка   овощей   для   салата   на   основе   одного   из параметров нажмите   : 1 ");
            System.out.println("Найти овощи в салате ,  по диапазону калорийности нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        salad.sortVegetable();
                    }
                    break;
                    case 2: {
                        findVegetableDiapazon(sc, salad);
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

    public static void findVegetableDiapazon(Scanner sc, Salad salad) {
        System.out.println("Введите начальный диапазон калорийности. ");
        double r1 = Double.parseDouble(sc.next());
        System.out.println("Введите конечный диапазон калорийности. ");
        double r2 = Double.parseDouble(sc.next());
        salad.findVegetable(r1, r2);
    }
}
