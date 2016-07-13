package BasicDesign;

import java.util.Scanner;

public class MultiDimArray {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n, m, i, j;

        System.out.println("Введите количество столбцов  :");
        m = s.nextInt();
        System.out.println("Введите количество строк  :");
        n = s.nextInt();

        int[][] multiDimArray = new int[n][m];

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                multiDimArray[i][j] = (int) (Math.random() * 100);
            }
        }

        straightArr(multiDimArray);
        System.out.println();
        reverseArr(multiDimArray);
        System.out.println();
        evenElem(multiDimArray);
        System.out.println();
        notEvenElem(multiDimArray);
        System.out.println();
        sumMultiple7(multiDimArray);
        System.out.println();
        multiplication3(multiDimArray);

    }

    public static void straightArr(int[][] arr) {
        int i, j;
        System.out.println("Прямой вывод: ");
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void reverseArr(int[][] arr) {
        int i, j;
        System.out.println("Обратный вывод: ");
        for (i = arr.length - 1; i >= 0; i--) {
            for (j = arr[0].length - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void evenElem(int[][] arr) {
        int i, j;
        System.out.println("Четные элементы в четных строках :");
        for (i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println("строка "+i);
                for (j = 0; j < arr[0].length; j++) {
                    if (arr[i][j] % 2 == 0) {
                        System.out.print(arr[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void notEvenElem(int[][] arr) {
        int i, j;
        System.out.println("Нечетные элементы в нечетных столбцах :");
        for (j = 0; j < arr[0].length; j++) {
            if (j % 2 != 0) {
                System.out.println("столбец "+j);
                for (i = 0; i < arr.length; i++) {
                    if (arr[i][j] % 2 != 0) {
                        System.out.print(arr[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void sumMultiple7(int[][] arr) {
        int i, j, sum = 0;
        for (i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (j = 0; j < arr[0].length; j++) {
                    if (arr[i][j] % 7 == 0) {
                        sum += arr[i][j];
                    }
                }
            }
        }
        System.out.println("Сумма элементов, кратных 7, в четных строках : " + sum);
    }

    public static void multiplication3(int[][] arr) {
        int i, j, product = 1;
        for (i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                for (j = 0; j < arr[0].length; j++) {
                    if (arr[i][j] % 3 == 0 && arr[i][j] != 0) {
                        product *= arr[i][j];
                    }
                }
            }
        }
        System.out.println("Произведение элементов, кратных 3, в нечетных строках : " + product);
    }

}