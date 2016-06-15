package basicDesign.Task_4;


/**
 * Created by Admin on 09.06.2016.
 */
public class Array_t4 {
    public static void main(String[] args) {
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30) - 15);
            System.out.print("\n"+array[i]+" - прямой ");

        }
        for (int i = array.length - 1; i >= 0; i--) {

            System.out.print("\n"+array[i]+" - обратный ");
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30) - 15);

            if(array[i]%2==0)
                System.out.print("\n"+array[i]+" - четные ");
         }
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30) - 15);

            if (array[i] % 7 == 0)
                System.out.print("\n"+ array[i] + " кратные 7");
        }

        int sum = 0;
        for (int anArray : array) {

            if (anArray % 7 == 0)

                sum += anArray;
        }
        System.out.println("\n" + "Сумма всех чисел последовательности кратных 7 равна " + sum);

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30) - 15);

            if (array[i] % 3 == 0)
                System.out.print("\n"+ array[i] + " кратные 3");
        }
        int mult = 1;
        for (int anArray : array) {

            if (anArray % 3 == 0)

                mult = mult * anArray;
        }
        System.out.println("\n"+"Сумма всех чисел последовательности кратных 3 равна " +mult);
    }

}

