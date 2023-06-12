package org.example.patterns.abstract_factory.vehicle_factory.factory.wheel;

import org.example.patterns.abstract_factory.vehicle_factory.wheel.abstracts.Gear;
import org.example.patterns.abstract_factory.vehicle_factory.wheel.impl.TankCaterpillar;

public class TankGearFactory implements GearFactory {
    @Override
    public Gear createWheelGear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Gear createCaterpillarGear() {
        return new TankCaterpillar();
    }
}
