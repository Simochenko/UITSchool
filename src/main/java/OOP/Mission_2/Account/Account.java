package OOP.Mission_2.Account;

public class Account {
    private String name;
    private double ammount;
    private int status;
    private double balans;


    public Account() {
    }

    public Account(String name, double ammount, int status, double balans) {
        this.name = name;
        this.ammount = ammount;
        this.status = status;
        this.balans = balans;
    }

    public Account(String name, double ammount) {
        this.name = name;
        this.ammount = ammount;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setBalans(double balans) {
        this.balans = balans;
    }

    public double getBalans() {
        return balans;
    }

    @Override
    public String toString() {
        return "Счет" + " " + name + "  " + "Сумма =" + " " + ammount + " "
                + "грн." + " " + "Статус=" + " " + status + " " + "Баланс счета= " + " " + balans;
    }
}
