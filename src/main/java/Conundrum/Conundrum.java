package Conundrum;

import java.util.Scanner;

public class Conundrum {
    public static void main(String[] args) {

        int dateCode;
        byte day, month;
        short year;

        Scanner s = new Scanner(System.in);

        System.out.println("День :");
        day = s.nextByte();
        System.out.println("Месяц :");
        month = s.nextByte();
        System.out.println("Год :");
        year = s.nextShort();
        System.out.println();

        code(day, month, year);

        System.out.println("Введите получиное число :");
        dateCode = s.nextInt();

        decode(dateCode);

    }

    public static void code(byte day, byte month, short year) {

        int date = 0;

        date += day;
        date = date << 8;
        date += month;
        date = date << 16;
        date += year;

        System.out.println("Результат шифрования полученной даты : " + date);
        System.out.println();

    }

    public static void decode(int date) {

        byte day, month;
        short year;
        boolean val = false;

        year = (short) date;
        date = date >> 16;
        month = (byte) date;
        date = date >> 8;
        day = (byte) date;

        if ((day >= 1 && day <= 31) && (month >= 1 && month <= 12) && year > 0) {
            switch (month) {
                case 1:
                    boolean leapYear = false;
                    if (year % 4 == 0) {
                        leapYear = true;
                    }
                    if (year % 100 == 0 && year % 400 != 0) {
                        leapYear = false;
                    }
                    if (day <= 28 || (day == 29 && leapYear)) {
                        val = true;
                    }
                    break;
                case 2:
                    if (day <= 30) {
                        val = true;
                    }
                    break;
                default:
                    val = true;
            }
        }

        if (val) {
            System.out.println("Введённая дата : " + day + "." + month + "." + year);
        } else {
            System.out.println("Не является зашифрованной датой!");
        }

    }

}

