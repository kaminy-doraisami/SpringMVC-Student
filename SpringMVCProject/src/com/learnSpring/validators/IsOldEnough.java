package com.learnSpring.validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * @author kaminy.doraisami This interface is a constraint interface to validate age
 *
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = StudentAgeValidator.class)
@Documented
public @interface IsOldEnough {
	
	String message() default "Student must be atleast 17 years old as of April 01, 2015";
	
	Class<?>[] groups() default{};
	
	Class<? extends Payload>[] payload() default {};
	

}
