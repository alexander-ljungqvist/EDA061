package gui;

import java.awt.Color;

public class CurrentSlot {
	private SlotLabel currentSlot;

//	public String getName() {
//		return currentSlot.name();
//	}

	public void set(SlotLabel slotLabel) {
		currentSlot = slotLabel;
	}

	public void setWhite() {
		currentSlot.setBackground(Color.WHITE);
	}

}