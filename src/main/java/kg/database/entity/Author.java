package kg.database.entity;

import java.util.Date;

public class Author {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String password;
    public Author() {
    }

    public Author( String name,String surname, String email,String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password=password;

    }
    public Author(int id,String name,String surname, String email,String password) {
        this.id=id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password=password;
    }

}
