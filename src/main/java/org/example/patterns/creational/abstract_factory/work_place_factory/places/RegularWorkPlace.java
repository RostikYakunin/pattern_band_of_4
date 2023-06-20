package org.example.patterns.creational.abstract_factory.work_place_factory.places;

import org.example.patterns.creational.abstract_factory.work_place_factory.tools.WorkTool;

public class RegularWorkPlace implements WorkPlace{
    private WorkTool telephone;
    private WorkTool chair;
    private WorkTool table;
    private WorkTool computer;

    @Override
    public void setTelephone(WorkTool tool) {
        telephone= tool;
    }

    @Override
    public void setChair(WorkTool tool) {
        chair = tool;
    }

    @Override
    public void setTable(WorkTool tool) {
        table = tool;
    }

    @Override
    public void setComputer(WorkTool tool) {
        computer = tool;
    }

    public WorkTool getTelephone() {
        return telephone;
    }

    public WorkTool getChair() {
        return chair;
    }

    public WorkTool getTable() {
        return table;
    }

    public WorkTool getComputer() {
        return computer;
    }

    @Override
    public String toString() {
        return "RegularWorkPlace{" +
                "telephone=" + telephone +
                ", chair=" + chair +
                ", table=" + table +
                ", computer=" + computer +
                '}';
    }
}
