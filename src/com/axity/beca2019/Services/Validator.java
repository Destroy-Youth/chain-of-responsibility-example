package com.axity.beca2019.Services;

import com.axity.beca2019.Model.Purchase;

public abstract class Validator implements IValidation {

    IValidation next;

     public Validator linkWith(Validator next){
        this.next=next;
        return next;
    }

    @Override
    public Boolean validateNext(Purchase purchase) {
        if (next == null){
            return true;
        }

        return next.validate(purchase);
    }
}
