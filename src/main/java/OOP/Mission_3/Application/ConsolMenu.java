package OOP.Mission_3.Application;


import OOP.Mission_3.Basket.Basket;
import OOP.Mission_3.MultifunctionalHarvester.MultifunctionalHarvester;
import OOP.Mission_3.Peellable.*;
import OOP.Mission_3.Serv.WorkConsol;

import java.util.Scanner;

public class ConsolMenu {

        public void Initialisation() {
            WorkConsol workConsol = new WorkConsol();
           Basket basket = new Basket();
            MultifunctionalHarvester multifunctionalHarvester = new MultifunctionalHarvester();
            Scanner sc = new Scanner(System.in);
            boolean end = false;
            while (!end) {
                System.out.println("Создание овощей и фруктов:");
                System.out.println("Введите характеристики для Яблоко - 1");
                System.out.println("Введите характеристики для Груша - 2 ");
                System.out.println("Введите характеристики для Банан - 3 ");
                System.out.println("Введите характеристики для Апельсин - 4 ");
                System.out.println("Введите характеристики для Картофель - 5");
                System.out.println("Введите характеристики для Морковь - 6 ");
                System.out.println("Введите характеристики для Сельдерей - 7 ");
                System.out.println("Введите характеристики для Лук - 8 ");
                try {
                    int result = Integer.parseInt(sc.next());
                    createFruitVegetables(result, sc, basket, workConsol);
                } catch (Exception e) {
                    end = true;
                }
                System.out.println("Желаете продолжить создавать объекты?: 1 -Да,0-Нет ");
                int contunue = Integer.parseInt(sc.next());
                if (contunue == 1) {
                    end = false;
                } else if (basket.isEmpty()) {
                    end = true;
                } else {
                    System.out.println("Общее количество фруктов и овощей положенных в корзину составляет " + basket.size() + " штук");
                    workFruitVegetables(sc, basket, multifunctionalHarvester,workConsol);
                }
            }
        }

