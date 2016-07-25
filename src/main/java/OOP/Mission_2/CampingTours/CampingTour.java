package OOP.Mission_2.CampingTours;

public class CampingTour {
    private String name;
    private double ammount;
    private String  typeFood ;
    private int numberDays ;
    private String transfer ;
    private String  country ;



    public CampingTour() {
    }

    public CampingTour(String name, double ammount, String typeFood, int numberDays, String transfer, String country) {
        this.name = name;
        this.ammount = ammount;
        this.typeFood = typeFood;
        this.numberDays = numberDays;
        this.transfer = transfer;
        this.country = country;
    }
    public CampingTour(String name, double ammount, String country) {
        this.name = name;
        this.ammount = ammount;
        this.country = country;
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
    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }
    public String getTypeFood() {
        return typeFood;
    }
    public void setNumberDays(int numberDays) {
        this.numberDays = numberDays;
    }
    public double getNumberDays() {
        return numberDays;
    }
    public void setTransfer(String transfer) {
        this.transfer = transfer;
    }
    public String getTransfer() {
        return transfer;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountry() {
        return country;
    }
    @Override
    public String toString() {
        return "Путевка" + " " + name + "  "+"Сумма =" +" "+ ammount + " "
                +"грн."+" "+"Тип питания=" + " " + typeFood+" "+"Количество дней = " +" "
                +numberDays+" "+"Доставка=" + " " +transfer+" "+"Страна=" + " " + country;
    }
}
