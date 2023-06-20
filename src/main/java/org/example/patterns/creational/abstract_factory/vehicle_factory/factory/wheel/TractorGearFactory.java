package org.example.patterns.creational.abstract_factory.vehicle_factory.factory.wheel;

import org.example.patterns.creational.abstract_factory.vehicle_factory.wheel.abstracts.Gear;
import org.example.patterns.creational.abstract_factory.vehicle_factory.wheel.impl.TractorCaterpillar;
import org.example.patterns.creational.abstract_factory.vehicle_factory.wheel.impl.TractorWheel;

public class TractorGearFactory implements GearFactory {
    @Override
    public Gear createWheelGear() {
        return new TractorWheel();
    }

    @Override
    public Gear createCaterpillarGear() {
        return new TractorCaterpillar();
    }
}
