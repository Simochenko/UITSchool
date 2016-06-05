package basictypes;

import java.text.DecimalFormat;

public class Schedule {

    public static void main(String[] args) {

        String fio = "Simochenko Sergey Vladimirovich";
        double number_group = 16.05;
        String pattern = "##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String time = decimalFormat.format(19.00);
        time = time.replace(",", ":");

        System.out.println("ФИО: " + fio);
        System.out.println("Номер группы: JAVA " + number_group);
        System.out.println("Время занятий: " + time);

    }
}
