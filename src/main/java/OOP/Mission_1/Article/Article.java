package OOP.Mission_1.Article;
import java.text.*;
public class Article {
    public int id;
    public float price;

    public Article(){}

    public Article(int id){
        this.id = id;
    }

    public Article(int id, float price){
        this.id = id;
        this.price = price;
    }

    public Article(Article article){
        this.id = article.id;
        this.price = article.price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public String getPrice(){
        return (new DecimalFormat("#########.00")).format(this.price);
    }

    @Override
    public String toString(){
        return "id: " + this.id + "\nprice: " + this.getPrice() + "\n";
    }
}
