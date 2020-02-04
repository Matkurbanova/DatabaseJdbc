package kg.database.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public class Book {
    @Id
    @GeneratedValue

    private int id;
    private String title;
    private Date publish_date;
    private String quantity;
    public Book() {
    }

    public Book( String title, Date publish_date, String quantity) {
        this.title = title;
        this.publish_date = publish_date;
        this.quantity = quantity;

    }
    public Book(int id,String title, Date publish_date, String quantity) {
        this.id=id;
        this.title = title;
        this.publish_date = publish_date;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(Date publish_date) {
        this.publish_date = publish_date;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publish_date=" + publish_date +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
