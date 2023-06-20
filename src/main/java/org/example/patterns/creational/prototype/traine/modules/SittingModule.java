package org.example.patterns.creational.prototype.traine.modules;

public class SittingModule extends CarriageModule{

    public SittingModule() {
        super(6);
    }

    public SittingModule(CarriageModule module) {
        super(module);
    }

    @Override
    public CarriageModule getClone() {
        return new SittingModule(this);
    }
}
