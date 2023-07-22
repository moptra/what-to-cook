package hu.hobby.whattocook.contorller;


import hu.hobby.whattocook.service.RecipeService;
import hu.hobby.whattocook.validators.RecipeCommandValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {
    private RecipeService recipeService;
    private RecipeCommandValidator recipeCommandValidator;

    @Autowired
    public RecipeController(RecipeService recipeService, RecipeCommandValidator recipeCommandValidator) {
        this.recipeService = recipeService;
        this.recipeCommandValidator = recipeCommandValidator;
    }

    @InitBinder("articleUpdateCommand")
    public void initArticleUpdateCommandBinder(WebDataBinder binder) {
        binder.addValidators(recipeCommandValidator);
    }



    //TODO

}
