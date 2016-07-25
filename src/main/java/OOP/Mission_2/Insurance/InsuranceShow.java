package OOP.Mission_2.Insurance;

import java.util.Scanner;

public class InsuranceShow {

    public void InsuranceInit() {

    Contract contract = createContract();
    System.out.println("Стоимость договора  " + " " + contract.getPrice() + " " + "грн");
    consolIO(contract);

}

    public static Contract createContract() {
        Liability voluntary = new VoluntaryLiability(235.32, 3, 2000, "Зигзагов");
        Liability compulsory = new CompulsoryLiability(203.55, 4, 20000, "Смирнов");
        Liability social = new SocialLiability(655.35, 5, 500000, "Дергунов");
        Liability voluntary1 = new VoluntaryLiability(2000.00, 2, 12500, "Короленко");
        Liability social1 = new SocialLiability(325.25, 3, 50000, "Рощин");


        Contract сontract = new Contract();
        сontract.addLiability(voluntary);
        сontract.addLiability(compulsory);
        сontract.addLiability(social);
        сontract.addLiability(voluntary1);
        сontract.addLiability(social1);
        return сontract;
    }

    public static void consolIO(Contract contract) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Сортировка обязательств по уменьшению степени   риска  нажмите   : 1 ");
            System.out.println("Сортировка по  диапазону суммы страхового взноса нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        contract.sortLiability();
                    }
                    break;
                    case 2: {
                        findСommitmentDiapazon(contract, sc);
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

    public static void findСommitmentDiapazon(Contract contract, Scanner sc) {
        System.out.println("Введите начальный диапазон суммы. ");
        int r1 = Integer.parseInt(sc.next());
        System.out.println("Введите конечный диапазон суммы. ");
        int r2 = Integer.parseInt(sc.next());
        contract.findСommitment(r1, r2);
    }
}
