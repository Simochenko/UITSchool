package OOP.Mission_1.Person;

import OOP.Service.Connection;
import OOP.Service.MainService;
import OOP.Service.SimpleDate;
import OOP.Service.SimpleTime;

public class PersonMain {
    public static void main(String[] args) {

        byte i;
        Short personsNumber = MainService.arrayLength();
        if (personsNumber < 1){
            System.exit(0);
        }
        String[] names = {"Igor", "Vasiliy", "Dima", "Andrey", "Egor"};
        String[] middleNames = {"Andreevich", "Igorevich","Ivanovich",
                "Petrovich", "Vasilyevich",};
        String[] lastNames = {"Stepanenko", "Kosyak", "Skvorcov", "Ogyrcov",
                "Vasilenko"};
        String[] streets = {"Nayki", "Proletarskaya", "Ordgo", "Kievskaya",
                "Vaskina", "Vostochnaya", "Esenina"};
        byte courses = 5, groups = 3, markMax = 5;
        int phoneCredit = 1000;
        long cardNumbers = 9999999999999999l, accountNumbers = 999999999999l;
        String[] faculty = {"robotu", "mathimatiks", "radio", "programming",
                "languages"};
        int medicalCards = 999999;
        String[] diagnoses = {"prostuda", "skleroz", "ushib", "absence",
                "tooth abscess", "byssinosis"};
        Student[] students = new Student [personsNumber];
        Customer[] customers = new Customer [personsNumber];
        Patient[] patients = new Patient [personsNumber];
        Abiturient[] abiturients = new Abiturient[personsNumber];
        Phone[] phones = new Phone[personsNumber];

        for (i = 0; i < personsNumber; i++){
            students[i] = new Student(newPersonInit(i + 1, names, middleNames,
                    lastNames, streets));
            students[i].setBirthday(randomDate());
            students[i].setEducationSettings(faculty[(byte)(Math.random() * (faculty.length - 1))],
                    (byte)(Math.random() * (courses - 1) + 1),
                    (byte)(Math.random() * (groups - 1) + 1));
            customers[i] = new Customer(newPersonInit(i + 1, names, middleNames,
                    lastNames, streets));
            customers[i].setCustomerSettings((long)(Math.random() * (cardNumbers - 1) + 1),
                    (long)(Math.random() * (accountNumbers - 1) + 1));
            patients[i] = new Patient(newPersonInit(i + 1, names, middleNames,
                    lastNames, streets));
            patients[i].setDiagnosis(diagnoses[(byte)(Math.random() * (diagnoses.length - 1))]);
            patients[i].setMedicalCardNumber((int)(Math.random() * (medicalCards - 1) + 1));
            abiturients[i] = new Abiturient(newPersonInit(i + 1, names, middleNames,
                    lastNames, streets));
            abiturients[i].setMarks((byte)(Math.random() * (markMax - 1) + 1),
                    (byte)(Math.random() * (markMax - 1) + 1),
                    (byte)(Math.random() * (markMax - 1) + 1),
                    (byte)(Math.random() * (markMax - 1) + 1),
                    (byte)(Math.random() * (markMax - 1) + 1));
            phones[i] = new Phone(newPersonInit(i + 1, names, middleNames, lastNames,
                    streets));
            phones[i].setPhoneSettings((long)(Math.random() * (cardNumbers - 1) + 1),
                    (int)(Math.random() * (phoneCredit - 1) + 1),
                    (int)(Math.random() * (phoneCredit - 1) + 1),
                    new SimpleTime((int)(Math.random() * 24),
                            (int)(Math.random() * 60),
                            (int)(Math.random() * 60)),
                    new SimpleTime((int)(Math.random() * 24),
                            (int)(Math.random() * 60),
                            (int)(Math.random() * 60)));
        }

        appExecute(students, customers, patients, abiturients, phones);
    }

    // realization

    public static Person newPersonInit(int id, String[] names, String[] middleNames,
                                       String[] lastNames, String[] streets){

        int buildings = 100, apartments = 100;

        String address = streets[(byte)(Math.random() * (streets.length - 1))] +
                " str, " + (byte)(Math.random() * (buildings - 1) + 1)+
                ", " + (byte)(Math.random() * (apartments - 1) + 1) + " apt.";
        return new Person(id, names[(byte)(Math.random() * (names.length - 1))],
                middleNames[(byte)(Math.random() * (middleNames.length - 1))],
                lastNames[(byte)(Math.random() * (lastNames.length - 1))],
                address,(int)(Math.random() * 9999998 + 1));
    }

    public static void appExecute (Student[] students, Customer[] customers,
                                   Patient[] patients, Abiturient[] abiturients, Phone[] phones){
        boolean repeat = true;
        char classList;

        while(repeat){
            classList = Connection.getFirstChar("Enter type of array for work : (s)tudent, " +
                    "(c)ustomer, (p)atient, (a)biturient), p(h)one : ");
            switch (classList){
                case 's':
                    MainService.showAllItems(students);
                    MainService.studentLists(students);
                    break;
                case 'c':
                    MainService.showAllItems(customers);
                    MainService.customerLists(customers);
                    break;
                case 'p':
                    MainService.showAllItems(patients);
                    MainService.patientLists(patients);
                    break;
                case 'a':
                    MainService.showAllItems(abiturients);
                    MainService.abiturientLists(abiturients);
                    break;
                case 'h':
                    MainService.showAllItems(phones);
                    MainService.phoneLists(phones);
                    break;
                default:
                    System.out.println("Incorrect type!");
            }
            repeat = (Connection.getFirstChar("One list more? (y/n) : ") != 'n');
        }

    }

    public static SimpleDate randomDate(){
        return new SimpleDate((byte)(Math.random() * 30 + 1),
                (byte)(Math.random() * 11 + 1),
                (short)(Math.random() * 10 + 1986));
    }
}
