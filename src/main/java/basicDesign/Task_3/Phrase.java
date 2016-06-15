package basicDesign.Task_3;

/**
 * Created by Admin on 09.06.2016.
 */
public class Phrase {
    public static void main (String[] args) {

        String[] wordListOne = {"Дорогие друзья! ","с другой стороны  ","равным образом ","Не следует, однако, забывать о том, что"};
        String[] wordListTwo = {"реализация намеченных плановых заданий","рамки и место обучения кадров ","постоянный количественный рост и сфера нашей активности ","сложившаяся структура организации"};
        String[] wordListThree = {"играет важную роль в формировании","требуют от нас анализа ","требуют определения и уточнения ","способствует подготовке и реализации"};
        String[] wordListFour = {"существующих финансовых и административных условий","дальнейших направлений развитая","системы массового участия","позиций, занимаемых участниками в отношении поставленных задач "};
//Вычисляем, сколько слов в каждом списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        int fourLength = wordListFour.length;
//Генерируемтри случайных числа
        int randl = (int) (Math.random() * oneLength) ;
        int rand2 = (int) (Math.random() * twoLength) ;
        int rand3 = (int) (Math.random() * threeLength);
        int rand4 = (int) (Math.random() * fourLength);

        String phrase = wordListOne[randl] + " " +wordListTwo[rand2] + " " + wordListThree[rand3]+ " " + wordListFour[rand4];

        System.out.println(phrase);
    }
}