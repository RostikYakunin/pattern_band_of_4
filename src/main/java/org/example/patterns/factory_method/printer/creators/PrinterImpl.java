package org.example.patterns.factory_method.printer.creators;

import org.example.patterns.factory_method.printer.page_color_enum.PageColorImpl;
import org.example.patterns.factory_method.printer.page_color_enum.PageColorTypes;
import org.example.patterns.factory_method.printer.page_color_enum.pages.*;
import org.example.patterns.factory_method.printer.page_colors.Black;
import org.example.patterns.factory_method.printer.page_colors.Color;
import org.example.patterns.factory_method.printer.page_colors.PageColor;
import org.example.patterns.factory_method.printer.page_types_enum.PageTypes;
import org.example.patterns.factory_method.printer.page_types_enum.PageTypesImpl;


public class PrinterImpl implements Printer{
    @Override
    public Page doPrint(PageTypes pageTypes) {
        Page page = null;
        switch ((PageTypesImpl) pageTypes) {
            case A1 -> page = new A1();
            case A2 -> page = new A2();
            case A3 -> page = new A3();
            case A4 -> page = new A4();
        }

        return page;
    }

    @Override
    public Page doPrint(PageTypes pageTypes, PageColorTypes pageColorTypes) {
        Page page = doPrint(pageTypes);

        PageColor pageColor = null;
        switch ((PageColorImpl)pageColorTypes) {
            case BLACK -> pageColor = new Black();
            case COLOR -> pageColor = new Color();
        }

        page.setColor(pageColor);
        return page;
    }
}
