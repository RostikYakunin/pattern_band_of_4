package org.example.patterns.creational.factory_method.drink_machine.creators.implementations;

import org.example.patterns.creational.factory_method.drink_machine.creators.DrinkCreator;
import org.example.patterns.creational.factory_method.drink_machine.drinks.Drink;
import org.example.patterns.creational.factory_method.drink_machine.drinks.tea.BlackTeaImpl;
import org.example.patterns.creational.factory_method.drink_machine.drinks.tea.GreenTeaImpl;
import org.example.patterns.creational.factory_method.drink_machine.drinks.tea.MilkOolongTeaImpl;
import org.example.patterns.creational.factory_method.drink_machine.drinks.tea.WhiteTeaImpl;
import org.example.patterns.creational.factory_method.drink_machine.drinks_type.DrinkTypes;
import org.example.patterns.creational.factory_method.drink_machine.drinks_type.enums.TeaTypesImpl;

public class TeaCreatorImpl implements DrinkCreator {

    @Override
    public Drink createDrink(DrinkTypes drinkType) {
        Drink drink = null;
        switch ((TeaTypesImpl) drinkType) {
            case BLACK ->  drink = new BlackTeaImpl();
            case GREEN -> drink = new GreenTeaImpl();
            case WHITE -> drink = new WhiteTeaImpl();
            case MILK_OOLONG -> drink = new MilkOolongTeaImpl();
        }
        return drink;
    }
}
