package com.woloszunwojciech.spring5recipeapp.services;

import com.woloszunwojciech.spring5recipeapp.commands.RecipeCommand;
import com.woloszunwojciech.spring5recipeapp.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface RecipeService {

    Set<Recipe>getRecipes();
    Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);

    RecipeCommand findCommandById(Long valueOf);

    void deleteById(Long idTodelete);
}
