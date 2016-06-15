package BasicTypes;

public class Cylinder {
    public static void main(String[] args) {
        int radius_R = 3;
        double height_h = 2.5;
        int radius_r = 2;
        double cylinder_volume;
        double cylinder_volume_hollow;
        double side_surface;
        cylinder_volume= Math.PI * (Math.pow(radius_R,2)*height_h);
        System.out.println("Объем цилиндра равен: " + cylinder_volume);
        cylinder_volume_hollow = Math.PI *height_h* (Math.pow(radius_R,2) - Math.pow(radius_r,2));
        System.out.println("Объем полого цилиндра равен: " + cylinder_volume_hollow);
        side_surface = 2*Math.PI*radius_R*height_h;
        System.out.println("Площадь боковой поверхности цилиндра равна: "+ side_surface);
    }
}
