package org.example.patterns.factory_method.drink_machine.drinks.tea;

import org.example.patterns.factory_method.drink_machine.drinks.Drink;

public class TeaImpl implements Drink {
    public TeaImpl() {
        System.out.println("Tea");
    }
}
