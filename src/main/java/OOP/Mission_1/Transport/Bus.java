package OOP.Mission_1.Transport;

import OOP.Mission_1.Serv.Filter;

public class Bus extends Transport{
    public String driverLastName;
    public String busNumber;
    public String busBrand;
    public int startYear;
    public int mileage;

    public Bus(Transport transport){
        this.routeNumber = transport.routeNumber;
    }

    public Bus(int routeNumber, String driverLastName, String busNumber,
               String busBrand, int startYear, int mileage){
        super(routeNumber);
        this.driverLastName = driverLastName;
        this.busNumber = busNumber;
        this.busBrand = busBrand;
        this.startYear = startYear;
        this.mileage = mileage;
    }

    public void setBus(String driverLastName, String busNumber, String busBrand,
                       short startYear, int mileage){
        this.driverLastName = driverLastName;
        this.busNumber = busNumber;
        this.busBrand = busBrand;
        this.startYear = startYear;
        this.mileage = mileage;
    }

    @Override
    public String toString(){
        return "Bus: \n Number: " + this.busNumber + ", brand: "+this.busBrand + "\n" +
                super.toString() + "\n" + "Start of expluatation: " + this.startYear +
                ", mileage: " + this.mileage + "\n" + "Driver: " + this.driverLastName;
    }

    public void filterApply(Filter filter){
        switch (filter.mode){
            case 'r':
                if (this.routeNumber == filter.routeNumber){
                    System.out.println(this.toString());
                }
                break;
            case 'y':
                if (this.startYear < filter.startYear){
                    System.out.println(this.toString());
                }
                break;
            case 'm':
                if (this.mileage > filter.mileage){
                    System.out.println(this.toString());
                }
                break;
        }
    }
}
