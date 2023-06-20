package org.example.patterns.creational.prototype.traine.modules;

public class LuxModule extends CarriageModule{
    public LuxModule() {
        super(2);
    }

    public LuxModule(CarriageModule module) {
        super(module);
    }

    @Override
    public CarriageModule getClone() {
        return new LuxModule(this);
    }
}
