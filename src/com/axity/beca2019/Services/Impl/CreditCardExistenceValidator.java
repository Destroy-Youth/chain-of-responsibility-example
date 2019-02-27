package com.axity.beca2019.Services.Impl;

import com.axity.beca2019.Model.Purchase;
import com.axity.beca2019.Services.Validator;

public class CreditCardExistenceValidator extends Validator {

    static final String MESSAGE="No puedes realizar la compra sin tener una tarjeta de crédito registrada!";

    @Override
    public Boolean validate(Purchase purchase) {
        if (purchase.getUser().getCreditCard() == null){
            System.out.println(MESSAGE);
            return false;
        }

        return validateNext(purchase);
    }
}
