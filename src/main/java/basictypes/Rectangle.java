package BasicTypes;

public class Rectangle {
    public static void main(String[] args) {
        double side_a = 5.5;
        double side_b = 3.6;
        double perimeter;
        double area;
        perimeter =(side_a + side_b)*2;
        System.out.println("Периметр прямоугольниа равен: " + perimeter);
        area = side_a*side_b;
        System.out.println("Площадь прямоугольника равна: " + area);

    }
}

