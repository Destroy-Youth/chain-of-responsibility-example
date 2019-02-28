package com.axity.beca2019;

import com.axity.beca2019.Model.Article;
import com.axity.beca2019.Model.Purchase;
import com.axity.beca2019.Model.User;
import com.axity.beca2019.Services.Impl.ArticleAmountValidator;
import com.axity.beca2019.Services.Impl.CreditCardExistenceValidator;
import com.axity.beca2019.Services.Impl.TotalAmountValidator;
import com.axity.beca2019.Services.Impl.UserNationalityValidator;
import com.axity.beca2019.Services.Validator;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<Article> list = new ArrayList<>();
        list.add(new Article("Pan", 59.40f));
        list.add(new Article("Jabón", 55.40f));
        list.add(new Article("Awa", 103.90f));
        list.add(new Article("Awa", 103.90f));

        User user = new User("Ivan", "3423564758", "Canadiense");

        Purchase purchase = new Purchase(user, list);


        Validator validator = new ArticleAmountValidator();
        validator.linkWith(new CreditCardExistenceValidator())
                .linkWith(new TotalAmountValidator())
                .linkWith(new UserNationalityValidator());

        purchase.setValidator(validator);

        purchase.pay();

    }
}
