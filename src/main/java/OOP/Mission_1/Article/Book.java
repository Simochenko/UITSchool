package OOP.Mission_1.Article;

import OOP.Mission_1.Serv.Filter;

public class Book extends Article {
    public String name;
    public String authors;
    public String publishing;
    public short publishingYear;
    public short pages;
    public String cover;

    public Book(Article article){
        super(article);
    }

    public Book(Article article, String name, String authors, String publishing,
                short publishingYear, short pages, String cover){
        super(article);
        this.name = name;
        this.authors = authors;
        this.publishing = publishing;
        this.publishingYear = publishingYear;
        this.pages = pages;
        this.cover = cover;
    }

    public Book(int id, float price, String name, String authors, String publishing,
                short publishingYear, short pages, String cover){
        this.id = id;
        this.price = price;
        this.name = name;
        this.authors = authors;
        this.publishing = publishing;
        this.publishingYear = publishingYear;
        this.pages = pages;
        this.cover = cover;
    }

    public void setBookSettings(String name, String authors, String publishing,
                                short publishingYear, short pages, String cover){
        this.name = name;
        this.authors = authors;
        this.publishing = publishing;
        this.publishingYear = publishingYear;
        this.pages = pages;
        this.cover = cover;
    }

    @Override
    public String toString(){
        return "Book : \nname : " +this.name + "\nauthor(s) : " + this.authors + "\n" +
                super.toString() + "publishing : " + this.publishing + ", publishing year : " +
                this.publishingYear + "\npages : " + this.pages + "\ncover type : " +
                this.cover + "\n";
    }

    public void filterApply(Filter filter){
        switch (filter.mode){
            case 'a':
                if (this.authors.equals(filter.authors)){
                    System.out.println(this.toString());
                }
                break;
            case 'p':
                if (this.publishing.equals(filter.publishing)){
                    System.out.println(this.toString());
                }
                break;
            case 'y':
                if (this.publishingYear > filter.publishingYear){
                    System.out.println(this.toString());
                }
                break;
        }
    }

}
