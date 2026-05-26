package kr.ac.kopo.psjjj._026example.domain;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class Personvalidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Person person = (Person) target;
        String name = person.getName();
        String age = person.getAge();
        String email = person.getEmail();
        if(name == null || name.trim().isEmpty())
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", null, "이름을 입력하세요");
        if(name == null || age.trim().isEmpty())
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", null, "나이을 입력하세요");
        if(name == null || email.trim().isEmpty())
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", null, "email을 입력하세요");
    }
}
