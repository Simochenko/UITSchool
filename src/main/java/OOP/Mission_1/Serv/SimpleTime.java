package OOP.Mission_1.Serv;

public class SimpleTime {
    public int hours;
    public int minutes;
    public int seconds;

    public SimpleTime(int hours, int minutes, int seconds){
        this.hours = (Math.abs(hours) < 24) ?  Math.abs(hours) : 0;
        this.minutes = (Math.abs(minutes) < 60) ?  Math.abs(minutes) : 0;
        this.seconds = (Math.abs(seconds) < 60) ?  Math.abs(seconds) : 0;
    }

    @Override
    public String toString(){
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
