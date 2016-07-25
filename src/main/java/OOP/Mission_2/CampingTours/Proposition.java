package OOP.Mission_2.CampingTours;

import java.util.ArrayList;
import java.util.Collections;

public class Proposition {
    private ArrayList<CampingTour> campingTours = new ArrayList<CampingTour>();
    //определяем предложение

    public Proposition addCampingTour(CampingTour campingTour) {
        campingTours.add(campingTour);
        return this;
    }

    //сортировка путевки по сумме
    public void sortCampingTour() {

        Collections.sort(campingTours, new ComparatorCampingTour());

        for (int i = 0; i < campingTours.size(); i++) {
            System.out.println(campingTours.get(i).toString());
        }
    }

    public void findCampingTourTransfer(int transfer,int numberDays,int typeFood) {
        String result;
        String res;
        switch (transfer) {
            case 1: {
                result = "Авиа";
            }
            break;
            case 2: {
                result = "Автобус";
            }
            break;
            case 3: {
                result = "Поезд";
            }
            break;
            default: {
                result = "";
            }
        }
        switch (typeFood) {
            case 1: {
                res = "Все включено";
            }
            break;
            case 2: {
                res = "Завтрак";
            }
            break;
            case 3: {
                res = "Без питания";
            }
            break;
            default: {
                res = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < campingTours.size(); i++) {
            if ((campingTours.get(i).getTransfer().equals(result)) & (campingTours.get(i).getNumberDays()== numberDays) &
                    (campingTours.get(i).getTypeFood().equals(res))){
                System.out.println(campingTours.get(i).toString());
                flg = 1;
            }
        }
        if (flg == 0) {
            System.out.println("Нет такой путевки");
        }
    }


    public void findCampingTourName(int name) {
        String result;
        switch (name) {
            case 1: {
                result = "Отдых на море";
            }
            break;
            case 2: {
                result = "Экскурсии";
            }
            break;
            case 3: {
                result = "Лечение";
            }
            case 4: {
                result = "Шоппинг";
            }
            break;
            case 5: {
                result = "Круиз";
            }

            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < campingTours.size(); i++) {
            if (campingTours.get(i).getName().equals(result)) {
                System.out.println(campingTours.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такой путевки");
        }
    }
}
