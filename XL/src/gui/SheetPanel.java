package gui;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.WEST;
import model.Sheet;

public class SheetPanel extends BorderPanel {
    public SheetPanel(int rows, int columns, CurrentSlot cs, Controller c, Sheet sheet) {
    	SlotLabels sl = new SlotLabels(rows, columns, cs, c);
        add(WEST, new RowLabels(rows));
        add(CENTER, sl);
        sheet.addSlotLabels(sl);
    }
}