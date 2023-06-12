package org.example.patterns.abstract_factory.vehicle_factory.factory.vehicle;

import org.example.patterns.abstract_factory.vehicle_factory.factory.wheel.GearFactory;
import org.example.patterns.abstract_factory.vehicle_factory.factory.wheel.TractorGearFactory;
import org.example.patterns.abstract_factory.vehicle_factory.vehicle.Tractor;
import org.example.patterns.abstract_factory.vehicle_factory.vehicle.Vehicle;
import org.example.patterns.abstract_factory.vehicle_factory.wheel.abstracts.Gear;
import org.example.patterns.abstract_factory.vehicle_factory.wheel.gear_enum.GearTypeEnum;

public class TractorCreatorFactory implements VehicleFactory{
    private final GearFactory factory = new TractorGearFactory();

    @Override
    public Vehicle createTransport(GearTypeEnum gearType) {
        Tractor tractor = new Tractor();
        Gear gear = null;

        switch (gearType) {
            case CATERPILLAR -> gear = factory.createCaterpillarGear();
            case WHEEL -> gear = factory.createWheelGear();
        }

        tractor.setGear(gear);
        return tractor;
    }
}
