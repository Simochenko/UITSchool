package BasicDesign;


public class SwitchRandom {

    public static void main(String[] args) {

        int number;
        String textNumber = "", memory;
        char replac = ' ';

        number = (int) (Math.random() * 99);
        memory = "" + number;
        if (memory.length() > 1 && memory.charAt(0) == '1') {
            switch (memory.charAt(1)) {
                case '0':
                    textNumber += "десять";
                    break;
                case '1':
                    textNumber += "одиннадцать";
                    break;
                case '2':
                    textNumber += "двенадцать";
                    break;
                case '3':
                    textNumber += "тринадцать";
                    break;
                case '4':
                    textNumber += "четырнадцать";
                    break;
                case '5':
                    textNumber += "пятнадцать";
                    break;
                case '6':
                    textNumber += "шестнадцать";
                    break;
                case '7':
                    textNumber += "семнадцать";
                    break;
                case '8':
                    textNumber += "восемнадцать";
                    break;
                case '9':
                    textNumber += "девятнадцать";
                    break;
            }
        } else {
            if (memory.length() > 1) {
                switch (memory.charAt(0)) {
                    case '2':
                        textNumber += "двадцать ";
                        replac = memory.charAt(1);
                        break;
                    case '3':
                        textNumber += "тридцать ";
                        replac = memory.charAt(1);
                        break;
                    case '4':
                        textNumber += "сорок ";
                        replac = memory.charAt(1);
                        break;
                    case '5':
                        textNumber += "пятьдесят ";
                        replac = memory.charAt(1);
                        break;
                    case '6':
                        textNumber += "шестьдесят ";
                        replac = memory.charAt(1);
                        break;
                    case '7':
                        textNumber += "семьдесят ";
                        replac = memory.charAt(1);
                        break;
                    case '8':
                        textNumber += "восемьдесят ";
                        replac = memory.charAt(1);
                        break;
                    case '9':
                        textNumber += "девяносто ";
                        replac = memory.charAt(1);
                        break;
                }
            } else {
                replac = memory.charAt(0);
            }
            switch (replac) {
                case '0':
                    if (memory.length() == 1) {
                        textNumber = "ноль";
                    }
                    break;
                case '1':
                    textNumber += "один";
                    break;
                case '2':
                    textNumber += "два";
                    break;
                case '3':
                    textNumber += "три";
                    break;
                case '4':
                    textNumber += "четыре";
                    break;
                case '5':
                    textNumber += "пять";
                    break;
                case '6':
                    textNumber += "шесть";
                    break;
                case '7':
                    textNumber += "семь";
                    break;
                case '8':
                    textNumber += "восемь";
                    break;
                case '9':
                    textNumber += "девять";
                    break;
            }
        }

        System.out.println("Число : " + number + ". Число в виде  текста : " + textNumber);

    }


}



