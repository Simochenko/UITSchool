package OOP.Mission_2.HomeDevice;

public class WasherHomeDevice  extends HomeDevice {

    private final static String name = "Стиральная машина";

    WasherHomeDevice(double power, boolean state, int voltage) {
        super(name, power, state, voltage);
    }
    WasherHomeDevice(double power) {
        super(name, power);
    }
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public void switchOn(){
        super.switchOn();
        System.out.println(this+" включена в розетку!");
    }
    @Override
    public void switchOff(){
        super.switchOff();
        System.out.println(this+" выключена из розетки!");
    }
}
