package OOP.Mission_1.Serv;

public class PlacesTrain {
    public int general;
    public int coupe;
    public int platzkart;
    public int luxury;

    public PlacesTrain(int general, int coupe, int platzkart, int luxury){
        this.general = general;
        this.coupe = coupe;
        this.platzkart = platzkart;
        this.luxury = luxury;
    }

    @Override
    public String toString(){
        return "places in train --> general: " + this.general + ", coupe: " +
                this.coupe + ", platzkart: " + this.platzkart + ", luxury: " +
                this.luxury;
    }
}
