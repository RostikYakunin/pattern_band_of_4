package org.example.patterns.creational.builder.pizza_builder.builder;

import org.example.patterns.creational.builder.pizza_builder.ingredients.*;

import java.util.Arrays;
import java.util.List;

public class PizzaImpl {
    private final Dough dough;
    private final Sauce sauce;
    private final List<Cheese> cheese;
    private final List<Meat> meat;
    private final List<Vegetables> vegetables;

    private PizzaImpl(Dough dough, Sauce sauce, List<Cheese> cheese, List<Meat> meat, List<Vegetables> vegetables) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.meat = meat;
        this.vegetables = vegetables;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", meat=" + meat +
                ", vegetables=" + vegetables +
                '}';
    }

    public static class Builder implements PizzaBuilder<PizzaImpl> {
        private Dough dough;
        private Sauce sauce;
        private List<Cheese> cheese;
        private List<Meat> meat;
        private List<Vegetables> vegetables;

        @Override
        public void setDough(Dough dough) {
            this.dough = dough;
        }

        @Override
        public void setSauce(Sauce sauce) {
            this.sauce = sauce;
        }

        @Override
        public void setCheese(Cheese... cheese) {
            this.cheese = Arrays.asList(cheese);
        }

        @Override
        public void setMeat(Meat... meat) {
            this.meat = Arrays.asList(meat);
        }

        @Override
        public void setVegetables(Vegetables... vegetables) {
            this.vegetables = Arrays.asList(vegetables);
        }

        @Override
        public PizzaImpl build() {
            return new PizzaImpl(
                    this.dough,
                    this.sauce,
                    this.cheese,
                    this.meat,
                    this.vegetables
            );
        }
    }
}
