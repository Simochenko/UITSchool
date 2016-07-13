package OOP.Mission_1.Person;


public class Person {
    public int id;
    public int phoneNumber;
    public String name;
    public String middleName;
    public String lastName;
    public String address;

    public Person(){}

    public Person(int id, String name, String middleName, String lastName,
                  String address, int phoneNumber){
        this.id = id;
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Person(Person person){
        this.id = person.id;
        this.name = person.name;
        this.middleName = person.middleName;
        this.lastName = person.lastName;
        this.address = person.address;
        this.phoneNumber = person.phoneNumber;
    }

    public void setPerson(int id, String name, String middleName, String lastName,
                          String address, int phoneNumber){
        this.id = id;
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return " id:" + this.id + ". " + this.lastName + " " + this.name + " " +
                this.middleName+", \n" + "address: " + this.address + ", \n" +
                "phone number: " + this.phoneNumber + "\n";
    }
}
