package construnct;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import annocation.StringVd;
import stringutils.StringUtil;

public class StringConstraintValidator implements ConstraintValidator<StringVd, String>{

	private boolean nullable;
	
	private int minLength;
	
	private int maxLength;
	
	private Pattern regexp;
	
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		if (!nullable && StringUtil.isBlank(value)) {
			return false;
		}
		
		if (maxLength < value.length() || value.length() < minLength){
			return false;
		}
		
		return regexp.matcher(value).matches();
		
	}

	public void initialize(StringVd constraintAnnotation) {
		nullable = constraintAnnotation.nullable();
		minLength = constraintAnnotation.minLength();
		maxLength = constraintAnnotation.maxLength();
		regexp = Pattern.compile(constraintAnnotation.regexp());
	}

	
}
