package org.example.patterns.factory_method.printer.creators;

import org.example.patterns.factory_method.printer.page_color_enum.PageColorTypes;
import org.example.patterns.factory_method.printer.page_types_enum.PageTypes;
import org.example.patterns.factory_method.printer.page_color_enum.pages.Page;

public interface Printer {
    Page doPrint (PageTypes pageTypes);

    Page doPrint (PageTypes pageTypes, PageColorTypes pageColorTypes);
}
