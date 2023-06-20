package org.example.patterns.creational.factory_method.printer.page_color_enum.pages;

import org.example.patterns.creational.factory_method.printer.page_colors.PageColor;

public class A1 extends Page{

    @Override
    public void setColor(PageColor pageColor) {
        this.pageColor = pageColor;
    }

    @Override
    public String toString() {
        return "A1{" +
                "pageColor=" + pageColor +
                '}';
    }
}
