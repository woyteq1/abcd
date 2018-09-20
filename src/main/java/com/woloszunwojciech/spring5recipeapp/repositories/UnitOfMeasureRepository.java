package com.woloszunwojciech.spring5recipeapp.repositories;

import com.woloszunwojciech.spring5recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {

    Optional<UnitOfMeasure>findByDescription(String description);
}
