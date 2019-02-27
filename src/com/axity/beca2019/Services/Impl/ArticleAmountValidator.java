package com.axity.beca2019.Services.Impl;

import com.axity.beca2019.Model.Purchase;
import com.axity.beca2019.Services.Validator;

public class ArticleAmountValidator extends Validator {

    private static final Integer MAX_ARTICLES=5;

    @Override
    public Boolean validate(Purchase purchase) {

        if (purchase.getShoppingList().size()>MAX_ARTICLES){
            System.out.println("Lo lamento! no puedes comprar más de 5 artículos a la vez");
            return false;
        }

        return validateNext(purchase);
    }
}
