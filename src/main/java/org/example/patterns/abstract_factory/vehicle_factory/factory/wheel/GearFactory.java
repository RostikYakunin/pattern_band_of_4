package org.example.patterns.abstract_factory.vehicle_factory.factory.wheel;

import org.example.patterns.abstract_factory.vehicle_factory.wheel.abstracts.Gear;

public interface GearFactory {
    Gear createWheelGear();
    Gear createCaterpillarGear();
}
