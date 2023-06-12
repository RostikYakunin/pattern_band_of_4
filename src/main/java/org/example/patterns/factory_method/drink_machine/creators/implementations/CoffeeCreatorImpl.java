package org.example.patterns.factory_method.drink_machine.creators.implementations;

import org.example.patterns.factory_method.drink_machine.creators.DrinkCreator;
import org.example.patterns.factory_method.drink_machine.drinks.Drink;
import org.example.patterns.factory_method.drink_machine.drinks.coffee.Americano;
import org.example.patterns.factory_method.drink_machine.drinks.coffee.Cappuccino;
import org.example.patterns.factory_method.drink_machine.drinks.coffee.Espresso;
import org.example.patterns.factory_method.drink_machine.drinks.coffee.Late;
import org.example.patterns.factory_method.drink_machine.drinks_type.DrinkTypes;
import org.example.patterns.factory_method.drink_machine.drinks_type.enums.CoffeeTypesImpl;

public class CoffeeCreatorImpl implements DrinkCreator {

    @Override
    public Drink createDrink(DrinkTypes drinkType) {
        Drink coffee = null;
        switch ((CoffeeTypesImpl)drinkType){
            case LATE -> coffee = new Late();
            case ESPRESSO -> coffee = new Espresso();
            case AMERICANO -> coffee = new Americano();
            case CAPPUCCINO -> coffee = new Cappuccino();
        }

        return coffee;
    }
}
