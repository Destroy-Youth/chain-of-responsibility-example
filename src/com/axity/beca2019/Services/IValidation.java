package com.axity.beca2019.Services;

import com.axity.beca2019.Model.Purchase;

public interface IValidation {
    Boolean validate(Purchase purchase);
    Boolean validateNext(Purchase purchase);
}
