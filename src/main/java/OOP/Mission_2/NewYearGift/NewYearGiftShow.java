package OOP.Mission_2.NewYearGift;

import java.util.Scanner;

public class NewYearGiftShow {
    public void NewYearPresentInit() {
        NewYearGift newYearGift = createNewYearGift();
        System.out.println("Вес подарка " + " " + newYearGift.getWeight() + " грамм");
        consolIO(newYearGift);

    }

    public static NewYearGift createNewYearGift() {

        Candy chocolate = new ChocolatCandy("Каракум", 125.25, 15, 12);
        Candy lollipop = new LollipopCandy("Барбарис", 25.05, 10, 5);
        Candy caramel = new CaramelCandy("Стремная ночь", 78.15, 8, 3);
        Candy chocolate2 = new ChocolatCandy("Ромашка", 95.13, 12, 8);
        Candy caramel2 = new CaramelCandy("Ириска", 85.80, 15, 7);

        NewYearGift newYearGift = new NewYearGift();

        newYearGift.addCandy(chocolate);
        newYearGift.addCandy(lollipop);
        newYearGift.addCandy(caramel);
        newYearGift.addCandy(chocolate2);
        newYearGift.addCandy(caramel2);
        return newYearGift;
    }

    public static void consolIO(NewYearGift newYearGift) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Провести сортировку   конфет   в   подарке по цене нажмите   : 1 ");
            System.out.println("Найти   конфету   в   подарке соответствующую   заданному   диапазону   содержания сахара нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        newYearGift.sortCandy();
                    }
                    break;
                    case 2: {
                        findCandy(sc, newYearGift);
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

    public static void findCandy(Scanner sc, NewYearGift newYearGift) {
        System.out.println("Введите начальный диапазон содержания сахара. ");
        int r1 = Integer.parseInt(sc.next());
        System.out.println("Введите конечный диапазон содержания сахара. ");
        int r2 = Integer.parseInt(sc.next());
        newYearGift.findCandy(r1, r2);
    }
}
