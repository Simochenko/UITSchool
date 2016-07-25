package OOP.Mission_3.Serv;

import java.util.Scanner;

public class WorkConsol {
    public double enterWeight(Scanner sc){
        System.out.println("Введите вес в граммах");
        return  Double.parseDouble(sc.next());
    }
    public int enterBasket(Scanner sc){
        System.out.println("Добавить в корзину? 1 -Да,0-Нет");
        return Integer.parseInt(sc.next());
    }
    public int cutSlicer(Scanner sc){
        System.out.println("Пошинковать и нарезать?1 -Да,0-Нет");
        return Integer.parseInt(sc.next());
    }
}
