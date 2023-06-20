package org.example.patterns.creational.abstract_factory.work_place_factory.factory.tool_factory;

import org.example.patterns.creational.abstract_factory.work_place_factory.tools.WorkTool;
import org.example.patterns.creational.abstract_factory.work_place_factory.tools.tools_impl.director.DirectorChair;
import org.example.patterns.creational.abstract_factory.work_place_factory.tools.tools_impl.director.DirectorComputer;
import org.example.patterns.creational.abstract_factory.work_place_factory.tools.tools_impl.director.DirectorTable;
import org.example.patterns.creational.abstract_factory.work_place_factory.tools.tools_impl.director.DirectorTelephone;

public class DirectorToolFactory implements ToolFactory {
    @Override
    public WorkTool createTelephone() {
        return new DirectorTelephone();
    }

    @Override
    public WorkTool createComputer() {
        return new DirectorComputer();
    }

    @Override
    public WorkTool createChair() {
        return new DirectorChair();
    }

    @Override
    public WorkTool createTable() {
        return new DirectorTable();
    }
}
