package org.example.patterns.creational.prototype.traine.carriages;

import org.example.patterns.creational.prototype.traine.modules.CarriageModule;
import org.example.patterns.creational.prototype.traine.modules.LuxModule;

public class LuxCarriage extends RailwayCarriage{
    public LuxCarriage() {
        super();
        this.setModules();
    }

    public LuxCarriage(int floorQuantity) {
        super(floorQuantity);
        this.setModules();
    }

    public LuxCarriage(RailwayCarriage carriage) {
        super(carriage);
        this.setModules();
    }

    public void setModules() {
        CarriageModule module = new LuxModule();
        for (int i = 0; i < this.getModulesCapacity(); i++) {
            this.getCarriageModules()[i] = module.getClone();
        }
    }

    @Override
    public RailwayCarriage getClone() {
        return new LuxCarriage(this);
    }
}
