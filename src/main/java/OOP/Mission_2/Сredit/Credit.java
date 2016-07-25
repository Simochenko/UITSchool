package OOP.Mission_2.Сredit;

public class Credit {
    private String name;
    private double ammount;
    private String  bank ;
    private String refinans ;

    public Credit() {
    }

    public Credit(String name, double ammount, String bank, String refinans) {
        this.name = name;
        this.ammount = ammount;
        this.bank = bank;
        this.refinans = refinans;
    }
    public Credit(String name, double ammount) {
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
    public void setBank(String bank) {
        this.bank = bank;
    }
    public String getBank() {
        return bank;
    }
    public void setRefinans(String refinans) {
        this.refinans = refinans;
    }
    public String getRefinans() {
        return refinans;
    }
    @Override
    public String toString() {
        return "Кредит" + " " + name + "  "+"Сумма =" +" "+ ammount + " "
                +"грн."+" "+"Банк=" + " " + bank+" "+"Возможность пополения или досрочного погашения  = " +" "
                +refinans;
    }
}
