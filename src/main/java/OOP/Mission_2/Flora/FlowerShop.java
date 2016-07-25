package OOP.Mission_2.Flora;

import java.util.Scanner;

public class FlowerShop {public void FlowerShopInit() {
    Bouquet bouquet = createBuquet();
    consolIO(bouquet);
}

    public static Bouquet createBuquet() {

        Flower chrys = new СhrysanthemumFlower(30.00, 1, 15);
        Flower viol = new VioletFlower(40.00, 2, 25);
        Flower ros = new RoseFlower(30.56, 1, 30);
        Flower chrys1 = new СhrysanthemumFlower(33.25, 3, 53);
        Flower viol2 = new VioletFlower(35.00, 3, 25);

        Bouquet bouquet = new Bouquet();

        bouquet.addFlower(chrys);
        bouquet.addFlower(viol);
        bouquet.addFlower(ros);
        bouquet.addFlower(chrys1);
        bouquet.addFlower(viol2);


        bouquet.setAccessories("Пленка прозрачная");
        bouquet.setPriceAccessories(10.5);
        return bouquet;
    }

    public static void consolIO(Bouquet bouquet) {
        double totalPrice;
        totalPrice = bouquet.getPrice() + bouquet.getPriceAccessories();

        System.out.println("Стоимость с учетом акссесуаров" + " " + totalPrice);
        System.out.println("Стоимость без акссесуаров" + " " + bouquet.getPrice());
        System.out.println("Стоимость акссесуара" + " " + bouquet.getAccessories() + " " + "=" + bouquet.getPriceAccessories());

        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Сортировка цветов по свежести, нажмите   : 1 ");
            System.out.println("Сортировка по длине стеблей, нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        bouquet.sortList();
                    }
                    break;
                    case 2: {
                        findFlower(sc, bouquet);
                    }
                    break;
                    default: {
                        end = true;
                    }
                }
            } catch (Exception e) {
                end = true;
            }
            System.out.println("Желаете продолжить: 1 -Да,2-Нет ");
            int contunue = Integer.parseInt(sc.next());
            if (contunue == 1) {
                end = false;
            } else {
                end = true;
            }
        }
    }

    public static void findFlower(Scanner sc, Bouquet bouquet) {
        System.out.println("Введите начальный диапазон длины стебля. ");
        int r1 = Integer.parseInt(sc.next());
        System.out.println("Введите конечный диапазон длины стебля. ");
        int r2 = Integer.parseInt(sc.next());
        bouquet.findFlower(r1, r2);
    }
}
