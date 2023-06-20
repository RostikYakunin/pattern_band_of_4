package org.example.patterns.creational.abstract_factory.work_place_factory.places;

import org.example.patterns.creational.abstract_factory.work_place_factory.tools.WorkTool;

public interface WorkPlace {
    void setTelephone(WorkTool tool);
    void setChair(WorkTool tool);
    void setTable(WorkTool tool);
    void setComputer(WorkTool tool);
}
