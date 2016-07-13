package BasicTypes;

public class HelloWorld {

    public static void main(String[] args) {
        // задание 1 Здравствуй мир
        System.out.println("Здравствуй мир!!!");

        // задание 2  Текст  размещенный на нескольких строках
        String a;
        a = "\nПример\n  строки\n    с текстом  размещенным на нескольких строках";
        System.out.println(a);

        // задание 3 Schedule

        String firstName="Simochenko", lastName="Sergey", fatherName="Vladimirovich",
                fullName, language="java", groupNumber, firstDay="Понедельник", secondDay="Пятница";
        int groupYear=16, groupMonth=5;
        float beginTime=19.00f, endTime=21.30f;

        fullName=firstName+" "+lastName+" "+fatherName;
        groupNumber=language+" "+groupYear+"-0"+groupMonth;

        System.out.println("\nСтудент : "+fullName);
        System.out.println("Группа : "+groupNumber);
        System.out.println("Время занятия : "+firstDay+", "+secondDay+" с "
                +String.format("%.2f", beginTime).replace(',', '.')+
                " до "+String.format("%.2f", endTime).replace(',', '.'));

    }

}
