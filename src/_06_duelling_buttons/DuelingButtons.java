package _06_duelling_buttons;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuelingButtons implements ActionListener {

	JButton leftButton = new JButton("Click me!");
	JButton rightButton = new JButton("Click me!");

	Dimension BIG = new Dimension(400, 400);
	Dimension SMALL = new Dimension(100, 100);

	JFrame frame = new JFrame("DEMANDING BUTTONS");
	JPanel panel = new JPanel();

	public void run() {
		frame.add(panel);
		frame.setVisible(true);
		leftButton.addActionListener(this);
		rightButton.addActionListener(this);
		panel.add(leftButton);
		panel.add(rightButton);
		frame.pack();
		

		// 1. Add the panel to the frame

		// 2. Make the frame visible

		// 3. Set the text of the leftButton to "Click me!"

		// 4. Set the text of the rightButton to "Click me!"

		// 5. Add an action listener to the leftButton

		// 6. Add an action listener to the rightButton

		// 7. Add the leftButton to the panel

		// 8. Add the rightButton to the panel

		// 9. Pack the frame

		// 10. Set the title of the frame to "Demanding Buttons"

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed.equals(leftButton)) {
			rightButton.setText("NO, CLICK ME!!!");
			rightButton.setPreferredSize(BIG);
			leftButton.setText("click me?");
			leftButton.setPreferredSize(SMALL);
		}
		if(buttonPressed.equals(rightButton)) {
			leftButton.setText("NO, CLICK ME!!!");
			leftButton.setPreferredSize(BIG);
			rightButton.setText("click me?");
			rightButton.setPreferredSize(SMALL);
		}

		/* If the buttonPressed was the leftButton.... */
		// Set the text of the rightButton to "No, click Me!"
		// Set the PREFERRED size of the rightButton to BIG
		// Set the text of the leftButton to "Click Me!"
		// Set the PREFERRED size of the leftButton to SMALL

		/* If the buttonPressed was the rightButton, do the opposite. */

		frame.pack();
	}
}
