package OOP.Mission_1.Article;

import OOP.Mission_1.Serv.Filter;
import OOP.Mission_1.Serv.MainService;

public class Car extends Article {
    public String brand;
    public String model;
    public short year;
    public String color;
    public String number;

    public Car(Article article){
        super(article);
    }

    public Car(Article article, String brand, String model, short year, String color,
               String number){
        super(article);
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.number = number;
    }

    public Car(int id, float price, String brand, String model, short year, String color,
               String number){
        this.id = id;
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.number = number;
    }

    public void setCarSettings(String brand, String model, short year, String color,
                               String number){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString(){
        return "Car :\nbrand : " + this.brand + ", model : " + this.model + "\n" +
                super.toString() + "year : " + this.year + "\ncolor : " + this.color +
                "reg. № : " + this.number + "\n";
    }

    public void filterApply(Filter filter){
        switch (filter.mode){
            case 'b':
                if (this.brand.equals(filter.brand)){
                    System.out.println(this.toString());
                }
                break;
            case 'm':
                if ((this.model.equals(filter.model)) && ((MainService.getCurrentYear() - filter.expYears) > this.year)){
                    System.out.println(this.toString());
                }
                break;
            case 'y':
                if ((this.year == filter.year) && (this.price > filter.price)){
                    System.out.println(this.toString());
                }
                break;
        }
    }
}
