package OOP.Mission_1.Person;

import OOP.Service.Filter;
import OOP.Service.Rating;

import java.util.regex.Pattern;

public class Abiturient extends Person{

    public Rating rating ;
    public short sum;

    Abiturient(int id, String name, String middleName, String lastName,
               String address, int phoneNumber, Rating  marks){
        super(id, name, middleName, lastName, address, phoneNumber);
        this.rating  = marks;
    }

    Abiturient(int id, String name, String middleName, String lastName,
               String address, int phoneNumber){
        super(id, name, middleName, lastName, address, phoneNumber);
    }

    Abiturient(Person person){
        super(person);
    }

    public void setMarks(byte algebra, byte geometry, byte history,
                         byte geography, byte english){
        this.rating  = new Rating (algebra, geometry, history, geography, english);
        this.sum = marksSum(this);
    }

    public String getMarks(){
        return "algebra: " + this.rating.algebra + ", " +
                "geometry: " + this.rating.geometry + ", " +
                "history: " + this.rating.history + ", " +
                "geography: " + this.rating.geography + ", " +
                "english: " + this.rating.english;
    }

    @Override
    public String toString(){
        return "Abiturient: " + super.toString() +
                "rating: \n" + this.getMarks() + ".\n";
    }

    public void filterApply(Filter filter){
        switch (filter.mode){
            case 'f':
                if ((this.getMarks().contains("1")) || (this.getMarks().contains("2"))){
                    System.out.println(this.toString());
                }
                break;
            case 'b':
                if (this.sum > filter.sum){
                    System.out.println(this.toString());
                }
                break;
            case 'h':
                if (this.sum >= filter.passingSum / 2){
                    System.out.println(this.toString());
                }
                break;
        }
    }

    private static short marksSum(Abiturient abiturient){
        short sum = 0;
        Pattern pattern = Pattern.compile("\\D+");
        String [] marks = pattern.split(abiturient.getMarks());
        for (int i = 1; i < marks.length; i++){
            sum += Short.valueOf(marks[i]);
        }
        return sum;

}
}
