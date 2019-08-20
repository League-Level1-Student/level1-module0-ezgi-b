package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	Dimension BUTTON = new Dimension(80, 35);
	Dimension FRAME = new Dimension(300, 150);
	
	
	AudioClip sound; 

	
	JButton buttonOne = new JButton("One");
	JButton buttonTwo = new JButton("Two");
	JButton buttonThree = new JButton("Three");
	JButton stop = new JButton("Stop");
	
	public static void main(String[] args) {
		SoundEffectsMachine six = new SoundEffectsMachine();
		six.setUpGUI();
	}
	
	public void setUpGUI() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(FRAME);
		JPanel panel = new JPanel();
		
		
		
		buttonOne.setPreferredSize(BUTTON);
		buttonTwo.setPreferredSize(BUTTON);
		buttonThree.setPreferredSize(BUTTON);
		stop.setPreferredSize(BUTTON);
		
		buttonOne.addActionListener(this);
		buttonTwo.addActionListener(this);
		buttonThree.addActionListener(this);
		stop.addActionListener(this);
		
		
		frame.add(panel);
		panel.add(buttonOne);
		panel.add(buttonTwo);
		panel.add(buttonThree);
		panel.add(stop);
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton buttonPressed = (JButton) e.getSource();
		
		if(buttonPressed.equals(buttonOne)) {
			playSound("car-driveaway-daniel_simon.wav");
		}
		
		if(buttonPressed.equals(buttonTwo)) {
			playSound("heavy-rain-daniel_simon.wav");
		}
		
		if(buttonPressed.equals(buttonThree)) {
			playSound("labrador-barking-daniel_simon.wav");
		}
		
		if(buttonPressed==(stop)) {
			sound.stop();
		}
		
		
		
	}
	
	
	
	
	private void playSound(String fileName) {
	     
	     sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}

	
	
		
		

}
