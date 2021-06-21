package web.controller;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    public User() {}

    public User(String name, String lastname, int age) {
        this.age = age;
        this.name = name;
        this.lasrname = lastname;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int age;
    private String name;
    private String lasrname;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasrname() {
        return lasrname;
    }

    public void setLasrname(String lasrname) {
        this.lasrname = lasrname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
