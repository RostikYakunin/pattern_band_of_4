package org.example.patterns.creational.builder.pizza_builder;

import org.example.patterns.creational.builder.pizza_builder.builder.PizzaImpl;
import org.example.patterns.creational.builder.pizza_builder.ingredients.*;

public class Director {

    public PizzaImpl createMeatPizza (PizzaImpl.Builder builder) {
        builder.setDough(Dough.THICK);
        builder.setCheese(Cheese.MOZZARELLA, Cheese.CHEDDER);
        builder.setMeat(Meat.SMOKED_MEAT, Meat.PEPERONI, Meat.PROSHUTTO, Meat.SALAMI, Meat.BAKED_BEEF);
        builder.setSauce(Sauce.RED);
        builder.setVegetables(Vegetables.CHILI_PEPPER, Vegetables.TOMATO);
        return builder.build();
    }

    public PizzaImpl createVegetablePizza (PizzaImpl.Builder builder) {
        builder.setDough(Dough.THIN);
        builder.setCheese(Cheese.MOZZARELLA, Cheese.CHEDDER, Cheese.PARMESAN);
        builder.setMeat(Meat.PEPERONI, Meat.SALAMI);
        builder.setSauce(Sauce.WHITE);
        builder.setVegetables(Vegetables.CHILI_PEPPER, Vegetables.TOMATO, Vegetables.JALAPENO, Vegetables.BELL_PEPPER);
        return builder.build();
    }

}
