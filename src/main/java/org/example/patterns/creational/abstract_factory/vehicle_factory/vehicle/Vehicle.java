package org.example.patterns.creational.abstract_factory.vehicle_factory.vehicle;

import org.example.patterns.creational.abstract_factory.vehicle_factory.wheel.abstracts.Gear;

public interface Vehicle {
    void setGear(Gear gear);
}
