package OOP.Mission_1.Article;

public class House extends Article {
    public short apartmentNumber;
    public float apartmentSquare;
    public byte floor;
    public byte roomsNumber;
    public String street;
    public String buildingType;
    public short exploitationTerm;

    public House(Article article){
        super(article);
    }

    public House(Article article, short apartmentNumber, float apartmentSquare,
                 byte floor, byte roomsNumber, String street, String buildingType,
                 short exploitationTerm){
        super(article);
        this.apartmentNumber = apartmentNumber;
        this.apartmentSquare = apartmentSquare;
        this.floor = floor;
        this.roomsNumber = roomsNumber;
        this.street = street;
        this.buildingType = buildingType;
        this.exploitationTerm = exploitationTerm;
    }

    public House(int id, short apartmentNumber, float apartmentSquare,
                 byte floor, byte roomsNumber, String street, String buildingType,
                 short exploitationTerm){
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.apartmentSquare = apartmentSquare;
        this.floor = floor;
        this.roomsNumber = roomsNumber;
        this.street = street;
        this.buildingType = buildingType;
        this.exploitationTerm = exploitationTerm;
    }

    public void setHouseSettings(short apartmentNumber, float apartmentSquare, byte floor,
                                 byte roomsNumber, String street, String buildingType,
                                 short exploitationTerm){
        this.apartmentNumber = apartmentNumber;
        this.apartmentSquare = apartmentSquare;
        this.floor = floor;
        this.roomsNumber = roomsNumber;
        this.street = street;
        this.buildingType = buildingType;
        this.exploitationTerm = exploitationTerm;
    }

    @Override
    public String toString(){
        return "House : \n id : " + this.id + "\napartment number : " + this.apartmentNumber +
                "\napartment square : " + this.apartmentSquare + "\nfloor : " + this.floor +
                "\nrooms number : " + this.roomsNumber + "\nstreet : " + this.street +
                "\nbuilding type : " + this.buildingType + "\nexploitation term : " +
                this.exploitationTerm + "\n";
    }
}
