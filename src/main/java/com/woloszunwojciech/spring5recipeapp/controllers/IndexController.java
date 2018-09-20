package com.woloszunwojciech.spring5recipeapp.controllers;

import com.woloszunwojciech.spring5recipeapp.domain.Category;
import com.woloszunwojciech.spring5recipeapp.domain.UnitOfMeasure;
import com.woloszunwojciech.spring5recipeapp.repositories.CategoryRepository;
import com.woloszunwojciech.spring5recipeapp.repositories.RecipeRepository;
import com.woloszunwojciech.spring5recipeapp.repositories.UnitOfMeasureRepository;
import com.woloszunwojciech.spring5recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

/*    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }*/

    /*  @RequestMapping({"","/","index"})
    public String getIndexPage(){

        Optional<Category>categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure>unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Ounce");

        System.out.println("Category id is: "+ categoryOptional.get().getId());
        System.out.println("Unit od measure id is: " + unitOfMeasureOptional.get().getId());

        return "index";
    }*/

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Getting Index page");

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
