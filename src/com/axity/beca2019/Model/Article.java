package com.axity.beca2019.Model;

public class Article {
    private String name;
    private Float price;

    public Article(String name, Float price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }
}
