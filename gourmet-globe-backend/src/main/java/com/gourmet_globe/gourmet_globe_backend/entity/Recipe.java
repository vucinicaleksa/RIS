package com.gourmet_globe.gourmet_globe_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "recipe_name")
    private String recipeName;
    @Column(name = "recipe_description")
    private String recipeDescription;
    @Column(name = "recipe_author")
    private String recipeAuthor;
    @Column(name = "recipe_country")
    private String recipeCountry;
    @Column(name = "recipe_image")
    private String recipeImage;
}