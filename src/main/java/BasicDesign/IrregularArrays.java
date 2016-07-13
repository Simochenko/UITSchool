package BasicDesign;


import java.util.Scanner;

public class IrregularArrays {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int z, i, j;

        System.out.println("Введите количество строк :");
        z = s.nextInt();
        System.out.println("Исходный массив");


        int[][] irregularArray = new int[z][];

        for (i = 0; i < z; i++) {
            irregularArray[i] = new int[i + 1];
            for (j = 0; j <= i; j++) {
                irregularArray[i][j] = (int) (Math.random() * 100);
            }
        }

        sourceArray(irregularArray);
        System.out.println();
        horizontalArray(irregularArray);
        System.out.println();
        verticalArray(irregularArray);
        System.out.println();
        horizontalVerticalArray(irregularArray);

    }

    public static void sourceArray(int[][] arr) {
        int i, j;

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void horizontalArray(int[][] arr) {
        int i, j;

        System.out.println("массив в горизонтальном виде");
        for (i = arr.length - 1; i >= 0; i--) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void techArray(int[][] arr, int i) {
        String tab = "";


        for (int l = 0; l < (arr.length - arr[i].length) * 3; l++) {
            tab += "";
        }
        System.out.print(tab);

        for (int j = arr[i].length - 1; j >= 0; j--) {
            System.out.print(arr[i][j] + " ");
        }

    }

    public static void verticalArray(int[][] arr) {
        System.out.println("Массив в вертикальном виде");
        for (int i = 0; i < arr.length; i++) {
            techArray(arr, i);
            System.out.println();
        }
    }


    public static void horizontalVerticalArray(int[][] arr) {
        System.out.println("Массива в горизонтальном и вертикальном  виде");
        for (int i = arr.length - 1; i >= 0; i--) {
            techArray(arr, i);
            System.out.println();
        }
    }
}