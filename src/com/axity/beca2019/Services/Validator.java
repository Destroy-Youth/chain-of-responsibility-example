package com.axity.beca2019.Services;

import com.axity.beca2019.Model.Purchase;

public abstract class Validator implements IValidation {

    IValidation next;

    Validator linkWith(Validator next){
        this.next=next;
        return next;
    }
}
