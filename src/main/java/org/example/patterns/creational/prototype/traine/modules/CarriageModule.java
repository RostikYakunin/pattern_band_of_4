package org.example.patterns.creational.prototype.traine.modules;

import java.io.Serializable;
import java.util.Objects;

public abstract class CarriageModule implements Serializable {
    private int passengerCapacity;

    public CarriageModule(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public CarriageModule(CarriageModule module) {
        this.passengerCapacity = module.passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarriageModule that = (CarriageModule) o;
        return passengerCapacity == that.passengerCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerCapacity);
    }

    @Override
    public String toString() {
        return "CarriageModule{" +
                "passengerCapacity=" + passengerCapacity +
                '}';
    }

    public abstract CarriageModule getClone();
}
