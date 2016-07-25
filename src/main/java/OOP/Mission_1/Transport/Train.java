package OOP.Mission_1.Transport;

import OOP.Mission_1.Serv.Filter;
import OOP.Mission_1.Serv.MainService;
import OOP.Mission_1.Serv.SimpleTime;
import OOP.Mission_1.Serv.PlacesTrain;

public class Train extends Transport {
    public PlacesTrain places;

    public Train(Transport transport){
        super(transport);
    }

    public Train(int routeNumber, SimpleTime departureTime, String destination){
        super(routeNumber, departureTime, destination);
    }

    public Train(int routeNumber, SimpleTime departureTime, String destination,
                 PlacesTrain places){
        super(routeNumber, departureTime, destination);
        this.places = places;
    }

    public Train(Transport transport, PlacesTrain places){
        super(transport);
        this.places = places;
    }

    public void setPlaces(PlacesTrain places){
        this.places = places;
    }

    public String getPlaces(){
        return this.places.toString();
    }

    @Override
    public String toString(){
        return "Train :\n" + super.toStringFull() + this.getPlaces();
    }

    public void filterApply(Filter filter){
        switch (filter.mode){
            case 'd':
                if (this.destination.equals(filter.destination)){
                    System.out.println(this.toString());
                }
                break;
            case 'a':
                if ((this.destination.equals(filter.destination)) &&
                        (MainService.simpleTimeCompare(this.departureTime, filter.departureTime, '>'))){
                    System.out.println(this.toString());
                }
                break;
        }
    }
}
