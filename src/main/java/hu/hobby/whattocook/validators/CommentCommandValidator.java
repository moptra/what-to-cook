package hu.hobby.whattocook.validators;

import hu.hobby.whattocook.dto.incoming.CommentCommand;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class CommentCommandValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return CommentCommand.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        CommentCommand commentCommand = (CommentCommand) target;
        //TODO
    }
}
