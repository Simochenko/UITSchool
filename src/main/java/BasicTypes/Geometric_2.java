package BasicTypes;

import java.util.Scanner;


public class Geometric_2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Цилиндр

        float pi=3.14f, maxR, minR, height;

        System.out.println("Введите внешний радиус цилиндра :");
        maxR=s.nextFloat();
        System.out.println("Введите внутренний радиус цилиндра :");
        minR=s.nextFloat();
        System.out.println("Введите высоту цилиндра :");
        height=s.nextFloat();
        System.out.println("Объем цилиндра : "+barrelVolume(pi, maxR, height));
        System.out.println("Обьём полого цилиндра : "+emptyBarrelVolume(pi, maxR, minR, height));
        System.out.println("Площадь боковой поверхности  : "+barrelSideArea(pi, maxR, height));
        System.out.println();

        // Шар

        System.out.println("Введите радиус шара :");
        maxR=s.nextFloat();
        System.out.println("Обьём шара : "+ballVolume(pi, maxR));
        System.out.println("Площадь шара : "+ballArea(pi, maxR));
        System.out.println();

        // Параллелепипед

        float a, b, c;

        System.out.println("Введите первую сторону параллелепипеда:");
        a=s.nextFloat();
        System.out.println("Введите вторую сторону параллелепипеда :");
        b=s.nextFloat();
        System.out.println("Введите третью сторону параллелепипеда :");
        c=s.nextFloat();
        System.out.println("Объем параллелепипеда : "+parallelepipedVolume(a, b, c));
        System.out.println("Площадь параллелепипеда : "+parallelepipedArea(a, b, c));
        System.out.println();

        // тетраэдр

        System.out.println("Введите сторону тетраэдера :");
        a=s.nextFloat();
        System.out.println("Объем тетраэдера : "+tetrahedronVolume(a));
        System.out.println("Площадь тетраэдера : "+tetrahedronArea(a));

    }

    // методы(цилиндр)

    public static float barrelVolume(float pi, float radius, float height){
        return pi*radius*radius*height;
    }

    public static float emptyBarrelVolume(float pi, float maxR, float minR, float height){
        return pi*height*(maxR*maxR-minR*minR);
    }

    public static float barrelSideArea(float pi, float radius, float height){
        return 2*pi*radius*height;
    }

    //  методы(шар)

    public static float ballVolume(float pi, float radius){
        return 4*pi*radius*radius*radius/3;
    }

    public static float ballArea(float pi, float radius){
        return 4*pi*radius*radius;
    }

    //  методы(Параллелепипед)

    public static float parallelepipedVolume(float a, float b, float c){
        return a*b*c;
    }

    public static float parallelepipedArea(float a, float b, float c){
        return 2*(a*b+a*c+b*c);
    }

    // методы(Тетраэдр)
    public static double tetrahedronVolume(float a){
        return (Math.sqrt(2)/12)*a*a*a;
    }

    public static double tetrahedronArea(float a){
        return Math.sqrt(3)*a*a;
    }
}
