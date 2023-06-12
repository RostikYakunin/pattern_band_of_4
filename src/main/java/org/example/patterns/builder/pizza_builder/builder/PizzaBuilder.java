package org.example.patterns.builder.pizza_builder.builder;

import org.example.patterns.builder.pizza_builder.ingredients.*;

public interface PizzaBuilder <T> {
    void setDough(Dough dough);

    void setSauce(Sauce sauce);

    void setCheese(Cheese... cheese);

    void setMeat(Meat... meat);

    void setVegetables(Vegetables... vegetables);

    T build();
}
