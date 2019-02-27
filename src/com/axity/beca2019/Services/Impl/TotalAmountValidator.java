package com.axity.beca2019.Services.Impl;

import com.axity.beca2019.Model.Article;
import com.axity.beca2019.Model.Purchase;
import com.axity.beca2019.Services.Validator;

public class TotalAmountValidator extends Validator{
    private static final String MESSAGE = "El monto mínimo de compra es $150, no se puede realizar su transacción";

    @Override
    public Boolean validate(Purchase purchase) {
        Float totalAmount=0f;

        for (Article article : purchase.getShoppingList()) {
            totalAmount=totalAmount+article.getPrice();
        }

        if (totalAmount<150f){
            System.out.println(MESSAGE);
            return false;
        }

        return validateNext(purchase);
    }
}
