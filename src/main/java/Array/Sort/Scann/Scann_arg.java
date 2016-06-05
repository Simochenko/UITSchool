package Array.Sort.Scann;

import java.util.Scanner;


public class Scann_arg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа через пробел, а в конце строки укажиите s:");
        int avg = 0;
        int counter = 0;
        while(sc.hasNextInt()){
            avg+=sc.nextInt();
            counter++;
        }
        System.out.println("введено чисел - "+ counter);
        System.out.println("среднее арифметическое - "+avg);
    }
}
