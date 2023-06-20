package org.example.patterns.creational.abstract_factory.work_place_factory.factory.tool_factory;

import org.example.patterns.creational.abstract_factory.work_place_factory.tools.WorkTool;

public interface ToolFactory {
    WorkTool createTelephone ();
    WorkTool createComputer ();
    WorkTool createChair ();
    WorkTool createTable ();
}
