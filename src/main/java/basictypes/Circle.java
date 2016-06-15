package BasicTypes;

public class Circle {
    public static void main(String args[])
    {
        int radius_R = 3;
        int radius_r = 2;
        double square_ring;
        double circumference;
        double circle_area;
        square_ring= Math.PI * (Math.pow(radius_R,2) - Math.pow(radius_r,2));
        System.out.println("Площадь кольца равна: " + square_ring);
        circumference= Math.PI * 2*radius_R;
        System.out.println("Длина окружности равна: " + circumference) ;
        circle_area= Math.PI * (Math.pow(radius_R,2));
        System.out.println("Площадь окружности равна: " + circle_area) ;
    }
}
