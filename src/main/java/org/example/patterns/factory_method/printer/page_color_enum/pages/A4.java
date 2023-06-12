package org.example.patterns.factory_method.printer.page_color_enum.pages;

import org.example.patterns.factory_method.printer.page_colors.PageColor;

public class A4 extends Page {
    @Override
    public void setColor(PageColor pageColor) {
        this.pageColor = pageColor;
    }
}
