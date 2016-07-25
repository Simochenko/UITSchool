package OOP.Mission_3.Basket;

import OOP.Mission_3.Peellable.Fruit;
import OOP.Mission_3.Peellable.Vegetable;

import java.util.ArrayList;

public class Basket extends ArrayList<Object> {

    private double weightBasket = 0;

    public double getWeightBasket(){
        return weightBasket;
    }

    public void addfruitVegetables(Object obj) {
        if (obj instanceof Fruit) {
            Fruit fruit = (Fruit) obj;
            add(fruit);
            weightBasket += fruit.getWeight();
        } else if (obj instanceof Vegetable) {
            Vegetable vegetable = (Vegetable) obj;
            add(vegetable);
            weightBasket += vegetable.getWeight();
        }

    }


    public void addfruitVegetables(ArrayList fruitVegetables) {
        for (int i = 0; i < fruitVegetables.size(); i++) {
            add(fruitVegetables.get(i));
        }
    }


    public void addfruitVegetables(Basket basket) {
        Basket basket1 = new Basket();
        for (int i = 0; i < basket.size(); i++) {
            basket1.add(basket.get(i));
        }
    }

    public Object extractFruitVegetables(int ind) {
        Object obj = get(ind);
        if (obj instanceof Fruit) {
            Fruit fruit = (Fruit) obj;
            weightBasket -= fruit.getWeight();
        } else if (obj instanceof Vegetable) {
            Vegetable vegetable = (Vegetable) obj;
            weightBasket -= vegetable.getWeight();
        }
        return remove(ind);

    }


    public Basket extractAll() {
        for (int i = 0; i < size(); i++) {
            System.out.println("Элемент корзины удален =" + get(i));
        }
        clear();
        System.out.println("Корзина очищена" + size());
        return this;
    }


    public void extractAllFruts() {
        for (int i = 0; i < size(); i++) {
            Object obj = get(i);
            if (obj instanceof Fruit) {
                Fruit fruit = (Fruit) obj;
                System.out.println("Элемент корзины извлечен =" + fruit.getName());
                int index = indexOf(i);
                remove(index);
            }

        }
    }

    public void extractAllVegetables() {
        for (int i = 0; i < size(); i++) {
            Object obj = get(i);
            if (obj instanceof Vegetable) {
                Vegetable vegetable = (Vegetable) obj;
                System.out.println("Элемент корзины извлечен =" + vegetable.getName());
                int index = indexOf(i);
                remove(index);
            }
        }
    }

}
