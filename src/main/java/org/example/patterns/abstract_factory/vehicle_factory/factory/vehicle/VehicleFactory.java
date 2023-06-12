package org.example.patterns.abstract_factory.vehicle_factory.factory.vehicle;

import org.example.patterns.abstract_factory.vehicle_factory.vehicle.Vehicle;
import org.example.patterns.abstract_factory.vehicle_factory.wheel.gear_enum.GearTypeEnum;

public interface VehicleFactory {
    Vehicle createTransport (GearTypeEnum gearType);
}
