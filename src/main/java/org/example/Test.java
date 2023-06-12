package org.example;

import org.example.patterns.abstract_factory.vehicle_factory.factory.vehicle.TankCreatorFactory;
import org.example.patterns.abstract_factory.vehicle_factory.factory.vehicle.VehicleFactory;
import org.example.patterns.abstract_factory.vehicle_factory.vehicle.Tank;
import org.example.patterns.abstract_factory.vehicle_factory.wheel.gear_enum.GearTypeEnum;
import org.example.patterns.abstract_factory.work_place_factory.factory.place_factory.DirectorWorkPlaceFactory;
import org.example.patterns.abstract_factory.work_place_factory.factory.place_factory.RegularWorkPlaceFactory;
import org.example.patterns.abstract_factory.work_place_factory.factory.place_factory.WorkPlaceFactory;
import org.example.patterns.abstract_factory.work_place_factory.places.WorkPlace;

public class Test {
    public static void main(String[] args) {
        WorkPlaceFactory factory = new RegularWorkPlaceFactory();
        System.out.println(factory.createWorkPlace());

        WorkPlaceFactory workPlaceFactory = new DirectorWorkPlaceFactory();
        System.out.println(workPlaceFactory.createWorkPlace());
    }

}