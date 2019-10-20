package annocation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

import construnct.StringConstraintValidator;

@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = StringConstraintValidator.class)
public @interface StringVd {
	
	public boolean nullable() default false;
	
	public int minLength() default 0;
	
	public int maxLength() default Integer.MAX_VALUE;
	
	public String regexp() default "";
	
	public String message() default "paramparter valited error.";

}
