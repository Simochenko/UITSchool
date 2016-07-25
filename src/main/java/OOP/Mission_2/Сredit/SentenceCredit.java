package OOP.Mission_2.Сredit;

import java.util.ArrayList;

public class SentenceCredit {
    private ArrayList<Credit> credits = new ArrayList<Credit>();

    public SentenceCredit addCredit(Credit credit) {
        credits.add(credit);
        return this;
    }

    public void findCreditName(int name) {
        String result;
        switch (name) {
            case 1: {
                result = "Кредит на покупку машины";
            }
            break;
            case 2: {
                result = "Кредит на покупку квартиры";
            }
            break;
            case 3: {
                result = "Кредит на ремонт квартиры";
            }
            break;
            default: {
                result = "";
            }
        }
        int flg = 0;
        for (int i = 0; i < credits.size(); i++) {
            if (credits.get(i).getName().equals(result)) {
                System.out.println(credits.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такого кредита");
        }
    }
    public void printCredit() {
        for (int i = 0; i < credits.size(); i++) {
            System.out.println(credits.get(i).toString());
        }
    }
}
