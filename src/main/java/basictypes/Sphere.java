package basictypes;

public class Sphere {
    public static void main(String[] args) {
        int radius_R = 3;
        double volume_sphere;
        double area_sphere;
        volume_sphere= (4*Math.PI *Math.pow(radius_R,3))/3;
        System.out.println("Объем шара равен: " + volume_sphere);
        area_sphere = (4*Math.PI *Math.pow(radius_R,2));
        System.out.println("Площадь поверхности шара равна: " + area_sphere);

    }
}
