package _07_fortune_cookie;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	Dimension COOKIE = new Dimension(300,150);
	JButton cookieButton = new JButton();
	public void showButton() {
		System.out.println("Button clicked");
		JFrame cookieFrame = new JFrame("Fortune Cookie");
		cookieFrame.setVisible(true);
		
		cookieButton.setPreferredSize(COOKIE);
		cookieFrame.add(cookieButton);
		cookieButton.addActionListener(this);
		cookieFrame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Woohooooo!!!");
		ArrayList<String> fortunes = new ArrayList<String>();
		fortunes.add("You will live to the age of 131.");
		fortunes.add("You will see the Grimm.");
		fortunes.add("You will be accepted into Hogwarts School of Witchcraft and Wizardry.");
		fortunes.add("You will have zero children.");
		fortunes.add("Your lucky number is 61283687236721128721.");
		fortunes.add("Tommorow you will win the lottery and a bird will poop on your head.");
		int rand = new Random().nextInt(6);
		for(int j = 0; j<fortunes.size();j++) {
			if(j==(rand)) {
				cookieButton.setText(fortunes.get(j));
			}
		}
		// TODO Auto-generated method stub
		
	}
}
