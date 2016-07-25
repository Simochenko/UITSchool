package OOP.Mission_2.Account;

import java.util.Scanner;

public class ShowAccount {
    public void AccountInit() {
        Client client = createClient();
        System.out.println("Общиая сумма счетов = " + client.getAmount() + " "
                + "Сумма  положительного баланса =  " + " " + client.getAmountPositivBalans() + " "
                + "Сумма по отрицательного баланса =  " + " " + client.getAmountNegativBalans());
        consolIO(client);
    }

    public static Client createClient() {
        Account current = new CurrentAccount(2000.00, 1, 5000);
        Account depozit = new DepozitAccount(50000.00, 1, 0);
        Account card = new CardAccount(0.00, 0, -5000);


        Client client = new Client();
        client.addAccount(current);
        client.addAccount(depozit);
        client.addAccount(current);
        return client;
    }

    public static void consolIO(Client client) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Чтобы найти счет по статусу, нажмите   : 1 ");
            System.out.println("Для сортировки счетов по сумме, нажмите  : 2 ");
            try {
                int result = Integer.parseInt(sc.next());
                switch (result) {
                    case 1: {
                        System.out.println("Введите статус: (1-разблок. 0-заблок.) ");
                        int r1 = Integer.parseInt(sc.next());
                        client.findAccount(r1);
                    }
                    break;
                    case 2: {
                        client.sortAccount();
                    }
                    break;
                    default: {
                        end = true;
                    }
                }
            } catch (Exception e) {
                end = true;
            }
            System.out.println("Желаете продолжить: (1 -Да,0-Нет) ");
            int contunue = Integer.parseInt(sc.next());
            if (contunue == 1) {
                end = false;
            } else {
                end = true;
            }
        }
    }
}
