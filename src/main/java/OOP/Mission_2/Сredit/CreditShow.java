package OOP.Mission_2.Сredit;

import java.util.Scanner;

public class CreditShow {
    public void CreditInit() {

        SentenceCredit sentenceCredit = creatSentenceCredit();
        System.out.println(" Список всех кредитных предложений различных банков ");
        sentenceCredit.printCredit();
        consolIO(sentenceCredit);

    }

    public static SentenceCredit creatSentenceCredit() {
        Credit Car = new CarCredit(300000.00, "Юникредит", "Да");
        Credit Car1 = new CarCredit(250000.00, "ВТБ", "Да");
        Credit Flat = new FlatCredit(500000.00, "Юникредит", "Нет");
        Credit Flat1 = new FlatCredit(65000.00, "ВТБ", "Нет");
        Credit repair = new RepairCredit(100000.00, "Приват", "Нет");
        Credit repair1 = new RepairCredit(330000.00, "ВТБ", "Нет");

        SentenceCredit propositionCredit = new SentenceCredit();
        propositionCredit.addCredit(Car);
        propositionCredit.addCredit(Car1);
        propositionCredit.addCredit(Flat);
        propositionCredit.addCredit(Flat1);
        propositionCredit.addCredit(repair);
        propositionCredit.addCredit(repair1);
        return propositionCredit;
    }

    public static void consolIO(SentenceCredit propositionCredit) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Для кредита выберите ");
            System.out.println("Кредит  на машину : 1 ");
            System.out.println("Кредит  на квартиру : 2 ");
            System.out.println("Кредит  на ремонт : 3 ");
            try {
                int result = Integer.parseInt(sc.next());
                propositionCredit.findCreditName(result);
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
