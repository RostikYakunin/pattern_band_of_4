package org.example.patterns.factory_method.drink_machine.creators;

import org.example.patterns.factory_method.drink_machine.drinks.Drink;
import org.example.patterns.factory_method.drink_machine.drinks_type.DrinkTypes;

public interface DrinkCreator{
    Drink createDrink (DrinkTypes drinkType);
}
