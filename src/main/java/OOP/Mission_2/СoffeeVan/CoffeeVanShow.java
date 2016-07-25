package OOP.Mission_2.СoffeeVan;

import java.util.Scanner;

public class CoffeeVanShow {
    public void CoffeeVanInit() {
        СoffeeVan coffeeVan = createCoffeeVan();
        System.out.println("Общий Вес фургона равен = " + coffeeVan.getWeight());
        consolIO(coffeeVan);

    }

    public static СoffeeVan createCoffeeVan() {
        Coffee nescafe = new Nescafe("Арабика", "молотый", 200, 320.68, "Высший", 2);
        Coffee jacobs = new Jacobs("Робуста", "в зернах", 300, 140.95, "Высший", 3);
        Coffee nescafe1 = new Nescafe("Арабика", "растворимый", 250, 210.45, "Высший", 2);
        Coffee cafePoli = new CafePoli("Робуста", "в пакетах", 220, 65.89, "Первый", 4);
        Coffee jacobs1 = new Jacobs("Арабика", "молотый", 360, 57.50, "Второй", 1);


        СoffeeVan сoffeeVan = new СoffeeVan();
        сoffeeVan.addCoffee(nescafe);
        сoffeeVan.addCoffee(jacobs);
        сoffeeVan.addCoffee(nescafe1);
        сoffeeVan.addCoffee(cafePoli);
        сoffeeVan.addCoffee(jacobs1);

        return сoffeeVan;
    }

    public static void consolIO(СoffeeVan coffeeVan) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Сортировка товара по цене   и  весу,  нажмите   : 1 ");
            System.out.println("Найти в фургоне товар по сорту, нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        coffeeVan.sortCoffee();
                    }
                    break;
                    case 2: {
                        System.out.println("Введите сорт качества 1-Высший,2-Первый,3-Второй. ");
                        int r1 = Integer.parseInt(sc.next());
                        coffeeVan.findCoffee(r1);
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
}
