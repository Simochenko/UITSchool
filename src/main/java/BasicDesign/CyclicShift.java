package BasicDesign;

import java.util.Scanner;

public class CyclicShift {
    public static void main(String[] args) {

        int n, m, i, j;
        Scanner s = new Scanner(System.in);

        System.out.println("Введите количество столбцов массива :");
        m = s.nextInt();
        System.out.println("Введите количество строк массива :");
        n = s.nextInt();

        int[][] array = new int[n][m];

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }

        outArray(array);
        cyclicShift(array);
    }

    public static void outArray(int[][] mas) {
        int i, j;

        System.out.println("Массив :");
        for (i = 0; i < mas.length; i++) {
            for (j = 0; j < mas[0].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void cyclicShift(int[][] mas) {
        int i, j, shift, numSt, mem;
        String dirShift, routeShift, repeat = "yes";
        Scanner s = new Scanner(System.in);


        while (repeat.equals("yes")) {
            repeat = "";
            System.out.println();
            System.out.println("Горизонтальный/вертикальный сдвиг? (hor/ver) :");
            dirShift = s.nextLine();
            System.out.println("Направление сдвига (вперед/назад)? (=>/<=) :");
            routeShift = s.nextLine();
            System.out.println("Строка/столбец сдвига :");
            numSt = s.nextInt();
            System.out.println("На сколько элементов ствинуть :");
            shift = s.nextInt();

            for (j = 1; j <= shift; j++) {
                switch (dirShift) {
                    case "ver":
                        if (routeShift.equals("=>")) {
                            mem = mas[mas.length - 1][numSt];
                            for (i = mas.length - 1; i > 0; i--) {
                                mas[i][numSt] = mas[i - 1][numSt];
                            }
                            mas[0][numSt] = mem;
                        } else {
                            mem = mas[0][numSt];
                            for (i = 1; i < mas.length; i++) {
                                mas[i - 1][numSt] = mas[i][numSt];
                            }
                            mas[mas.length - 1][numSt] = mem;
                        }
                        break;
                    case "hor":
                        if (routeShift.equals("=>")) {
                            mem = mas[numSt][mas[numSt].length - 1];
                            for (i = mas[numSt].length - 1; i > 0; i--) {
                                mas[numSt][i] = mas[numSt][i - 1];
                            }
                            mas[numSt][0] = mem;
                        } else {
                            mem = mas[numSt][0];
                            for (i = 1; i < mas[numSt].length; i++) {
                                mas[numSt][i - 1] = mas[numSt][i];
                            }
                            mas[numSt][mas[numSt].length - 1] = mem;
                        }
                }
            }

            outArray(mas);

        }
    }
}
