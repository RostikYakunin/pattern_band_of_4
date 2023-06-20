package org.example.patterns.creational.prototype.traine.carriages;

import org.example.patterns.creational.prototype.traine.modules.CarriageModule;
import org.example.patterns.creational.prototype.traine.modules.SleepingModule;

import java.io.*;

public class SleepingCarriage extends RailwayCarriage {

    public SleepingCarriage() {
        super();
        this.setModules();
    }

    public SleepingCarriage(int floorQuantity) {
        super(floorQuantity);
        this.setModules();
    }

    public SleepingCarriage(RailwayCarriage carriage) {
        super(carriage);
        this.setModules();
    }

    public void setModules() {
        CarriageModule module = new SleepingModule();
        for (int i = 0; i < this.getModulesCapacity(); i++) {
            this.getCarriageModules()[i] = module.getClone();
        }
    }

    @Override
    public RailwayCarriage getClone() {
        return new SleepingCarriage(this);
    }

    public RailwayCarriage getCloneSerializable () throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);
        objectOutputStream.close();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

        return (SleepingCarriage) objectInputStream.readObject();
    }

    private SleepingCarriage setModulesToCarriage (SleepingCarriage sleepingCarriage) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);

        for (int i = 0; i < sleepingCarriage.getCarriageModules().length; i++) {
            objectOutputStream.writeObject(sleepingCarriage.getCarriageModules()[i]);
        }
        objectOutputStream.close();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

        for (int i = 0; i < sleepingCarriage.getCarriageModules().length; i++) {
            SleepingModule sleepingModule = (SleepingModule) objectInputStream.readObject();
            sleepingCarriage.getCarriageModules()[i]=sleepingModule;
        }
        objectInputStream.close();

        return sleepingCarriage;
    }
}
