package OOP.Mission_2.Account;

import java.util.Comparator;

public class ComparatorClient implements Comparator<Account> {
    @Override
    public int compare(Account acc1, Account acc2) {
        return Double.compare(acc1.getAmmount(), acc2.getAmmount());

    }
}
