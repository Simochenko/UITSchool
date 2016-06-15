package BasicTypes;

public class Tetrahedron {
    public static void main(String[] args) {
        double side_a = 3.5;
        int side_b = 2;
        int side_c = 5;
        double height_h = 2.5;
        double tetrahedron_V;
        double tetrahedron_S;
        tetrahedron_V = (side_a * side_b * side_c * height_h) / 3;
        System.out.println("Объём тетраэдра равен: " + tetrahedron_V);
        tetrahedron_S= Math.sqrt(3)*Math.pow(side_a,2);
        System.out.println("Площадь тетраэдра равна " + tetrahedron_S);
    }
}
