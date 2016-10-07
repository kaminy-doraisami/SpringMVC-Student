package com.learnSpring.validators;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author kaminy.doraisami This class is a constraint validator class to validate age
 *
 */
public class StudentAgeValidator implements ConstraintValidator<IsOldEnough, Date> {

	DateFormat dateFormat = new SimpleDateFormat("d-MM-yyyy");
	private double startDate, endDate;
	private double studentAge;

	@Override
	public void initialize(IsOldEnough annotationValue) {

	}

	@Override
	public boolean isValid(Date studentDOB, ConstraintValidatorContext ctx) {

		if (studentDOB == null) {
			return false;
		}
		calculateAge(studentDOB);

		if (studentAge < 17.00) {
			return false;
		} else
			return true;

	}

	public void calculateAge(Date studentDOB) {
		try {
			endDate = dateFormat.parse("01-04-2016").getTime();
			startDate = studentDOB.getTime();
			studentAge =  (double)Math.abs(((endDate - startDate) / (1000 * 60 * 60 * 24 ))/365.00);
		} catch (ParseException pe) {
			System.out.println("Parse Exception");
		}
	}
}
