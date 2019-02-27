package com.axity.beca2019.Model;

import com.axity.beca2019.Services.Validator;

import java.util.ArrayList;

public class Purchase {
    private User user;
    private ArrayList<Article> shoppingList;
    private Validator validator;

    public boolean pay(){
        if(validator.validate(this)){
            System.out.println("Compra realizada con éxito");
            return true;
        }
        return false;
    }


    public Purchase(User user, ArrayList<Article> shoppingList) {
        this.user = user;
        this.shoppingList = shoppingList;
    }


    public void setValidator(Validator validator) {
        this.validator = validator;
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Article> getShoppingList() {
        return shoppingList;
    }

    public Validator getValidator() {
        return validator;
    }
}
