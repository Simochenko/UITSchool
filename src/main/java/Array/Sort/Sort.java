package Array.Sort;

/**
 * Created by Admin on 03.06.2016.
 */
public class Sort {
    public static void main(String[] args) {
       /* int a =3;
        int b =5;
        int tmp = a;
        a=b;
        b=tmp;
        System.out.println("a = "+a);
        System.out.println("b = "+b);*/
        int a = 3;
        int b = 5;
        a = a + b;
        b = a-b;
        a=a-b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
