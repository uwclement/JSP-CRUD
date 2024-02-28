package com.javatpoint.bean;

import jakarta.persistence.*;

@Entity
@Table(name = "register")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "register_SEQ")
    @SequenceGenerator(name = "register_SEQ", sequenceName = "register_SEQ", allocationSize = 1)
    private int Id;
    private String name;
    private String password;
    private String email ;
    private String sex;
    private String country;

    public User(int id, String name, String password, String email, String sex, String country) {
        Id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.sex = sex;
        this.country = country;
    }

    public User() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
