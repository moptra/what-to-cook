package hu.hobby.whattocook.contorller;


import hu.hobby.whattocook.service.CustomUserService;
import hu.hobby.whattocook.validators.CustomUserCommandValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class CustomUserController {
    private CustomUserService customUserService;
    private CustomUserCommandValidator customUserCommandValidator;

    @Autowired
    public CustomUserController(CustomUserService customUserService, CustomUserCommandValidator customUserCommandValidator) {
        this.customUserService = customUserService;
        this.customUserCommandValidator = customUserCommandValidator;
    }

    @InitBinder("articleUpdateCommand")
    public void initArticleUpdateCommandBinder(WebDataBinder binder) {
        binder.addValidators(customUserCommandValidator);
    }
}
