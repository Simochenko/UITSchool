package OOP.Mission_1.Transport;

import OOP.Mission_1.Serv.SimpleTime;

public class Transport {
    public int routeNumber;
    public SimpleTime departureTime;
    public String destination;

    public Transport(){}

    public Transport(int routeNumber){
        this.routeNumber = routeNumber;
    }

    public Transport(Transport transport){
        this.routeNumber = transport.routeNumber;
        this.destination = transport.destination;
        this.departureTime = transport.departureTime;
    }

    public Transport(int routeNumber, SimpleTime departureTime, String destination){
        this.routeNumber = routeNumber;
        this.departureTime = departureTime;
        this.destination = destination;
    }

    @Override
    public String toString(){
        return "Route number : " + this.routeNumber;
    }

    public String toStringFull(){
        return "Route number : " + this.routeNumber + "\n" + "Destination: " +
                this.destination + "\n" + "Departure: " + this.departureTime + "\n";
    }
}
