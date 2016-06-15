package BasicDesign.Task_1;


public class Fold {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");


            }
        }
        int sum = 0;
        for (int j = 2; j < 100; j = j + 2) {

            sum = sum + j;
        }
        System.out.println("\n" + "Сумма всех чисел последовательности кратных 2 равна " + sum);

        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");


            }
        }
        int sum1 = 0;
        for (int j = 3; j < 100; j = j + 3) {

            sum1 = sum1 + j;
        }
        System.out.println("\n" + "Сумма всех чисел последовательности кратных 3 равна " + sum1);
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");


            }
        }
        int sum2 = 0;
        for (int j = 5; j < 100; j = j + 5) {

            sum2 = sum2 + j;
        }
        System.out.println("\n" + "Сумма всех чисел последовательности кратных 5 равна " + sum2);
        for (int i = 0; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");


            }
        }
        int sum3 = 0;
        for (int j = 7; j < 100; j = j + 7) {

            sum3 = sum3 + j;
        }
        System.out.println("\n" + "Сумма всех чисел последовательности кратных 7 равна " + sum3);

        int sum4;
        sum4 = sum - sum3;

        System.out.println("Разность сумм последовательностей, кратных 7 и 2 равна: " + sum4);
        double sum5;
        sum5 = sum2 / sum1;
        System.out.println("Отношение последовательности чисел, кратных 5 к последовательности чисел, кратных 3 ,равно: " + sum5);

    }
}
