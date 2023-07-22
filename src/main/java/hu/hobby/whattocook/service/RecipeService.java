package hu.hobby.whattocook.service;


import hu.hobby.whattocook.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RecipeService {
    private RecipeRepository recipeRepository;
    private CustomUserService customUserService;

    @Autowired
    public RecipeService(RecipeRepository recipeRepository, CustomUserService customUserService) {
        this.recipeRepository = recipeRepository;
        this.customUserService = customUserService;
    }

    //TODO

}
