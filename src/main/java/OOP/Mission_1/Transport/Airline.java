package OOP.Mission_1.Transport;

import OOP.Service.Filter;
import OOP.Service.MainService;

public class Airline extends Transport {
    public String airplaneType;
    public String weekDays;

    public Airline(Transport transport) {
        super(transport);
    }

    public Airline(Transport transport, String airplaneType, String weekDays) {
        super(transport);
        this.airplaneType = airplaneType;
        this.weekDays = weekDays;
    }

    public void setAirplaneSettings(String airplaneType, String weekDays) {
        this.airplaneType = airplaneType;
        this.weekDays = weekDays;
    }

    public String getAirplaneData(){
        return "Type of this airplane: " + this.airplaneType + "\n" +
                "Airplane is flying by " + this.weekDays;
    }

    @Override
    public String toString(){
        return "Airplain :\n" + super.toStringFull() + this.getAirplaneData();
    }

    public void filterApply(Filter filter){
        switch (filter.mode){
            case 'd':
                if (this.destination.equals(filter.destination)){
                    System.out.println(this.toString());
                }
                break;
            case 'w':
                if (this.weekDays.equals(filter.weekDays)){
                    System.out.println(this.toString());
                }
                break;
            case 't':
                if (this.weekDays.equals(filter.weekDays) &&
                        MainService.simpleTimeCompare(this.departureTime, filter.departureTime, '>')){
                    System.out.println(this.toString());
                }
                break;
        }
    }
}
