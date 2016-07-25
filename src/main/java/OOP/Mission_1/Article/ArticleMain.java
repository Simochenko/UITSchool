package OOP.Mission_1.Article;

import OOP.Mission_1.Serv.Connection;
import OOP.Mission_1.Serv.MainService;

public class ArticleMain {
    public static void main(String[] args) {
        byte i;
        Short personsNumber = MainService.arrayLength();
        if (personsNumber < 1){
            System.exit(0);
        }
        String[] bookNames = {"Taras Bulba", "Kot v sapogah", "Moydodur", "Algebra", "Gyrnal Murzilka",
                "Gore ot uma", "Gerasim"};
        String[] authors = {"Shevchenko", "Grimm", "Bezkrovnuy", "Gans", "Kamikadze",
                "Karneev"};
        String[] publishings = {"Doyarka", "Zorya svetlaya", "Pyt"};
        String[] covers = {"soft", "hard"};
        String[] streets = {"Nayki", "Proletarskaya", "Ordgo", "Kievskaya",
                "Vaskina", "Vostochnaya", "Esenina"};
        String[] buildingTypes = {"whitebrick", "panel"};
        String[] numbers = {"TT 3794 FE", "NM 6772 EI", "BG 5466 BB", "RT 2345 AX",
                "UJ 1111 BP"};
        String[] brands = {"ZAZ", "SKODA", "BMW", "LAZ", "Audi", "VAZ"};
        String[] models = {"Fabia", "A7", "RS", "X5", "lada 6", "TT"};
        String[] colors = {"white", "black", "silver", "red", "gold", "blue", "cherry"};
        String[] productNames = {"milk", "chokolate", "voda", "kvas", "slon",
                "oil", "vodka"};
        String[] manufacturers = {"Roganskaya", "CocaCala", "Lays", "Rogan Pivo", "Saltovskiy",
                "Hortica"};
        Book[] books = new Book [personsNumber];
        House[] houses = new House [personsNumber];
        Car[] cars = new Car [personsNumber];
        Product[] products = new Product [personsNumber];
        short year = MainService.getCurrentYear();
        short pages = 1000;
        short apartments = 300;
        float square = 500;
        byte floors = 50;
        byte roomsNumber = 10;
        byte exploitTerm = 100;
        byte carAge = 50;
        short maxTerm = 24;
        long UPC = 999999999998l;

        for (i = 0; i < personsNumber; i++){
            books[i] = new Book(thingInit(i+1));
            books[i].setBookSettings(bookNames[(int)(Math.random() * (bookNames.length - 1))],
                    authors[(int)(Math.random() * (authors.length - 1))],
                    publishings[(int)(Math.random() * (publishings.length - 1))],
                    (short)(Math.random() * (year - 1800) + 1800),
                    (short)(Math.random() * (pages - 20) + 20),
                    covers[(int)(Math.random() * (covers.length - 1))]);
            houses[i] = new House(thingInit(i+1));
            houses[i].setHouseSettings((short)(Math.random() * (apartments - 1) + 1),
                    (float)(Math.random() * (square - 30) + 30),
                    (byte)(Math.random() * (floors - 1) + 1),
                    (byte)(Math.random() * (roomsNumber - 1) + 1),
                    streets[(int)(Math.random() * (streets.length - 1))],
                    buildingTypes[(int)(Math.random() * (buildingTypes.length - 1))],
                    (byte)(Math.random() * exploitTerm));
            cars[i] = new Car(thingInit(i+1));
            cars[i].setCarSettings(brands[(int)(Math.random() * (brands.length - 1))],
                    models[(int)(Math.random() * (models.length - 1))],
                    (short)(year - (Math.random() * carAge)),
                    colors[(int)(Math.random() * (colors.length - 1))],
                    numbers[(int)(Math.random() * (numbers.length - 1))]);
            products[i] = new Product(thingInit(i+1));
            products[i].setProductSettings(productNames[(int)(Math.random() * (productNames.length - 1))],
                    (long)(Math.random() * UPC + 1),
                    manufacturers[(int)(Math.random() * (manufacturers.length - 1))],
                    (short)(Math.random() * (maxTerm - 1) + 1));
        }

        appExecute(books, houses, cars, products);
    }



    public static Article thingInit(int id){
        return new Article(id, (float)(Math.random() * 1000 + 1));
    }

    public static void appExecute(Book[] books, House[] houses, Car[] cars, Product[] products){
        boolean repeat = true;
        char classList;

        while(repeat){
            classList = Connection.getFirstChar("data type for : (b)ooks, " +
                    "(h)ouses, (c)ars or (p)roducts : ");
            switch (classList){
                case 'b':
                    MainService.showAllItems(books);
                    MainService.bookLists(books);
                    break;
                case 'h':
                    MainService.showAllItems(houses);
                    MainService.houseLists(houses);
                    break;
                case 'c':
                    MainService.showAllItems(cars);
                    MainService.carLists(cars);
                    break;
                case 'p':
                    MainService.showAllItems(products);
                    MainService.productLists(products);
                    break;
                default:
                    System.out.println("Incorrect type!");
            }
            repeat = (Connection.getFirstChar("another list? (y/n) : ") != 'n');
        }
    }
}
