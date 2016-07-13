package BasicTypes;

import java.util.Scanner;

public class Geometric {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        // задание 1  окружность и кольцо

        float pi=3.14f, minR, maxR;

        System.out.println("Введите внешний радиус окружности :");
        maxR=s.nextFloat();
        System.out.println("Введите внутренний радиус окружности :");
        minR=s.nextFloat();
        System.out.println("Длинна окружности  : "+circleLength(pi, maxR));
        System.out.println("Площадь окружности : "+circleArea(pi, maxR));
        System.out.println("Площадь кольца : "+ringArea(pi, minR, maxR));
        System.out.println();


        //заданию 2 треугольник
        float a, b, c;

        System.out.println("Введите первую сторону треугольника :");
        a=s.nextFloat();
        System.out.println("Введите вторую сторону треугольника :");
        b=s.nextFloat();
        System.out.println("Введите третью сторону треугольника :");
        c=s.nextFloat();
        System.out.println("Периметр  треугольника : "+trianglePerimeter(a, b, c));
        System.out.println("Площадь треугольника : "+triangleArea(a, b, c));
        System.out.println();

        //заданию 3 прямоугольник

        System.out.println("Введите первую сторону прямоугольника :");
        a=s.nextFloat();
        System.out.println("Введите вторую сторону прямоугольника :");
        b=s.nextFloat();
        System.out.println("Периметр прямоугольника : "+rectanglePerimeter(a, b));
        System.out.println("Площадь прямоугольника : "+rectangleArea(a, b));
    }
    // метод к заданию 1
    public static float circleLength(float pi, float radius){
        return 2*pi*radius;
    }

    public static float circleArea(float pi, float radius){
        return pi*radius*radius;
    }

    public static float ringArea(float pi, float minR, float maxR){
        return pi*(maxR*maxR-minR*minR);
    }

    // метод к заданию 2
    public static float trianglePerimeter(float a, float b, float c){
        return a+b+c;
    }

    public static double triangleArea(float a, float b, float c){
        float p;
        p=trianglePerimeter(a, b, c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    // метод к заданию 3

    public static float rectanglePerimeter(float a, float b){
        return a*2+b*2;
    }

    public static float rectangleArea(float a, float b){
        return a*b;
    }

}
