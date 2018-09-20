package com.woloszunwojciech.spring5recipeapp.services;

import com.woloszunwojciech.spring5recipeapp.commands.UnitOfMeasureCommand;
import com.woloszunwojciech.spring5recipeapp.domain.UnitOfMeasure;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
