package org.example.patterns.creational.abstract_factory.vehicle_factory.vehicle;

import org.example.patterns.creational.abstract_factory.vehicle_factory.wheel.abstracts.Gear;

public class Tank implements Vehicle {
    Gear gear;

    @Override
    public void setGear(Gear gear) {
        this.gear = gear;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "gear=" + gear +
                '}';
    }
}
