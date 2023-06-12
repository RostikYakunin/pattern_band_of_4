package org.example.patterns.abstract_factory.work_place_factory.factory.place_factory;

import org.example.patterns.abstract_factory.work_place_factory.factory.tool_factory.RegularToolFactory;
import org.example.patterns.abstract_factory.work_place_factory.factory.tool_factory.ToolFactory;
import org.example.patterns.abstract_factory.work_place_factory.places.RegularWorkPlace;
import org.example.patterns.abstract_factory.work_place_factory.places.WorkPlace;

public class RegularWorkPlaceFactory implements WorkPlaceFactory{
    ToolFactory factory = new RegularToolFactory();

    @Override
    public WorkPlace createWorkPlace() {
        WorkPlace workPlace = new RegularWorkPlace();

        workPlace.setChair(factory.createChair());
        workPlace.setComputer(factory.createComputer());
        workPlace.setTable(factory.createTable());
        workPlace.setTelephone(factory.createTelephone());

        return workPlace;
    }


}
