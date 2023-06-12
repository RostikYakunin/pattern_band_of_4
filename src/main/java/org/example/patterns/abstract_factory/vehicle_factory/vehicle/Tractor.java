package org.example.patterns.abstract_factory.vehicle_factory.vehicle;

import org.example.patterns.abstract_factory.vehicle_factory.wheel.abstracts.Gear;

public class Tractor implements Vehicle {
    Gear gear;

    @Override
    public void setGear(Gear gear) {
        this.gear = gear;
    }
}
