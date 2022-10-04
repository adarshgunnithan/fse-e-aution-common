package com.cts.eaution.vo.validator;

import javax.validation.Payload;

public @interface  ValidateString {
	String[] acceptedValues();

    String message() default "{validation.generic.enum}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { }; 
}
