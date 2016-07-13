package BasicDesign;

public class Fold {
    public static void main(String[] args) {

        int i, aliquot2 = 0, aliquot7 = 0, difference;
        float attitude, aliquot3 = 0, aliquot5 = 0;

        for (i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " кратное 2");
                aliquot2 += i;
            }
            if (i % 3 == 0) {
                System.out.println(i + " кратное 3");
                aliquot3 += i;
            }
            if (i % 5 == 0) {
                System.out.println(i + " кратное 5");
                aliquot5 += i;
            }
            if (i % 7 == 0) {
                System.out.println(i + " кратное 7");
                aliquot7 += i;
            }
        }

        System.out.println();
        System.out.println("Сумма чисел, кратных 2 : " + aliquot2);
        System.out.println("Сумма чисел, кратных 3 : " + String.format("%.0f", aliquot3));
        System.out.println("Сумма чисел, кратных 5 : " + String.format("%.0f", aliquot5));
        System.out.println("Сумма чисел, кратных 7 : " + aliquot7);
        System.out.println();

        if (aliquot7 > aliquot2) {
            difference = aliquot7 - aliquot2;
        } else {
            difference = aliquot2 - aliquot7;
        }
        attitude = aliquot5 / aliquot3;
        System.out.println("Разность сумм  чисел, кратных 7 и чисел, кратных 2 : " +
                difference);
        System.out.println("Отношение суммы  чисел, кратных 5, к сумме" +
                " последовательности чисел, кратных 3 : " + attitude);

    }
}
