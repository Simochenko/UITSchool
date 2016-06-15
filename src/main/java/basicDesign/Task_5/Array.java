package basicDesign.Task_5;


import java.util.Random;

public class Array {
    public static void main(String[] args) {

        System.out.println("прямой порядок");
        int[][] array_2d = new int[5][5];
        Random rand = new Random();
        for (int i = 0; i < array_2d.length; i++) {
            for (int j = 0; j < array_2d.length; j++) {

                array_2d[i][j] = rand.nextInt(10);
                System.out.print(array_2d[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("обратный порядок");

        for (int i = array_2d.length - 1; i >= 0; i--) {
            for (int j = array_2d.length - 1; j >= 0; j--) {

                System.out.print(array_2d[i][j] + " ");

            }
            System.out.println();

        }
        for (int i = 1; i < 5; i += 2) {
            for (int j = 0; j < 5; j++) {

                if (array_2d[i][j] % 2 == 0) {
                    System.out.println(array_2d[i][j] + "- четные");

                }


            }

        }

                for (int i = 0; i < 5; i += 2) {
                    for (int j = 0; j < 5; j++) {

                        if (array_2d[i][j] % 2 != 0) {
                            System.out.println(array_2d[i][j] + " - нечетные ");
                        }
                    }
                }

    }
}
