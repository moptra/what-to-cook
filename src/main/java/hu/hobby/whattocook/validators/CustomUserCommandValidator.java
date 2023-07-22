package hu.hobby.whattocook.validators;


import hu.hobby.whattocook.dto.incoming.CustomUserCommand;
import hu.hobby.whattocook.dto.incoming.RecipeCommand;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class CustomUserCommandValidator implements Validator{

    @Override
    public boolean supports(Class<?> clazz) {
        return RecipeCommand.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        CustomUserCommand customUserCommand = (CustomUserCommand) target;

        //TODO

    }


}
