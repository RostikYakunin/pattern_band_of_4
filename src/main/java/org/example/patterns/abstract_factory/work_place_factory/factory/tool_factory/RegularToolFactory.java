package org.example.patterns.abstract_factory.work_place_factory.factory.tool_factory;

import org.example.patterns.abstract_factory.work_place_factory.tools.WorkTool;
import org.example.patterns.abstract_factory.work_place_factory.tools.tools_impl.regular.RegularChair;
import org.example.patterns.abstract_factory.work_place_factory.tools.tools_impl.regular.RegularComputer;
import org.example.patterns.abstract_factory.work_place_factory.tools.tools_impl.regular.RegularTable;
import org.example.patterns.abstract_factory.work_place_factory.tools.tools_impl.regular.RegularTelephone;

public class RegularToolFactory implements ToolFactory{
    @Override
    public WorkTool createTelephone() {
        return new RegularTelephone();
    }

    @Override
    public WorkTool createComputer() {
        return new RegularComputer();
    }

    @Override
    public WorkTool createChair() {
        return new RegularChair();
    }

    @Override
    public WorkTool createTable() {
        return new RegularTable();
    }
}
