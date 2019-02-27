package com.axity.beca2019.Model;

public class User {
    private String name;
    private String creditCard;
    private String nationality;

    public User(String name, String creditCard, String nationality) {
        this.name = name;
        this.creditCard = creditCard;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public String getNationality() {
        return nationality;
    }
}
