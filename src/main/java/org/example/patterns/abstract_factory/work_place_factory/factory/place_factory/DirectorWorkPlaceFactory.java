package org.example.patterns.abstract_factory.work_place_factory.factory.place_factory;

import org.example.patterns.abstract_factory.work_place_factory.factory.tool_factory.DirectorToolFactory;
import org.example.patterns.abstract_factory.work_place_factory.factory.tool_factory.ToolFactory;
import org.example.patterns.abstract_factory.work_place_factory.places.DirectorWorkPlace;
import org.example.patterns.abstract_factory.work_place_factory.places.WorkPlace;

public class DirectorWorkPlaceFactory implements WorkPlaceFactory{
    private final ToolFactory toolFactory = new DirectorToolFactory();

    @Override
    public WorkPlace createWorkPlace() {
        WorkPlace workPlace = new DirectorWorkPlace();

        workPlace.setTelephone(toolFactory.createTelephone());
        workPlace.setChair(toolFactory.createChair());
        workPlace.setTable(toolFactory.createTable());
        workPlace.setComputer(toolFactory.createComputer());

        return workPlace;
    }
}
