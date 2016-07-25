package OOP.Mission_2.СoffeeVan;

import java.util.ArrayList;
import java.util.Collections;

public class СoffeeVan {
    private final static int WEIGHT_FULL = 4500;
    private double weight;
    private double price;

    public double getPrice() {
        return price ;
    }
    public double getWeight() {
        return weight ;
    }

    private ArrayList<Coffee> coffees = new ArrayList<Coffee>();

    public СoffeeVan addCoffee(Coffee coffee) {
        weight +=coffee.getWeight()+coffee.getPackading();
        if(weight< WEIGHT_FULL){
            coffees.add(coffee);
            price += coffee.getPrice();
        }else{
            System.out.println("Превышен обьем фургона!!");
        }
        return this;
    }

    public void sortCoffee() {

        Collections.sort(coffees, new ComparatorCoffee());

        for (int i = 0; i < coffees.size(); i++) {
            System.out.println(coffees.get(i).toString());
        }
    }

    public void findCoffee(int quality) {
        String result;
        switch (quality) {
            case 1: {
                result = "Высший";
            }
            break;
            case 2: {
                result = "Первый";
            }
            break;
            case 3: {
                result = "Второй";
            }
            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < coffees.size(); i++) {
            if (coffees.get(i).getQuality().equals(result)) {
                System.out.println(coffees.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такого кофе");
        }
    }
}
