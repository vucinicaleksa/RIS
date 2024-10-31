package com.gourmet_globe.gourmet_globe_backend.repository;

import com.gourmet_globe.gourmet_globe_backend.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}