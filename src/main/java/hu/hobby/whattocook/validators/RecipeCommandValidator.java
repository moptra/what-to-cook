package hu.hobby.whattocook.validators;


import hu.hobby.whattocook.dto.incoming.RecipeCommand;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class RecipeCommandValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return RecipeCommand.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        RecipeCommand recipeCommand = (RecipeCommand) target;

        //TODO

    }

}
