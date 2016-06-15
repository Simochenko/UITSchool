package BasicTypes;

public class Cuboid {
    public static void main(String[] args) {
        double side_a = 3.5;
        int side_b = 2;
        double height_h = 2.5;
        double cuboid_S;
        double cuboid_V;
        cuboid_S=2*(side_a*side_b+side_a*height_h+side_b*height_h);
        System.out.println("Площадь прямоугольного параллепипеда равна "+cuboid_S);
        cuboid_V= side_a*side_b*height_h;
        System.out.println(" Объём прямоугольного параллепипеда равен " + cuboid_V);
    }
}
