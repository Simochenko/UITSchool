package OOP.Mission_2.HomeDevice;

public class MicrowaveHomeDevice extends HomeDevice {

    private final static String name = "Микроволновка";

    MicrowaveHomeDevice(double power, boolean state, int voltage) {
        super(name, power, state, voltage);
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
