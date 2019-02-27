package com.axity.beca2019.Services.Impl;

import com.axity.beca2019.Model.Purchase;
import com.axity.beca2019.Services.Validator;

public class UserNationalityValidator extends Validator {
    private static final String ALLOWED_NATIONALITY = "Mexicano";
    private static final String MESSAGE = "Las compras solo se realizan por mexicanos alv we.";

    @Override
    public Boolean validate(Purchase purchase) {
        if (!purchase.getUser().getNationality().equals(ALLOWED_NATIONALITY)){
            System.out.println(MESSAGE);
            return false;
        }

        return validateNext(purchase);
    }
}
