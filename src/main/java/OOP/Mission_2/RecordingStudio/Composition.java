package OOP.Mission_2.RecordingStudio;

public class Composition {
    private String name;
    private int   duration;
    private int style;
    private int trackLength;



    public Composition() {
    }

    public  Composition(String name, int duration, int style, int trackLength) {
        this.name = name;
        this.duration = duration;
        this.style = style;
        this.trackLength = trackLength;
    }
    public Composition(String name, int duration) {
        this.name = name;
        this.duration = duration;

    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setStyle(int style) {
        this.style = style;
    }

    public int getStyle() {
        return style;
    }

    public void setTrackLength(int trackLength) {
        this.trackLength = trackLength;
    }

    public int getTrackLength() {
        return trackLength;
    }
    @Override
    public String toString() {
        return "Композиция:" + " " + name + " " + "Продолжительность =" + duration + " " + "Стиль = " + " "
                + style+ " " + "Длина трека =" +trackLength ;
    }
}
