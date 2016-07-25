package OOP.Mission_2.HomeDevice;

public class FenHomeDevice extends HomeDevice {

    private final static String name = "Фен";

    FenHomeDevice(double power, boolean switched, int voltage) {
        super(name, power, switched, voltage);
    }
    FenHomeDevice(double power) {
        super(name, power);
    }
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public void switchOn(){
        super.switchOn();
        System.out.println(this+" включен в розетку!");
    }
    @Override
    public void switchOff(){
        super.switchOff();
        System.out.println(this+" выключен из розетки!");
    }
}
