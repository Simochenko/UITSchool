package BasicTypes;

public class Triangle {
    public static void main(String[] args) {
        double side_a = 3.5;
        int side_b = 2;
        int side_c = 5;
        int base_d = 3;
        double height_h = 2.5;
        double perimeter;
        double area;
        perimeter= side_a + side_b + side_c;
        System.out.println("Периметр треугольника равен: " + perimeter);
        area= (0.5*base_d*height_h);
        System.out.println("Площадь треугольника равна: " + area);

    }
}
