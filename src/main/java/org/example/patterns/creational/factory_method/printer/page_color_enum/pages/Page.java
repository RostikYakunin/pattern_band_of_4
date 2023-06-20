package org.example.patterns.creational.factory_method.printer.page_color_enum.pages;

import org.example.patterns.creational.factory_method.printer.page_colors.PageColor;

public abstract class Page {
    protected PageColor pageColor;

    public abstract void setColor(PageColor pageColor);
}
