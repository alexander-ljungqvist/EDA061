package gui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SlotLabel extends ColoredLabel implements MouseListener {
	CurrentSlot c;
	
    public SlotLabel(CurrentSlot c) {
        super("                    ", Color.WHITE, RIGHT);
        this.c = c;
        addMouseListener(this);
    }

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		c.setWhite();
		setBackground(Color.YELLOW);
		c.set(this);
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}