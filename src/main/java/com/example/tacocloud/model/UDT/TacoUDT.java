package com.example.tacocloud.model.UDT;

import lombok.Data;

import java.util.List;

@Data
public class TacoUDT {
    private final String name;
    private final List<IngredientUDT> ingredients;
}
