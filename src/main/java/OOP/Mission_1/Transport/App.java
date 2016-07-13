package OOP.Mission_1.Transport;

import OOP.Service.Connection;
import OOP.Service.MainService;
import OOP.Service.SimpleTime;
import OOP.Service.PlacesTrain;

public class App {
    public static void main(String[] args) {
        byte i;
        Short personsNumber = MainService.arrayLength();
        if (personsNumber < 1){
            System.exit(0);
        }
        String[] destinations = {"Kharkov", "Kiev", "Moskva", "Sochi", "Parizh",
                "Tokio", "Madrid"};
        String[] drivers = {"Kucherov E.R.", "Ivanov I. I.", "Barschev A.V.",
                "Pryanikov P.R.", "Drevonyuh D.Z.", "Karablov Z.E."};
        String[] busNumbers = {"TT 3794 FE", "NM 6772 EI", "BG 5466 BB", "RT 2345 AX",
                "UJ 1111 BP"};
        String[] busBrands = {"Ikarus", "Mercedes", "WV", "Kraz",
                "Volvo", "Tata"};
        String[] airplaneTypes = {"long-range", "middle-range", "short-range",
                "local"};
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
                "Saturday", "Sunday"};
        Train[] trains = new Train [personsNumber];
        Bus[] buses = new Bus [personsNumber];
        Airline[] airplanes = new Airline [personsNumber];
        int trainGeneral = 80;
        int trainCoupe = 300;
        int trainPlatzkart = 150;
        int trainLuxury = 1200;
        short year = MainService.getCurrentYear();
        int maxMileage = 500000;

        for (i = 0; i < personsNumber; i++){
            trains[i] = new Train(newTransportFullInit(destinations));
            trains[i].setPlaces(new PlacesTrain((int)(Math.random() * trainGeneral),
                    (int)(Math.random() * trainCoupe),
                    (int)(Math.random() * trainPlatzkart),
                    (int)(Math.random() * trainLuxury)));
            buses[i] = new Bus(newTransportInit());
            buses[i].setBus(drivers[(int)(Math.random() * (drivers.length - 1))],
                    busNumbers[(int)(Math.random() * (busNumbers.length - 1))],
                    busBrands[(int)(Math.random() * (busBrands.length - 1))],
                    (short)(Math.random() * (year - 1980) + 1980),
                    (int)(Math.random() * maxMileage));
            airplanes[i] = new Airline(newTransportFullInit(destinations));
            airplanes[i].setAirplaneSettings(airplaneTypes[(int)(Math.random() * (airplaneTypes.length - 1))],
                    weekDays[(int)(Math.random() * (weekDays.length - 1))]);
        }

        appExecute(trains, buses, airplanes);
    }



    public static Transport newTransportInit(){
        return new Transport((int) (Math.random() * 99999 + 1));
    }

    public static Transport newTransportFullInit(String[] destination){
        return new Transport((int)(Math.random() * 99999 + 1),
                new SimpleTime((int)(Math.random() * 24),
                        (int)(Math.random() * 60),
                        (int)(Math.random() * 60)),
                destination[(int)(Math.random() * (destination.length - 1))]);
    }

    public static void appExecute(Train[] trains, Bus[] buses, Airline[] airplanes){
        boolean repeat = true;
        char classList;

        while(repeat){
            classList = Connection.getFirstChar("Enter type of array for work : (t)rain, " +
                    "(b)us or (a)irline : ");
            switch (classList){
                case 't':
                    MainService.showAllItems(trains);
                    MainService.trainLists(trains);
                    break;
                case 'b':
                    MainService.showAllItems(buses);
                    MainService.busLists(buses);
                    break;
                case 'a':
                    MainService.showAllItems(airplanes);
                    MainService.airplaneLists(airplanes);
                    break;
                default:
                    System.out.println("Incorrect type!");
            }
            repeat = (Connection.getFirstChar("One list more? (y/n) : ") != 'n');
        }
    }
}
