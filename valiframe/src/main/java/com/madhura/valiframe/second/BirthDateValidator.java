package com.madhura.valiframe.second;

import java.util.Calendar;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BirthDateValidator implements ConstraintValidator<BirthDate, Date> {

	@Override
	public boolean isValid(final Date valueToValidate, ConstraintValidatorContext context) {
		Calendar dateInCalender=Calendar.getInstance();
		dateInCalender.setTime(valueToValidate);
		return Calendar.getInstance().get(Calendar.YEAR)-dateInCalender.get(Calendar.YEAR)>=18;
	}

}
