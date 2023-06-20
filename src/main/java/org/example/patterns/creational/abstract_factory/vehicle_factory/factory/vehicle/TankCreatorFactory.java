package org.example.patterns.creational.abstract_factory.vehicle_factory.factory.vehicle;

import org.example.patterns.creational.abstract_factory.vehicle_factory.factory.wheel.GearFactory;
import org.example.patterns.creational.abstract_factory.vehicle_factory.factory.wheel.TankGearFactory;
import org.example.patterns.creational.abstract_factory.vehicle_factory.vehicle.Tank;
import org.example.patterns.creational.abstract_factory.vehicle_factory.vehicle.Vehicle;
import org.example.patterns.creational.abstract_factory.vehicle_factory.wheel.abstracts.Gear;
import org.example.patterns.creational.abstract_factory.vehicle_factory.wheel.gear_enum.GearTypeEnum;

public class TankCreatorFactory implements VehicleFactory{
    private final GearFactory factory = new TankGearFactory();

    @Override
    public Vehicle createTransport(GearTypeEnum gearType) {
        Tank tank = new Tank();
        Gear gear = null;

        switch (gearType) {
            case WHEEL -> gear = factory.createWheelGear();
            case CATERPILLAR -> gear = factory.createCaterpillarGear();
        }

        tank.setGear(gear);
        return tank;
    }
}
