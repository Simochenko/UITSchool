package OOP.Mission_1.Article;

import OOP.Mission_1.Serv.Filter;

public class Product extends Article {
    public String name;
    public long UPC;
    public String manufacturer;
    public short storageMonthes;

    public Product(Article article){
        super(article);
    }

    public Product(Article article, String name, long UPC, String manufacturer,
                   short storageMonthes){
        super(article);
        this.name = name;
        this.UPC = UPC;
        this.manufacturer = manufacturer;
        this.storageMonthes = storageMonthes;
    }

    public Product(int id, float price, String name, long UPC, String manufacturer,
                   short storageMonthes){
        this.id = id;
        this.price = price;
        this.name = name;
        this.UPC = UPC;
        this.manufacturer = manufacturer;
        this.storageMonthes = storageMonthes;
    }

    public void setProductSettings(String name, long UPC, String manufacturer,
                                   short storageMonthes){
        this.name = name;
        this.UPC = UPC;
        this.manufacturer = manufacturer;
        this.storageMonthes = storageMonthes;
    }

    @Override
    public String toString(){
        return "Product : \nname : " +this.name + "\nUPC : " + this.UPC + "\n" + super.toString() +
                "manufacturer : " + this.manufacturer + "\nstorage terms : " +
                this.storageMonthes + "\n";
    }

    public void filterApply(Filter filter){
        switch (filter.mode){
            case 'n':
                if (this.name.equals(filter.name)){
                    System.out.println(this.toString());
                }
                break;
            case 'p':
                if ((this.name.equals(filter.name)) && (this.price <= filter.price)){
                    System.out.println(this.toString());
                }
                break;
            case 't':
                if (this.storageMonthes > filter.storageMonthes){
                    System.out.println(this.toString());
                }
                break;
        }
    }

}
