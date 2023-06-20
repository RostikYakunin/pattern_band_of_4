package org.example.patterns.creational.prototype.traine.carriages;

import org.example.patterns.creational.prototype.traine.modules.CarriageModule;
import org.example.patterns.creational.prototype.traine.modules.SittingModule;

public class SittingCarriage extends RailwayCarriage{

    public SittingCarriage() {
        super();
        this.setModules();
    }

    public SittingCarriage(int floorQuantity) {
        super(floorQuantity);
        this.setModules();
    }

    public SittingCarriage(RailwayCarriage carriage) {
        super(carriage);
        this.setModules();
    }

    public void setModules() {
        CarriageModule module = new SittingModule();
        for (int i = 0; i < this.getModulesCapacity(); i++) {
            this.getCarriageModules()[i] = module.getClone();
        }
    }

    @Override
    public RailwayCarriage getClone() {
        return new SleepingCarriage(this);
    }
}
