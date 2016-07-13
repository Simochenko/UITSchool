package BasicDesign;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Phrase {
    public static void main(String[] args) {/* throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество предложений");
        int count = Integer.parseInt(reader.readLine());
        for(int i = 0; i < count; i++)
        {
            System.out.println(stringA(getRandom()) + stringB(getRandom()) + stringC(getRandom()) + stringD(getRandom()));
        }
    }
    public static String stringA (int a)    {
        switch (a) {
            case 0: return "Товарищи!";
            case 1: return "С другой стороны";
            case 2: return "Равным образом";
            case 3: return "Не следует, однако, забывать, что";
            case 4: return "Таким образом";
            case 5: return "Повседневная практика показывает, что";
            default: return "ERROR";
        }
    }

    public static String stringB (int b)    {
        switch (b) {
            case 0: return " реализация намеченных плановых заданий ";
            case 1: return " рамки и место обучения кадров ";
            case 2: return " постоянный количественный рост и сфера нашей активности ";
            case 3: return " сложившаяся структура организации ";
            case 4: return " новая модель организационной активности ";
            case 5: return " дальнейшее развитие различных форм деятельности ";
            default: return "ERROR";
        }
    }

    public static String stringC (int c)    {
        switch (c) {
            case 0: return "играет важную роль в формировании ";
            case 1: return "требуют от нас анализа ";
            case 2: return "требуют определения и уточнения ";
            case 3: return "способствует подготовке и реализации ";
            case 4: return "обеспечивает широкому кругу специалистов участие в формировании ";
            case 5: return "позволяет выполнить важные задания по разработке ";
            default: return "ERROR";
        }
    }

    public static String stringD (int d)    {
        switch (d) {
            case 0: return "существенных финансовых и административных условий.";
            case 1: return "дальнейших направлений развития.";
            case 2: return "системы массового участия.";
            case 3: return "позиций, занимаемых участниками в отношении поставленных задач.";
            case 4: return "новых предложений.";
            case 5: return "направлений прогрессивного развития.";
            default: return "ERROR";
        }
    }

    public static int getRandom()
    {
        int a = (int)(Math.random()*100);
        return a / 17;*/

     /*  String[] wordListOne = {"Дорогие друзья! ", "с другой стороны  ", "равным образом ", "Не следует, однако, забывать о том, что"};
        String[] wordListTwo = {"реализация намеченных плановых заданий", "рамки и место обучения кадров ", "постоянный количественный рост и сфера нашей активности ", "сложившаяся структура организации"};
        String[] wordListThree = {"играет важную роль в формировании", "требуют от нас анализа ", "требуют определения и уточнения ", "способствует подготовке и реализации"};
        String[] wordListFour = {"существующих финансовых и административных условий", "дальнейших направлений развитая", "системы массового участия", "позиций, занимаемых участниками в отношении поставленных задач "};
//Вычисляем, сколько слов в каждом списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        int fourLength = wordListFour.length;
//Генерируемтри случайных числа
        int randl = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        int rand4 = (int) (Math.random() * fourLength);

        String phrase = wordListOne[randl] + " " + wordListTwo[rand2] + " " + wordListThree[rand3] + " " + wordListFour[rand4];

        System.out.println(phrase);*/

        String speech = "";

        String[][] template = new String[4][10];
        int numberOfStrings, i;
        Scanner con = new Scanner(System.in);

        template[0][0] = "Дорогие друзья! ";
        template[0][1] = "с другой стороны ";
        template[0][2] = "равным образом ";
        template[0][3] = "Не следует, однако, забывать о том, что ";
        template[0][4] = "Таким образом, ";
        template[0][5] = "Повседневная практика показывает, что ";
        template[0][6] = "Значимость этих проблем настолько очевидна, что ";
        template[0][7] = "Разнообразный и богатый опыт ";
        template[0][8] = "Задача организации, в особенности же ";
        template[0][9] = "Соображения высшего порядка, а также ";

        template[1][0] = "реализация намеченных плановых заданий ";
        template[1][1] = "рамки и место обучения кадров ";
        template[1][2] = "постоянный количественный рост и сфера нашей активности ";
        template[1][3] = "сложившаяся структура организации ";
        template[1][4] = "новая модель ";
        template[1][5] = "организационной деятельности ";
        template[1][6] = "дальнейшее развитие различных форм деятельности ";
        template[1][7] = "постоянное информационно-пропагандистское обеспечение нашей деятельности ";
        template[1][8] = "укрепления и развития структуры ";
        template[1][9] = "консультация с широким активом ";


        template[2][0] = "играет важную роль в формировании ";
        template[2][1] = "требуют от нас анализа ";
        template[2][2] = "требуют определения и уточнения ";
        template[2][3] = "способствует подготовке и реализации ";
        template[2][4] = "обеспечивает широкому кругу специалистов участие в формировании ";
        template[2][5] = "позволяет выполнить ";
        template[2][6] = "важнейшие задания по разработке ";
        template[2][7] = "в значительной степени обуславливает создание ";
        template[2][8] = "позволяет оценить значение ";
        template[2][9] = "представляет собой интересный эксперимент проверки ";


        template[3][0] = "существующих финансовых и административных условий";
        template[3][1] = "дальнейших направлений развитая";
        template[3][2] = "системы массового участия";
        template[3][3] = "позиций, занимаемых участниками в отношении поставленных задач";
        template[3][4] = "новых предложений";
        template[3][5] = "направлений прогрессивного развития";
        template[3][6] = "системы обучения кадров, соответствующей насущным потребностям";
        template[3][7] = "соответствующих условий активизации";
        template[3][8] = "модели развития";
        template[3][9] = "форм воздействия";

        System.out.println("Введите количество предложений :");
        numberOfStrings = con.nextInt();
        for (i = 0; i <= numberOfStrings - 1; i++) {
            for (int j = 0; j <= template.length - 1; j++) {

                speech += template[j][(int) (Math.random() * (template[j].length - 1))];

            }
            speech += ". \n";
        }
        System.out.println("Ваша речь :\n" + speech);

    }
}

