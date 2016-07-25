package OOP.Mission_2.HomeDevice;

public class HomeDevice {
    private String name;
    private double power;
    private boolean switched = false;
    private int voltage;


    public HomeDevice() {
    }

    public HomeDevice(String name, double power, boolean switched, int voltage) {
        this.name = name;
        this.power = power;
        this.switched = switched;
        this.voltage = voltage;
    }

    public HomeDevice(String name, double power) {
        this.name = name;
        this.power = power;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setSwitched(boolean switched) {
        this.switched = switched;
    }

    public boolean getSwitched() {
        return switched;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getVoltage() {
        return voltage;
    }

    @Override
    public String toString() {
        return "Электроприбор:" + " " + name + " " + "Мощностью =" + power + " "+
                " " + "Используемое напряжение сети =" + voltage;
    }
    public void switchOn(){
        this.switched = true;
    }

    public void switchOff(){
        this.switched = false;
    }
}
