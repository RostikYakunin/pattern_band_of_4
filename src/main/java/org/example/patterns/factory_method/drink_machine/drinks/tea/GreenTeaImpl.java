package org.example.patterns.factory_method.drink_machine.drinks.tea;

import org.example.patterns.factory_method.drink_machine.drinks.Drink;

public class GreenTeaImpl implements Drink {
    public GreenTeaImpl() {
        System.out.println("Green Tea");
    }
}