    public static void createFruitVegetables(int result, Scanner sc, Basket basket, WorkConsol workConsol) {
        if (result <= 4) {
            createFruit(result, sc, basket, workConsol);
        } else if (result > 4) {
            createVegetables(result, sc, basket, workConsol);
        }
    }
    public static void createFruit(int result, Scanner sc, Basket basket,WorkConsol workConsol){
        switch (result) {
            case 1: {
                Plant apple = createApple(result, sc,workConsol);
                int r1 = workConsol.enterBasket(sc);
                if (r1 == 1) {
                    addBasket(apple, basket);
                    System.out.println("Общий Вес корзины = " + basket.getWeightBasket());
                }
            }
            break;
            case 2: {
                Plant pear = createPear(result, sc,workConsol);
                int r1 = workConsol.enterBasket(sc);
                if (r1 == 1) {
                    addBasket(pear, basket);
                    System.out.println("Общий Вес корзины = " + basket.getWeightBasket());
                }
            }
            break;
            case 3: {
                Plant banana = createBanana(result, sc,workConsol);
                int r1 = workConsol.enterBasket(sc);
                if (r1 == 1) {
                    addBasket(banana, basket);
                    System.out.println("Общий Вес корзины = " + basket.getWeightBasket());
                }
            }
            break;
            case 4: {
                Plant orange = createOrange(result, sc,workConsol);
                int r1 = workConsol.enterBasket(sc);
                if (r1 == 1) {
                    addBasket(orange, basket);
                    System.out.println("Общий Вес корзины = " + basket.getWeightBasket());
                }
            }
            break;
        }
    }
    public static void createVegetables(int result, Scanner sc, Basket basket,WorkConsol workConsol){
        switch (result) {
            case 5: {
                Plant potatoes = createPotatoes(result, sc,workConsol);
                int r1 = workConsol.enterBasket(sc);
                if (r1 == 1) {
                    addBasket(potatoes, basket);
                    System.out.println("Общий Вес корзины = " + basket.getWeightBasket());
                }
            }
            break;
            case 6: {
                Plant carrot = createCarrot(result, sc,workConsol);
                int r1 = workConsol.enterBasket(sc);
                if (r1 == 1) {
                    addBasket(carrot, basket);
                    System.out.println("Общий Вес корзины = " + basket.getWeightBasket());
                }
            }
            break;
            case 7: {
                Plant celery = createCelery(result, sc,workConsol);
                int r1 = workConsol.enterBasket(sc);
                if (r1 == 1) {
                    addBasket(celery, basket);
                    System.out.println("Общий Вес корзины = " + basket.getWeightBasket());
                }
            }
            break;
            case 8: {
                Plant bow = createBow(result, sc,workConsol);
                int r1 = workConsol.enterBasket(sc);
                if (r1 == 1) {
                    addBasket(bow, basket);
                    System.out.println("Общий Вес корзины = " + basket.getWeightBasket());
                }
            }
            break;
        }
    }
    public static String findColor(int color) {
        String result;
        switch (color) {
            case 1: {
                result = "Желтый";
            }
            break;
            case 2: {
                result = "Зеленый";
            }
            break;
            case 3: {
                result = "Красный";
            }
            break;
            default: {
                result = "Нет такого цвета";
            }
        }
        return result;
    }
    public static String findMaturity(int maturity) {
        String result;
        switch (maturity) {
            case 1: {
                result = "Зрелый";
            }
            break;
            case 2: {
                result = "Не зрелый";
            }
            break;
            default: {
                result = "Нет  такого уровня зрелости";
            }
        }
        return result;
    }
    public static String findCondition(int condition) {
        String result;
        switch (condition) {
            case 1: {
                result = "Кондиционный";
            }
            break;
            case 2: {
                result = "Не кондиционный";
            }
            break;
            default: {
                result = "Нет такой кондиции";
            }
        }
        return result;
    }
    public static Plant createApple(int io, Scanner sc,WorkConsol workConsol) {
        double weight = workConsol.enterWeight(sc);
        String[] str = consolIo(sc);
        Plant apple = new Apple(weight, str[0], str[1], str[2], false);
        System.out.println(apple.toString());
        return apple;
    }
    public static Plant createPear(int io, Scanner sc,WorkConsol workConsol) {
        double weight = workConsol.enterWeight(sc);
        String[] str = consolIo(sc);
        Plant pear = new Pear(weight, str[0], str[1], str[2], false);
        System.out.println(pear.toString());

        return pear;
    }
    public static Plant createBanana(int io, Scanner sc,WorkConsol workConsol) {
        double weight = workConsol.enterWeight(sc);
        String[] str = consolIo(sc);
        Plant banana = new Banana(weight, str[0], str[1], str[2], false);
        System.out.println(banana.toString());
        return banana;
    }
    public static Plant createOrange(int io, Scanner sc,WorkConsol workConsol) {
        double weight = workConsol.enterWeight(sc);
        String[] str = consolIo(sc);
        Plant orange = new Orange(weight, str[0], str[1], str[2], false);
        System.out.println(orange.toString());
        return orange;
    }
    public static Plant createPotatoes(int io, Scanner sc,WorkConsol workConsol) {
        double weight = workConsol.enterWeight(sc);
        String[] str = consolIo(sc);
        Plant potatoes = new Potatoes(weight, str[0], str[1], str[2], false);
        System.out.println(potatoes.toString());
        return potatoes;
    }
    public static Plant createCarrot(int io, Scanner sc,WorkConsol workConsol) {
        double weight = workConsol.enterWeight(sc);
        String[] str = consolIo(sc);
        Plant carrot = new Carrot(weight, str[0], str[1], str[2], false);
        System.out.println(carrot.toString());
        return carrot;
    }
    public static Plant createCelery(int io, Scanner sc,WorkConsol workConsol) {
        double weight = workConsol.enterWeight(sc);
        String[] str = consolIo(sc);
        Plant celery = new Celery(weight, str[0], str[1], str[2], false);
        System.out.println(celery.toString());
        return celery;
    }
    public static Plant createBow(int io, Scanner sc,WorkConsol workConsol) {
        double weight = workConsol.enterWeight(sc);
        String[] str = consolIo(sc);
        Plant bow = new Bow(weight, str[0], str[1], str[2], false);
        System.out.println(bow.toString());
        return bow;

    }
    public static void addBasket(Plant plant, Basket basket) {
        basket.addfruitVegetables(plant);
    }
    public static String[] consolIo(Scanner sc) {
        String[] arr = new String[3];
        System.out.println("Введите цвет:1-Желтый,2-Зеленый,3-Красный ");
        int color1 = Integer.parseInt(sc.next());
        arr[0] = findColor(color1);
        System.out.println("Введите уровень зрелости:1-Зрелый,2-Не зрелый ");
        int maturity1 = Integer.parseInt(sc.next());
        arr[1] = findMaturity(maturity1);
        System.out.println("Введите уровень кондиции:1-Кондиционный,2-Не кондиционный ");
        int condition1 = Integer.parseInt(sc.next());
        arr[2] = findCondition(condition1);
        return arr;
    }
    public static void workFruitVegetables(Scanner sc, Basket basket, MultifunctionalHarvester multifunctionalHarvester,WorkConsol workConsol) {
        boolean fin = false;
        while (!fin) {
            System.out.println("Желаете извлечь овощи или фрукты для очистки из корзины?: 1 -Да,0-Нет ");
            int contunue1 = Integer.parseInt(sc.next());
            if (contunue1 == 1) {
                Object obj = extractFromBin(sc, basket, multifunctionalHarvester);
                System.out.println("Общий Вес корзины до чистки = " + basket.getWeightBasket());
                System.out.println("Почистить? : 1 -Да,0-Нет");
                int contunue3 = Integer.parseInt(sc.next());
                if (contunue3 == 1) {
                    multifunctionalHarvester.peellItem(obj);
                    int contunue4 = workConsol.cutSlicer(sc);
                    if (contunue4 == 1) {
                        cutSlicer(multifunctionalHarvester, obj);
                        if(basket.size() > 0) {
                            fin = false;
                        }else{
                            fin = true;
                        }
                    }else{
                        fin = false;
                    }
                } else {
                    int contunue5 = workConsol.cutSlicer(sc);
                    if (contunue5 == 1) {
                        cutSlicer(multifunctionalHarvester, obj);
                    } fin = false;
                }

            }else {fin = true;}

        }
    }

    public static Object extractFromBin(Scanner sc, Basket basket, MultifunctionalHarvester multifunctionalHarvester){
        int count = basket.size() - 1;
        System.out.println("Введите число от 0 до " + count);
        int contunue2 = Integer.parseInt(sc.next());
        Object obj = basket.extractFruitVegetables(contunue2);
        if (obj instanceof Fruit) {
            Fruit fruit = (Fruit) obj;
            System.out.println("Извлечен" + " " + fruit.toString());
        } else if (obj instanceof Vegetable) {
            Vegetable vegetable = (Vegetable) obj;
            System.out.println("Извлечен" + " " + vegetable.toString());
        }
        return obj;
    }
    public static void cutSlicer(MultifunctionalHarvester multifunctionalHarvester,Object obj){
        multifunctionalHarvester.cut(obj);
        multifunctionalHarvester.slicerItem(obj);
    }
}