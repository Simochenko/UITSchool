package OOP.Mission_3.MultifunctionalHarvester;

import OOP.Mission_3.Peellable.Fruit;
import OOP.Mission_3.Peellable.Vegetable;

import java.util.ArrayList;

public class MultifunctionalHarvester implements Peeller,Cutter,Slicer {



    public MultifunctionalHarvester() {
    }

    private void paramPeell(Object obj,ArrayList fruitVegetables){
        if (obj instanceof Fruit) {
            Fruit fruit = (Fruit) obj;
            fruit.setCleaning(true);
            fruit.setWeight(fruit.getWeight() - ((fruit.getWeight() * 2) / 100));
            System.out.println("Вес после очистки" + " " + fruit.getWeight());
            System.out.println("Вес потерь после  очистки" + " " + (fruit.getWeight() * 2) / 100);
        } else if (obj instanceof Vegetable) {
            Vegetable vegetable = (Vegetable) obj;
            vegetable.setCleaning(true);
            vegetable.setWeight(vegetable.getWeight() - ((vegetable.getWeight() * 5) / 100));
            System.out.println("Вес после очистки" + " " + vegetable.getWeight());
            System.out.println("Вес потерь после  очистки" + " " + (vegetable.getWeight() * 5) / 100);
        }
    }

    @Override
    public void peellItem(Object obj) {
        ArrayList fruitVegetables = null;
        paramPeell(obj,fruitVegetables);

    }

    @Override
    public void peellItems(ArrayList fruitVegetables) {
        for (int i = 0; i < fruitVegetables.size(); i++) {
            Object obj = fruitVegetables.get(i);
           paramPeell(obj,fruitVegetables);

        }

    }

    @Override
    public void cut(Object obj) {
        if (obj instanceof Fruit) {
            Fruit fruit = (Fruit) obj;
            if (fruit.getCleaning() == true) {
                fruit.setWeight(fruit.getWeight() - ((fruit.getWeight() * 2) / 100));
                System.out.println("Вес после шинковки" + " " + fruit.getWeight());
                System.out.println("Вес потерь после  шинковки" + " " + (fruit.getWeight() * 2) / 100);
            } else {
                throw new IllegalArgumentException(fruit.toString() + " " + "не очищен!!!");
            }
        } else if (obj instanceof Vegetable) {
            Vegetable vegetable = (Vegetable) obj;
            if (vegetable.getCleaning() == true) {
                vegetable.setWeight(vegetable.getWeight() - ((vegetable.getWeight() * 5) / 100));
                System.out.println("Вес после шинковки" + " " + vegetable.getWeight());
                System.out.println("Вес потерь после  шинковки" + " " + (vegetable.getWeight() * 5) / 100);
            } else {
                throw new IllegalArgumentException(vegetable.toString() + " " + "не очищен!!!");
            }

        }

    }

    @Override
    public void cutAll(ArrayList fruitVegetables) {
        for (int i = 0; i < fruitVegetables.size(); i++) {
            Object obj = fruitVegetables.get(i);
            if (obj instanceof Fruit) {
                Fruit fruit = (Fruit) obj;
                if (fruit.getCleaning() == true) {
                    fruit.setWeight(fruit.getWeight() - ((fruit.getWeight() * 2) / 100));
                    System.out.println("Вес после шинковки" + " " + fruit.getWeight());
                    System.out.println("Вес потерь после  шинковки" + " " + (fruit.getWeight() * 2) / 100);
                } else {
                    throw new IllegalArgumentException(fruit.toString() + " " + "не очищен!!!");
                }
            } else if (obj instanceof Vegetable) {
                Vegetable vegetable = (Vegetable) obj;
                if (vegetable.getCleaning() == true) {
                    vegetable.setWeight(vegetable.getWeight() - ((vegetable.getWeight() * 5) / 100));
                    System.out.println("Вес после шинковки" + " " + vegetable.getWeight());
                    System.out.println("Вес потерь после  шинковки" + " " + (vegetable.getWeight() * 5) / 100);
                } else {
                    throw new IllegalArgumentException(vegetable.toString() + " " + "не очищен!!!");
                }

            }
        }

    }

    @Override
    public void slicerItem(Object obj) {

        if (obj instanceof Fruit) {
            Fruit fruit = (Fruit) obj;
            if (fruit.getCleaning() == true) {
                fruit.setWeight(fruit.getWeight() - ((fruit.getWeight() * 2) / 100));
                System.out.println("Вес после нарезки" + " " + fruit.getWeight());
                System.out.println("Вес потерь после  нарезки" + " " + (fruit.getWeight() * 2) / 100);
            } else {
                throw new IllegalArgumentException(fruit.toString() + " " + "не очищен!!!");
            }
        } else if (obj instanceof Vegetable) {
            Vegetable vegetable = (Vegetable) obj;
            if (vegetable.getCleaning() == true) {
                vegetable.setWeight(vegetable.getWeight() - ((vegetable.getWeight() * 5) / 100));
                System.out.println("Вес после нарезки" + " " + vegetable.getWeight());
                System.out.println("Вес потерь после нарезки" + " " + (vegetable.getWeight() * 5) / 100);
            } else {
                throw new IllegalArgumentException(vegetable.toString() + " " + "не очищен!!!");
            }

        }

    }

    @Override
    public void slicerItems(ArrayList fruitVegetables) {
        double weight = 0;
        for (int i = 0; i < fruitVegetables.size(); i++) {
            Object obj = fruitVegetables.get(i);
            if (obj instanceof Fruit) {
                Fruit fruit = (Fruit) obj;
                if (fruit.getCleaning() == true) {
                    fruit.setWeight(fruit.getWeight() - ((fruit.getWeight() * 2) / 100));
                    System.out.println("Вес после нарезки" + " " + fruit.getWeight());
                    System.out.println("Вес потерь после  нарезки" + " " + (fruit.getWeight() * 2) / 100);
                } else {
                    throw new IllegalArgumentException(fruit.toString() + " " + "не очищен!!!");
                }
            } else if (obj instanceof Vegetable) {
                Vegetable vegetable = (Vegetable) obj;
                if (vegetable.getCleaning() == true) {
                    vegetable.setWeight(vegetable.getWeight() - ((vegetable.getWeight() * 5) / 100));
                    System.out.println("Вес после нарезки" + " " + vegetable.getWeight());
                    System.out.println("Вес потерь после  нарезки" + " " + (vegetable.getWeight() * 5) / 100);
                } else {
                    throw new IllegalArgumentException(vegetable.toString() + " " + "не очищен!!!");
                }

            }
        }

    }
}