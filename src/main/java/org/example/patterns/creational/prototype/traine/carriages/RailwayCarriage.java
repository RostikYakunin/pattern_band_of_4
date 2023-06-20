package org.example.patterns.creational.prototype.traine.carriages;

import org.example.patterns.creational.prototype.traine.modules.CarriageModule;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public abstract class RailwayCarriage implements Serializable {
    private int lavatoryQuantity;
    private int modulesCapacity;
    private int floorQuantity;
    private CarriageModule[] carriageModules;

    public RailwayCarriage() {
        this.lavatoryQuantity = 2;
        this.modulesCapacity = 9;
        this.floorQuantity = 1;
        this.carriageModules = new CarriageModule[modulesCapacity];
    }

    public RailwayCarriage(int floorQuantity) {
        if(floorQuantity>2 || floorQuantity < 0) {
            throw new RuntimeException("Floor quantity can`t be more than 2 or less than 0");
        }

        if (floorQuantity == 1) {
            this.lavatoryQuantity = 2;
            this.modulesCapacity = 9;
        } else {
            this.lavatoryQuantity = 4;
            this.modulesCapacity = 16;
        }
        this.floorQuantity = floorQuantity;
        this.carriageModules = new CarriageModule[modulesCapacity];
    }

    public RailwayCarriage(RailwayCarriage carriage) {
        this.lavatoryQuantity = carriage.getLavatoryQuantity();
        this.modulesCapacity = carriage.getModulesCapacity();
        this.floorQuantity = carriage.floorQuantity;
        this.carriageModules = carriage.getCarriageModules();
    }

    public int getLavatoryQuantity() {
        return lavatoryQuantity;
    }

    public void setLavatoryQuantity(int lavatoryQuantity) {
        this.lavatoryQuantity = lavatoryQuantity;
    }

    public int getModulesCapacity() {
        return modulesCapacity;
    }

    public void setModulesCapacity(int modulesCapacity) {
        this.modulesCapacity = modulesCapacity;
    }

    public int getFloorQuantity() {
        return floorQuantity;
    }

    public void setFloorQuantity(int floorQuantity) {
        this.floorQuantity = floorQuantity;
    }

    public CarriageModule[] getCarriageModules() {
        return carriageModules;
    }

    public void setCarriageModules(CarriageModule[] carriageModules) {
        this.carriageModules = carriageModules;
    }

    public abstract RailwayCarriage getClone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RailwayCarriage that = (RailwayCarriage) o;
        return lavatoryQuantity == that.lavatoryQuantity && modulesCapacity == that.modulesCapacity && floorQuantity == that.floorQuantity && Arrays.equals(carriageModules, that.carriageModules);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(lavatoryQuantity, modulesCapacity, floorQuantity);
        result = 31 * result + Arrays.hashCode(carriageModules);
        return result;
    }

    @Override
    public String toString() {
        return "RailwayCarriage{" +
                "lavatoryQuantity=" + lavatoryQuantity +
                ", modulesCapacity=" + modulesCapacity +
                ", floorQuantity=" + floorQuantity +
                ", carriageModules=" + Arrays.toString(carriageModules) +
                '}';
    }
}
