package hu.hobby.whattocook.contorller;


import hu.hobby.whattocook.dto.incoming.CustomUserCommand;
import hu.hobby.whattocook.service.CustomUserService;
import hu.hobby.whattocook.validators.CustomUserCommandValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

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

    @PostMapping("/register")
    public ResponseEntity<Void> registerUser(@RequestBody @Validated CustomUserCommand customUserCommand) {
        customUserService.registerUser(customUserCommand);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    //TODO login unsuccessful STATUS CODE 401

    @PostMapping("/login")
    public ResponseEntity<String> login(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            return new ResponseEntity<>("Login successful", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("You are already logged in", HttpStatus.BAD_REQUEST);
        }
    }

}
