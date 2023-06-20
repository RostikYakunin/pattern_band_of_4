package org.example.patterns.creational.prototype.traine.modules;

public class SleepingModule extends CarriageModule{

    public SleepingModule() {
        super(4);
    }

    public SleepingModule(CarriageModule module) {
        super(module);
    }

    @Override
    public CarriageModule getClone() {
        return new SleepingModule(this);
    }
}
